package com.Logicalstatements;

import java.util.Scanner;

//WAP to print Prime numbers using for loop
public class prime {
	static boolean isprime(int n) {
		boolean status= true;
		if (n==0 || n==1) {
			status =false;
		}else {
			int i=2;
			while(i<n) {
				if (n%i==0) {
					status= false;
				}
				i++;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int t=sc.nextInt();
		int i=0;
		while(i<=t) {
			if (isprime(i)) {
				System.out.print(i +" ");
			}
			i++;
		}
		

	}

}
		