
package com.smartmart.main;

import java.util.Scanner;
import com.smartmart.service.AdminService;
import com.smartmart.service.AdminServiceInterface;
import com.smartmart.model.Customer;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n========== SMARTMART ==========");
            System.out.println("1. Admin Login");
            System.out.println("2. Customer");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    System.out.print("Admin Username: ");
                    String username = sc.nextLine();

                    System.out.print("Admin Password: ");
                    String password = sc.nextLine();

                    AdminServiceInterface adminService = new AdminService();

                    if (adminService.login(username, password)) {
                        AdminPanel.showMenu(sc);
                    } else {
                        System.out.println("Admin login failed!");
                    }

                    break;

                case 2:

                    Customer customer = CustomerPanel.showMenu(sc);

                    if (customer != null) {
                        CustomerShoppingPanel.showMenu(sc, customer);
                    }

                    break;

                case 3:
                    System.out.println("Thank you for using SmartMart!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
