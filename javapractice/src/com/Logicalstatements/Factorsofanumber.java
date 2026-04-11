package com.Logicalstatements;

import java.util.Scanner;

// WAp  to print factors of a number using for loop
public class Factorsofanumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
//		int i=1;//this variable is for while loop
		factors(n);//forloop
		//FactorsUsingWhileLoop(n);//while  loop
		
	}
		
		static void factors(int n) {
		for (int i=1;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(i);
				
			}
			
		}
		System.out.println(n);

	}

		static void FactorsUsingWhileLoop(int n) {
		int i=1;
		while (i<=n/2) {
			if(n%i==0) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println(n);
	
	}
}

