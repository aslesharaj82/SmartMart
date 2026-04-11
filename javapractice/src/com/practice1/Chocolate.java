package com.practice1;

import java.util.Scanner;

public class Chocolate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of Chocolates to be bought:");
		int NoOfChocolates = sc.nextInt();
		System.out.println("cost of each choclate: ");
		int cost = sc.nextInt();
		System.out.println("total cost: " + NoOfChocolates * cost);
		int wrappers = NoOfChocolates;
		System.out.println("wrappers: " + wrappers);
		int totalChocolate=NoOfChocolates;
		while (wrappers >= 3) {
			int count = wrappers / 3;

				wrappers = wrappers - (count * 3) + count;
				totalChocolate =totalChocolate + count;
//				wrappers= wrappers+count;

		}
		System.out.println(totalChocolate);
		System.out.println(wrappers);
		sc.close();
	}

}
