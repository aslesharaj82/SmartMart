package com.practice1;

import java.util.Scanner;

public class PerfectNumbersUsingWhileLoop {
	static boolean Isperfect(int n) {
		boolean status =false;
		int sum=0;
		int i=1;
	while(i<=n/2) {
		if (n%i==0) {
			sum=sum+i;
		}
		i++;
	
	}
	
	if (sum==n) {
		status=true;
		 
	}
	else {
		status= false;
	}
	return status;
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number: ");
		int n= sc.nextInt();
		boolean f=Isperfect(n);
		if (f) 
		{
			System.out.println("perfect");
		}else 
		{
			System.out.println("not perfect");
		}
		
		
	}
		
}
