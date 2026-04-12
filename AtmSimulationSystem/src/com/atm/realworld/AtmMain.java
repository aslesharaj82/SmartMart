package com.atm.realworld;

import java.util.Scanner;
import com.atm.serviceImplementation.AtmInternalImplementation;

public class AtmMain {

    public static void main(String[] args) {

        AtmInternalImplementation atm = new AtmInternalImplementation();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Activate Card (Set PIN)");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");

            try {
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                // Invalid choice check
                if (choice < 1 || choice > 6) {
                    System.out.println("Invalid choice!");
                    continue;
                }

                switch (choice) {

                    case 1:
                        atm.createAccount();
                        break;

                    case 2:
                        atm.changePin();
                        break;

                    case 3:
                        atm.deposit(); // amount handled inside
                        break;

                    case 4:
                        atm.withdraw(); // amount handled inside
                        break;

                    case 5:
                        atm.checkBalance();
                        break;

                    case 6:
                        System.out.println("Thank you for using ATM!");
                        return;
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.next(); // clear invalid input
            }
        }
    }
}