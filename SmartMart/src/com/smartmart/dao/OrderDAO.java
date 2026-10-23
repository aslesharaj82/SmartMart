
package com.smartmart.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.smartmart.model.OrderItem;
import com.smartmart.util.DBConnection;

public class OrderDAO implements OrderDAOInterface {

    // CHECKOUT
	@Override
    public boolean checkout(int customerId) {

        String cartSql = "SELECT c.product_id, p.product_name, "
                + "c.quantity, p.price, p.quantity AS available_stock "
                + "FROM cart c JOIN products p "
                + "ON c.product_id = p.product_id "
                + "WHERE c.customer_id = ? FOR UPDATE";

        String orderSql = "INSERT INTO orders "
                + "(customer_id, total_amount) VALUES (?, ?)";

        String itemSql = "INSERT INTO order_items "
                + "(order_id, product_id, quantity, price) "
                + "VALUES (?, ?, ?, ?)";

        String stockSql = "UPDATE products "
                + "SET quantity = quantity - ? "
                + "WHERE product_id = ? AND quantity >= ?";

        String clearCartSql = "DELETE FROM cart WHERE customer_id = ?";

        try (Connection con = DBConnection.getConnection()) {

            con.setAutoCommit(false);

            try {

                List<OrderItem> items = new ArrayList<>();
                BigDecimal total = BigDecimal.ZERO;

                // STEP 1: READ CART AND CHECK STOCK
                try (PreparedStatement ps = con.prepareStatement(cartSql)) {

                    ps.setInt(1, customerId);

                    try (ResultSet rs = ps.executeQuery()) {

                        while (rs.next()) {

                            int requestedQuantity = rs.getInt("quantity");
                            int availableStock = rs.getInt("available_stock");

                            if (requestedQuantity <= 0
                                    || requestedQuantity > availableStock) {

                                throw new SQLException(
                                        "Insufficient stock for product: "
                                                + rs.getString("product_name"));
                            }

                            OrderItem item = new OrderItem();

                            item.setProductId(rs.getInt("product_id"));
                            item.setProductName(rs.getString("product_name"));
                            item.setQuantity(requestedQuantity);
                            item.setPrice(rs.getBigDecimal("price"));

                            BigDecimal subtotal = item.getPrice()
                                    .multiply(BigDecimal.valueOf(requestedQuantity));

                            item.setSubtotal(subtotal);

                            total = total.add(subtotal);

                            items.add(item);
                        }
                    }
                }

                if (items.isEmpty()) {
                    throw new SQLException("Your cart is empty!");
                }

                // STEP 2: CREATE ORDER
                int orderId;

                try (PreparedStatement ps = con.prepareStatement(
                        orderSql, Statement.RETURN_GENERATED_KEYS)) {

                    ps.setInt(1, customerId);
                    ps.setBigDecimal(2, total);

                    ps.executeUpdate();

                    try (ResultSet keys = ps.getGeneratedKeys()) {

                        if (!keys.next()) {
                            throw new SQLException("Order ID generation failed.");
                        }

                        orderId = keys.getInt(1);
                    }
                }

                // STEP 3: INSERT ORDER ITEMS
                try (PreparedStatement ps = con.prepareStatement(itemSql)) {

                    for (OrderItem item : items) {

                        ps.setInt(1, orderId);
                        ps.setInt(2, item.getProductId());
                        ps.setInt(3, item.getQuantity());
                        ps.setBigDecimal(4, item.getPrice());

                        ps.addBatch();
                    }

                    ps.executeBatch();
                }

                // STEP 4: DEDUCT PRODUCT STOCK
                try (PreparedStatement ps = con.prepareStatement(stockSql)) {

                    for (OrderItem item : items) {

                        ps.setInt(1, item.getQuantity());
                        ps.setInt(2, item.getProductId());
                        ps.setInt(3, item.getQuantity());

                        int updated = ps.executeUpdate();

                        if (updated == 0) {
                            throw new SQLException("Stock update failed.");
                        }
                    }
                }

                // STEP 5: CLEAR CUSTOMER CART
                try (PreparedStatement ps = con.prepareStatement(clearCartSql)) {

                    ps.setInt(1, customerId);
                    ps.executeUpdate();
                }

                // STEP 6: COMMIT TRANSACTION
                con.commit();

                // PRINT BILL
                System.out.println("\n========== SMARTMART BILL ==========");
                System.out.println("Order ID: " + orderId);
                System.out.println("------------------------------------");

                for (OrderItem item : items) {

                    System.out.println(item.getProductName()
                            + " | Quantity: " + item.getQuantity()
                            + " | Price: " + item.getPrice()
                            + " | Subtotal: " + item.getSubtotal());
                }

                System.out.println("------------------------------------");
                System.out.println("Total Amount: Rs. " + total);
                System.out.println("Order Status: PLACED");
                System.out.println("Thank you for shopping!");
                System.out.println("====================================");

                return true;

            } catch (SQLException e) {

                con.rollback();

                System.out.println("Checkout failed: " + e.getMessage());
                System.out.println("Transaction rolled back.");

                return false;

            } finally {

                con.setAutoCommit(true);
            }

        } catch (SQLException e) {

            System.out.println("Database error: " + e.getMessage());
            return false;
        }
    }

    // CUSTOMER ORDER HISTORY
	@Override
    public void viewOrderHistory(int customerId) {

        String sql = "SELECT * FROM orders "
                + "WHERE customer_id = ? ORDER BY order_date DESC";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, customerId);

            try (ResultSet rs = ps.executeQuery()) {

                System.out.println("\n========== ORDER HISTORY ==========");

                boolean found = false;

                while (rs.next()) {

                    found = true;

                    System.out.println("Order ID: " + rs.getInt("order_id"));
                    System.out.println("Date: " + rs.getTimestamp("order_date"));
                    System.out.println("Amount: Rs. "
                            + rs.getBigDecimal("total_amount"));
                    System.out.println("Status: "
                            + rs.getString("order_status"));
                    System.out.println("-----------------------------------");
                }

                if (!found) {
                    System.out.println("No orders found.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
