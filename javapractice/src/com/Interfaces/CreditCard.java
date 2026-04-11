package com.Interfaces;

public class CreditCard implements Payment {

	public static void main(String[] args) {

	}

	double Balance = 10000;

	@Override
	public void payBill(double amount) {

		if (Balance > amount) {
			System.out.println("Payment Successful!! Payment Done through CreditCard ");
			Balance = Balance - amount;
			System.out.println("Balance: " + Balance);
		} else {
			System.out.println("Insufficient Balance");
		}

	}

}
