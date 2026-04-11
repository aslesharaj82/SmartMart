package com.practice1;
import java.util.Scanner;

public class CheckEvenorOdd {
	 //static int a=15;

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println(" Enter the number:");
		int a=s.nextInt();
		if (a==0) {
			System.out.println("Zero is neither +ve nor -ve ");
			return;
		}
		else {
		if (a%2==0) {
			System.out.println(" Even ");
			
		}
		else
			System.out.println("Odd");

	}
	}
}
