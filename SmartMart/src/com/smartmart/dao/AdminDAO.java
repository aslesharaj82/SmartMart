
package com.smartmart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.smartmart.model.Admin;
import com.smartmart.util.DBConnection;

public class AdminDAO implements AdminDAOInterface {

    public boolean login(String username, String password) {

        String query = "SELECT * FROM admin WHERE username = ? AND password = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, username);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    System.out.println("Admin login successful!");

                    Admin admin = new Admin();
                    admin.setAdminId(rs.getInt("admin_id"));
                    admin.setUsername(rs.getString("username"));
                    admin.setPassword(rs.getString("password"));

                    return true;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Invalid username or password!");
        return false;
    }
}
