package com.practice1;

import java.util.Scanner;

public class factorialusingrecursion {
	static  int fact(int n) {
		if (n==0 || n==1) {
		return 1;
		}
		return n* fact(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=  sc.nextInt();
		fact(n);
	System.out.println(fact(n));

}
}
