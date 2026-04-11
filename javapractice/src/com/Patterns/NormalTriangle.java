package com.Patterns;

import java.util.Scanner;

public class NormalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < (n-1) - i; k++) {
				System.out.print("-" +" ");
			}
			
			for (int j = 1; j <= (i * 2) + 1; j++) {
				System.out.print("*" + " ");

			}
			System.out.println();
		}

	}

}
