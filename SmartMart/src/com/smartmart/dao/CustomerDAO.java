
package com.smartmart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.smartmart.model.Customer;
import com.smartmart.util.DBConnection;

public class CustomerDAO implements CustomerDAOInterface {

    // CUSTOMER REGISTRATION
	@Override
    public boolean registerCustomer(Customer customer) {

        String sql = "INSERT INTO customers "
                + "(customer_name, email, password, phone, address) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, customer.getCustomerName());
            ps.setString(2, customer.getEmail());
            ps.setString(3, customer.getPassword());
            ps.setString(4, customer.getPhone());
            ps.setString(5, customer.getAddress());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }

        return false;
    }

    // CUSTOMER LOGIN
	@Override
    public Customer loginCustomer(String email, String password) {

        String sql = "SELECT * FROM customers WHERE email = ? AND password = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    Customer customer = new Customer();

                    customer.setCustomerId(rs.getInt("customer_id"));
                    customer.setCustomerName(rs.getString("customer_name"));
                    customer.setEmail(rs.getString("email"));
                    customer.setPassword(rs.getString("password"));
                    customer.setPhone(rs.getString("phone"));
                    customer.setAddress(rs.getString("address"));

                    return customer;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
