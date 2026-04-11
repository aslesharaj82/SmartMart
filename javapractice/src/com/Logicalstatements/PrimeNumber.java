package com.Logicalstatements;

import java.util.Scanner;

//WAP to print Prime numbers using for loop
public class PrimeNumber {
	static boolean isprime(int n) {
		boolean status= true;
		if (n==0 || n==1) {
			status =false;
		}else {
			for (int i=2;i<n;i++) {
				if (n%i==0) {
					status= false;
				}
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int t=sc.nextInt();
		
		for (int j=0;j<=t;j++) {
			if (isprime(j)) {
				System.out.print(j +" ");
			}
		}
		

	}

}
		