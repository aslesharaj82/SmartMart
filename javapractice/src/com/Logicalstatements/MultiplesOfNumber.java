package com.Logicalstatements;

import java.util.Scanner;
//WAP to print multiples of a number using for loop and while loop
public class MultiplesOfNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number: ");
		int n= sc.nextInt();
		System.out.println("enter a number: ");
		int r= sc.nextInt();
//		for (int i=1;i<=r;i++) {
//			System.out.println(n + "X" + i + "=" + n*i);
//		}
		int i=1;
		while(i<=r) {
			System.out.println(n + "X" + i + "=" + n*i);
			i++;
			
		}
		
	}

}
