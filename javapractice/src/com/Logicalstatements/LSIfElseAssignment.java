package com.Logicalstatements;

import java.util.Scanner;

public class LSIfElseAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter age:");
		int age = sc.nextInt();
		if (age>=60) {
			 System.out.println("you are old");
		}else if(age>=36 && age<60) {
			System.out.println("you are in Middle Age");
		}else if(age>=20 && age<35) {
			System.out.println("you are in Young");
		}else if(age>=13 && age<=19) {
			System.out.println("You are Teen ");
		}else if(age>=5 && age<=12) {
			System.out.println("yor are Child");
		}else if(age>0 && age<5) {
			System.out.println("you are kid");
		}
		else {
			System.out.println("invalid age");
		}
		sc.close();

	}

}
