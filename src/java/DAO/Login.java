/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.ChuNha;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 84915
 */
public class Login {

    public static boolean Login(String username, String password) throws SQLServerException, SQLException {
        boolean loginStatus = false;
        Connection conn = DB.DBContext.getConnection();
        PreparedStatement st = conn.prepareStatement("select * from chuNha where username = ? and password = ?");
        st.setString(1, username);
        st.setString(2, password);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            loginStatus = true;
        }
        conn.close();
        return loginStatus;
    }
    
}
