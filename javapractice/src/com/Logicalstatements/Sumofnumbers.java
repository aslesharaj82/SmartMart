package com.Logicalstatements;

import java.util.Scanner;
//wap to find sum of digits in a number using while loop
public class Sumofnumbers {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:- ");
     	int  n=sc.nextInt();
		int rem;
		int sum=0;
		while (n!=0) {
			rem=n%10;  // 3-----2------1
			n=n/10;//12-----1------0
			sum=sum+rem;//0+3-----3+2-------5+1=6
		}
		System.out.println(sum);
	}
}


