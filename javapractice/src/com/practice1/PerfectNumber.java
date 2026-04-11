package com.practice1;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number: ");
		int n= sc.nextInt();
		int temp=n;
		int sum=0;
		for (int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		} 
		if(sum==temp) {
			System.out.println("perfect");
		}else
		{
			System.out.println("Not Perfect");
		}
	}

}
