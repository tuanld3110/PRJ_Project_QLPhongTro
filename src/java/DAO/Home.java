/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.KhachHang;
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
        PreparedStatement st = conn.prepareStatement("select * from phongTro");
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

    public static ArrayList<PhongTro> getPhongTroByID(int id) throws SQLException {
        ArrayList<PhongTro> al = new ArrayList<>();
        try {
            Connection conn = DB.DBUtilities.getConnection();
            PreparedStatement st = conn.prepareStatement("select * from phongTro where idPhong = " + id);
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
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }

    public static ArrayList<KhachHang> getKhachHang() throws SQLException {
        ArrayList<KhachHang> al = new ArrayList<>();
        Connection conn = DB.DBUtilities.getConnection();
        PreparedStatement st = conn.prepareStatement("select * from khachHang");
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            KhachHang p = new KhachHang();
            p.setIdKH(rs.getInt("idKH"));
            p.setTenKH(rs.getString("tenKH"));
            p.setSDT(rs.getString("SDT"));
            p.setCMND(rs.getString("CMND"));
            p.setGioiTinh(rs.getInt("gioiTinh"));
            al.add(p);
        }
        conn.close();
        return al;
    }

    public static ArrayList<KhachHang> getKhachHangByID(int id) throws SQLException {
        ArrayList<KhachHang> al = new ArrayList<>();
        Connection conn = DB.DBUtilities.getConnection();
        PreparedStatement st = conn.prepareStatement("select * from khachHang where idKH = " + id);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            KhachHang p = new KhachHang();
            p.setIdKH(rs.getInt("idKH"));
            p.setTenKH(rs.getString("tenKH"));
            p.setSDT(rs.getString("SDT"));
            p.setCMND(rs.getString("CMND"));
            p.setGioiTinh(rs.getInt("gioiTinh"));
            al.add(p);
        }
        conn.close();
        return al;
    }

    public static int DeletePhongTro(String sqlquery) throws SQLServerException, SQLException {
        Connection cnn = DB.DBUtilities.getConnection();
        PreparedStatement stm = cnn.prepareStatement(sqlquery);
        return stm.executeUpdate();
    }

    public static int UpdatePhongTro(PhongTro dto) throws SQLServerException, SQLException {
        Connection cnn = DB.DBUtilities.getConnection();
        PreparedStatement stm = null;
        if (dto.getIdKH() != 0) {
            stm = cnn.prepareStatement("UPDATE phongTro SET idKH='" + dto.getIdKH() + "',giaThue='" + dto.getGiaThue() + "' WHERE idPhong = '" + dto.getIdPhong() + "'");
        }else{
            stm = cnn.prepareStatement("UPDATE phongTro SET idKH= cast(NULL as int),giaThue='" + dto.getGiaThue() +"', trangThai='" + dto.getTrangThai()+ "' WHERE idPhong = '" + dto.getIdPhong() + "'");
        }
        return stm.executeUpdate();
    }

    public static int InsertPhongTro(PhongTro dto) throws SQLServerException, SQLException {
        Connection cnn = DB.DBUtilities.getConnection();
        PreparedStatement stm = cnn.prepareStatement("INSERT INTO phongTro (idKH,thangThue,giaThue,trangThai) VALUES(?,?,?,?)");
        stm.setInt(1, dto.getIdKH());
        stm.setInt(2, dto.getThangThue());
        stm.setFloat(3, dto.getGiaThue());
        stm.setInt(4, 1);
        return stm.executeUpdate();
    }

}
