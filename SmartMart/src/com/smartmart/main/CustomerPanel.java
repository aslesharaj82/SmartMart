
package com.smartmart.main;

import java.util.Scanner;

import com.smartmart.model.Customer;
import com.smartmart.service.CustomerService;

public class CustomerPanel {

    public static Customer showMenu(Scanner sc) {

        CustomerService service = new CustomerService();

        while (true) {

            System.out.println("\n===== CUSTOMER MENU =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Back");

            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    Customer customer = new Customer();

                    System.out.print("Enter Name: ");
                    customer.setCustomerName(sc.nextLine());

                    System.out.print("Enter Email: ");
                    customer.setEmail(sc.nextLine());

                    System.out.print("Enter Password: ");
                    customer.setPassword(sc.nextLine());

                    System.out.print("Enter Phone: ");
                    customer.setPhone(sc.nextLine());

                    System.out.print("Enter Address: ");
                    customer.setAddress(sc.nextLine());

                    if (service.registerCustomer(customer)) {
                        System.out.println("Registration successful! Please login.");
                    } else {
                        System.out.println("Registration failed. Check your details.");
                    }

                    break;

                case 2:

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String password = sc.nextLine();

                    Customer loggedIn = service.loginCustomer(email, password);

                    if (loggedIn != null) {
                        System.out.println("Welcome, " + loggedIn.getCustomerName() + "!");
                        return loggedIn;
                    } else {
                        System.out.println("Invalid email or password.");
                    }

                    break;

                case 3:
                    return null;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
