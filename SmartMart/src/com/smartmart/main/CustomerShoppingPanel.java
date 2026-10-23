
package com.smartmart.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.smartmart.service.OrderService;

import com.smartmart.dao.CartDAO;
import com.smartmart.model.Customer;
import com.smartmart.util.DBConnection;

public class CustomerShoppingPanel {

    public static void showMenu(Scanner sc, Customer customer) {

        CartDAO cartDAO = new CartDAO();
        OrderService orderService = new OrderService();

        while (true) {

            System.out.println("\n===== SMARTMART SHOPPING =====");
            System.out.println("Welcome, " + customer.getCustomerName());
            System.out.println("1. Browse Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Update Cart Quantity");
            System.out.println("5. Remove Product from Cart");
            System.out.println("6. Checkout");
            System.out.println("7. Order History");
            System.out.println("8. Logout");

            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    browseProducts();
                    break;

                case 2:

                    System.out.print("Enter Product ID: ");
                    int productId = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Quantity: ");
                    int quantity = Integer.parseInt(sc.nextLine());

                    if (quantity > 0 && cartDAO.addToCart(
                            customer.getCustomerId(), productId, quantity)) {
                        System.out.println("Product added to cart!");
                    } else {
                        System.out.println("Unable to add product. Check product ID and stock.");
                    }

                    break;

                case 3:
                    cartDAO.viewCart(customer.getCustomerId());
                    break;

                case 4:

                    System.out.print("Enter Product ID: ");
                    int updateId = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter New Quantity: ");
                    int newQuantity = Integer.parseInt(sc.nextLine());

                    if (cartDAO.updateCart(customer.getCustomerId(),
                            updateId, newQuantity)) {
                        System.out.println("Cart updated successfully!");
                    } else {
                        System.out.println("Unable to update cart.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Product ID: ");
                    int removeId = Integer.parseInt(sc.nextLine());

                    if (cartDAO.removeFromCart(customer.getCustomerId(), removeId)) {
                        System.out.println("Product removed from cart!");
                    } else {
                        System.out.println("Product not found in cart.");
                    }

                    break;

                case 6:

                    boolean ordered = orderService.checkout(
                            customer.getCustomerId());

                    if (!ordered) {
                        System.out.println("Please check your cart and try again.");
                    }

                    break;

                case 7:

                    orderService.viewOrderHistory(
                            customer.getCustomerId());

                    break;

                case 8:
                    System.out.println("Customer logged out.");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // DISPLAY AVAILABLE PRODUCTS
    private static void browseProducts() {

        String sql = "SELECT * FROM products WHERE quantity > 0";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("\n========== AVAILABLE PRODUCTS ==========");

            while (rs.next()) {

                System.out.println("ID: " + rs.getInt("product_id"));
                System.out.println("Name: " + rs.getString("product_name"));
                System.out.println("Price: " + rs.getBigDecimal("price"));
                System.out.println("Available Stock: " + rs.getInt("quantity"));
                System.out.println("Category: " + rs.getString("category"));
                System.out.println("----------------------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
