package com.Interfaces;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Payment P = new CreditCard();
		Payment t = new UPIPayment();
		Scanner sc = new Scanner(System.in);
		boolean status=true;
		while(status) {
		M1(sc, P, t);
		sc.nextLine();
		System.out.println("Do u want to continue ? Continue or Cancle");
		String text = sc.nextLine();
		if(text.equalsIgnoreCase("Cancle")) {
			System.out.println("Thankyou");
		    status = false;
		   
		}else if (text.equalsIgnoreCase("Continue")) {
			System.out.println("Continuing.....!");
		}else {
			System.out.println("Invalid Input");
		}
//		String msg=text.equalsIgnoreCase( "Continue")? "continuing":  text.equalsIgnoreCase("Cancle") ? "Thank You" :
//            "Invalid input";
//		System.out.println(msg);
		}
	}

	static void M1(Scanner sc, Payment P, Payment t) {
		System.out.println("Enter Amount : ");
		int amount = sc.nextInt();
		if(amount <= 0) {
		    System.out.println("Invalid amount");
		    return;
		}
		P.payBill(amount);
		System.out.println("Enter Amount : ");
		int amount1 = sc.nextInt();
		if(amount <= 0) {
		    System.out.println("Invalid amount");
		    return;
		}
		t.payBill(amount1);
	}

}
