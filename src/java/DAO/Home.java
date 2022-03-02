/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.PhongTro;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crrtt
 */
public class Home {

    public static ArrayList<PhongTro> getPhongTro() throws SQLException {
        ArrayList<PhongTro> al = new ArrayList<>();
        Connection conn = DB.DBUtilities.getConnection();
        PreparedStatement st = conn.prepareStatement("select * from phongTro where trangThai = 1");
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            PhongTro p = new PhongTro();
            p.setGiaThue(rs.getFloat("giaThue"));
            p.setIdKH(rs.getInt("idKH"));
            p.setIdPhong(rs.getInt("idPhong"));
            p.setThangThue(rs.getInt("thangThue"));
            p.setTrangThai(rs.getInt("trangThai"));
            al.add(p);
        }
        conn.close();
        return al;
    }
     public static int UpdateAnDeletePhongTro(String sqlquery) throws SQLServerException, SQLException {
        Connection cnn = DB.DBUtilities.getConnection();
        PreparedStatement stm = cnn.prepareStatement(sqlquery);
        return stm.executeUpdate();
    }

    public static ArrayList<PhongTro> InsertPhongTro(String sqlquery) throws SQLServerException, SQLException {
        ArrayList<PhongTro> arr = new ArrayList<>();
        Connection cnn = DB.DBUtilities.getConnection();
        PreparedStatement stm = cnn.prepareStatement(sqlquery);
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            PhongTro dto = new PhongTro();
            dto.setIdPhong(rs.getInt(1));
            dto.setIdKH(rs.getInt(2));
            dto.setThangThue(rs.getInt(3));
            dto.setGiaThue(rs.getFloat(4));
            dto.setTrangThai(rs.getInt(5));
            arr.add(dto);
        }
        return arr;
    }

}
