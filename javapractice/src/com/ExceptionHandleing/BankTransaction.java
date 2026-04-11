package com.ExceptionHandleing;

import java.util.Scanner;

public class BankTransaction implements BankTransaction1 {

	static double Balance = 10000;

	public static void main(String[] args) throws InsufficientAmount, INvalidAmount {
		BankTransaction t = new BankTransaction();
		boolean status = true;
		Scanner sc = new Scanner(System.in);
		while (status) {
			System.out.println("Enter the withdrawl amount: ");
			double Amount = sc.nextInt();
			try {
				t.withdraw(Amount);
				status=false;
			} catch (InsufficientAmount e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("Enter the correct Amount...");
			} catch (INvalidAmount e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("Enter the correct Amount...");
			}
			
			System.out.println("DO u want to continue....? yes/no");
			String g=sc.next();
			
			if(g.equalsIgnoreCase("no")) {
				status=false;
				System.out.println("Thank you for Banking here...!");
			}else
			status=true;
		}
		sc.close();
	}

	@Override
	public void withdraw(double Amount) throws InsufficientAmount, INvalidAmount {

		if (Amount <= 0) {
			throw new INvalidAmount("INvalid Amount Entered...!");

		} else if (Amount > Balance) {
			throw new InsufficientAmount("Insufficient Balance...!");
		}
		Balance= Balance - Amount;
		System.out.println("Withdrawl Successful!!!!" + "\n" + "Balance = " + (Balance));

	}
	

}
