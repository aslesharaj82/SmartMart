package com.atm.serviceImplementation;

import java.util.Scanner;


public class AtmMainScreen {

	public static void main(String[] args) {

		AtmInternalImplementation atm = new AtmInternalImplementation();
		Scanner sc = new Scanner(System.in);

	    while (true) {

	        System.out.println("\n===== ATM MENU =====");
	        System.out.println("1. Create Account");
	        System.out.println("2. Activate Card (Set PIN)");
	        System.out.println("3. Login");
	        System.out.println("4. Deposit");
	        System.out.println("5. Withdraw");
	        System.out.println("6. Check Balance");
	        System.out.println("7. Exit");

	        System.out.print("Enter choice: ");
	        int choice = sc.nextInt();

	        switch (choice) {

	            case 1:
	                atm.createAccount();
	                break;

	            case 2:
	                atm.changePin(); 
	                break;

	            case 3:
	                atm.login();
	                break;

	            case 4:
	                System.out.print("Enter amount: ");
	                double dep = sc.nextDouble();
	                atm.deposit(dep);
	                break;

	            case 5:
	                System.out.print("Enter amount: ");
	                double wit = sc.nextDouble();
	                atm.withdraw(wit);
	                break;

	            case 6:
	                atm.checkBalance();
	                break;

	            case 7:
	                System.out.println("Thank you for using ATM!");
	                return;

	            default:
	                System.out.println("Invalid choice!");
	        }
	    }
	}

}
