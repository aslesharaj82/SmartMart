package com.practice1;

import java.util.Scanner;

public class RemoveZore {
	int r=0;
	String  bin=" ";
	 void Zero(int n) { 
		for (int i=0;n!=0;n=n/10) {
		r=n%10;
		if (r!=0) {
		bin=r+bin;
		
		}
		}
		System.out.println(bin);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		RemoveZore t= new RemoveZore();
		t.Zero(n);
	
		
		
	}

}
