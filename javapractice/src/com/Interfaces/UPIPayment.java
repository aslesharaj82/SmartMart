package com.Interfaces;

public class UPIPayment implements Payment {

	public static void main(String[] args) {

	}

	double Balance = 10000;

	@Override
	public void payBill(double amount) {
		

		if (amount <= Balance) {
			System.out.println("Payment Successful!!! Done through UPI");
			Balance = Balance - amount;
			System.out.println("Balance: " + Balance);
		} else {
			System.out.println("Insufficient Balance");
		}
	}

}
