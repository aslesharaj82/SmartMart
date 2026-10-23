
package com.smartmart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.smartmart.model.Product;
import com.smartmart.util.DBConnection;

public class ProductDAO  implements ProductDAOInterface{

    // ADD PRODUCT
    public boolean addProduct(Product p) {

        String sql = "INSERT INTO products "
                + "(product_name, description, price, quantity, category) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, p.getProductName());
            ps.setString(2, p.getDescription());
            ps.setDouble(3, p.getPrice());
            ps.setInt(4, p.getQuantity());
            ps.setString(5, p.getCategory());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // VIEW ALL PRODUCTS
    public void viewProducts() {

        String sql = "SELECT * FROM products";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("\n--------- PRODUCT LIST ---------");

            while (rs.next()) {

                System.out.println("Product ID: " + rs.getInt("product_id"));
                System.out.println("Name: " + rs.getString("product_name"));
                System.out.println("Description: " + rs.getString("description"));
                System.out.println("Price: " + rs.getDouble("price"));
                System.out.println("Quantity: " + rs.getInt("quantity"));
                System.out.println("Category: " + rs.getString("category"));
                System.out.println("--------------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE PRODUCT
    public boolean updateProduct(Product p) {

        String sql = "UPDATE products SET product_name=?, description=?, "
                + "price=?, quantity=?, category=? WHERE product_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, p.getProductName());
            ps.setString(2, p.getDescription());
            ps.setDouble(3, p.getPrice());
            ps.setInt(4, p.getQuantity());
            ps.setString(5, p.getCategory());
            ps.setInt(6, p.getProductId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // DELETE PRODUCT
    public boolean deleteProduct(int productId) {

        String sql = "DELETE FROM products WHERE product_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, productId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
