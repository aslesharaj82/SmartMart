package com.practice1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int result =1;
		for (int i=1; i<=number;i++) {
			result = result*i;		
		}
		System.out.println(result);
	}

}
