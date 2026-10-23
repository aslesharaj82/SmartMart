
package com.smartmart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.smartmart.util.DBConnection;

public class CartDAO implements CartDAOInterface {

    // ADD PRODUCT TO CART
	@Override
    public boolean addToCart(int customerId, int productId, int quantity) {

        String sql = "INSERT INTO cart (customer_id, product_id, quantity) "
                + "SELECT ?, product_id, ? FROM products "
                + "WHERE product_id = ? AND quantity >= ? "
                + "ON DUPLICATE KEY UPDATE quantity = cart.quantity + ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, customerId);
            ps.setInt(2, quantity);
            ps.setInt(3, productId);
            ps.setInt(4, quantity);
            ps.setInt(5, quantity);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // VIEW CART
	@Override
    public void viewCart(int customerId) {

        String sql = "SELECT c.product_id, p.product_name, p.price, "
                + "c.quantity, (p.price * c.quantity) AS subtotal "
                + "FROM cart c JOIN products p ON c.product_id = p.product_id "
                + "WHERE c.customer_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, customerId);

            try (ResultSet rs = ps.executeQuery()) {

                System.out.println("\n========== YOUR CART ==========");

                BigDecimalTotal total = new BigDecimalTotal();

                while (rs.next()) {

                    System.out.println("Product ID: " + rs.getInt("product_id"));
                    System.out.println("Product: " + rs.getString("product_name"));
                    System.out.println("Price: " + rs.getBigDecimal("price"));
                    System.out.println("Quantity: " + rs.getInt("quantity"));
                    System.out.println("Subtotal: " + rs.getBigDecimal("subtotal"));
                    System.out.println("-------------------------------");

                    total.add(rs.getBigDecimal("subtotal"));
                }

                System.out.println("Total Amount: " + total.getTotal());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE CART QUANTITY
	@Override
    public boolean updateCart(int customerId, int productId, int quantity) {

        String sql = "UPDATE cart c JOIN products p "
                + "ON c.product_id = p.product_id "
                + "SET c.quantity = ? "
                + "WHERE c.customer_id = ? AND c.product_id = ? "
                + "AND ? > 0 AND p.quantity >= ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, quantity);
            ps.setInt(2, customerId);
            ps.setInt(3, productId);
            ps.setInt(4, quantity);
            ps.setInt(5, quantity);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // REMOVE PRODUCT FROM CART
	@Override
    public boolean removeFromCart(int customerId, int productId) {

        String sql = "DELETE FROM cart WHERE customer_id = ? AND product_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, customerId);
            ps.setInt(2, productId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // HELPER CLASS FOR TOTAL
	
    private static class BigDecimalTotal {

        private java.math.BigDecimal total = java.math.BigDecimal.ZERO;

        public void add(java.math.BigDecimal amount) {
            total = total.add(amount);
        }

        public java.math.BigDecimal getTotal() {
            return total;
        }
    }
}
