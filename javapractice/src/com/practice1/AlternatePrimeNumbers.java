package com.practice1;

import java.util.Scanner;

public class AlternatePrimeNumbers {
	static boolean isprime(int n) {

		boolean status = true;
		if (n == 0 || n == 1) {
			status = false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					status = false;
				}
			}
		}
		return status;
	}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int t = sc.nextInt();
		int count = 0;
		for (int i = 0; i <= t; i++) {
			boolean m = isprime(i);
			if (m) {
				count++;
				if (count % 2 != 0) {

					System.out.print(i + " ");

				}

			}
		}
	}

}
