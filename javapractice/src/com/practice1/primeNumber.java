package com.practice1;

import java.util.Scanner;

public class primeNumber {
	static boolean isprime(int i) {
		boolean status= true;
		if(i==0 || i==1) {
			return false;
		}
		for( int j=2;j<i;j++) {
			if (i%j==0) {
				return false;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		int i=0;
		for (;i<n;i++) {
		if (isprime(i)) {
			System.out.print(i+" ");
		}
		}
	}

}
