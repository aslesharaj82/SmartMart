
package com.smartmart.main;

import java.util.Scanner;

import com.smartmart.model.Product;
import com.smartmart.service.AdminService;

public class AdminPanel {

    public static void showMenu(Scanner sc) {

        AdminService service = new AdminService();

        while (true) {

            System.out.println("\n===== ADMIN PANEL =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Logout");

            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    Product p = new Product();

                    System.out.print("Product Name: ");
                    p.setProductName(sc.nextLine());

                    System.out.print("Description: ");
                    p.setDescription(sc.nextLine());

                    System.out.print("Price: ");
                    p.setPrice(Double.parseDouble(sc.nextLine()));

                    System.out.print("Quantity: ");
                    p.setQuantity(Integer.parseInt(sc.nextLine()));

                    System.out.print("Category: ");
                    p.setCategory(sc.nextLine());

                    if (service.addProduct(p)) {
                        System.out.println("Product added successfully!");
                    } else {
                        System.out.println("Failed to add product.");
                    }
                    break;

                case 2:
                    service.viewProducts();
                    break;

                case 3:
                    Product update = new Product();

                    System.out.print("Enter Product ID: ");
                    update.setProductId(Integer.parseInt(sc.nextLine()));

                    System.out.print("New Product Name: ");
                    update.setProductName(sc.nextLine());

                    System.out.print("New Description: ");
                    update.setDescription(sc.nextLine());

                    System.out.print("New Price: ");
                    update.setPrice(Double.parseDouble(sc.nextLine()));

                    System.out.print("New Quantity: ");
                    update.setQuantity(Integer.parseInt(sc.nextLine()));

                    System.out.print("New Category: ");
                    update.setCategory(sc.nextLine());

                    if (service.updateProduct(update)) {
                        System.out.println("Product updated successfully!");
                    } else {
                        System.out.println("Product not found or update failed.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Product ID to delete: ");
                    int id = Integer.parseInt(sc.nextLine());

                    if (service.deleteProduct(id)) {
                        System.out.println("Product deleted successfully!");
                    } else {
                        System.out.println("Product not found or delete failed.");
                    }
                    break;

                case 5:
                    System.out.println("Admin logged out.");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
