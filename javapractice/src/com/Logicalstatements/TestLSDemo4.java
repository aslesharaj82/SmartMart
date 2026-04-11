package com.Logicalstatements;

import java.util.Scanner;

public class TestLSDemo4 {
//nested if else
	public static void main(String[] args) {
	System.out.println("Welcome to Matrimonial!!");
	Scanner sc= new Scanner(System.in);
	System.out.println("What is your name?");
	String name= sc.next();
	
	System.out.println("Okay Mr: " + name +": Shall we start the conversation...?");
	System.out.println("Can you Plese enter your assets And Salary info:");
	double assets=sc.nextDouble();
	System.out.println("Salary Also..?");
	double Salary = sc.nextDouble();
	if (assets>50000000 && Salary>= 2500000) {
		System.out.println("Oh..! Okay..!");
		System.out.println("Can you Plz enter your Age:");
		int age= sc.nextInt();
		if (age>=21 && age<30) {
			System.out.println("Oh Nice !!");
			System.out.println("Enter your weight and height");
			double weight= sc.nextDouble();
			System.out.println("Height Also..?");
			double height=sc.nextDouble();
			if(weight>=40 || weight<=70 || height>=5.3 || height<=6.2) {
				System.out.println("Okay! your Profole is Almost Matching to our requirements, we Have Few More questions");
				System.out.println("Do you Drink ?");
				boolean Drink=sc.nextBoolean();
				System.out.println("Do you Smoke ?");
				boolean Smoke = sc.nextBoolean();
				if (Drink && Smoke) {
					System.out.println("Nice!! we will contant you!!");
				}else
				{
					System.out.println("You can proceed with another Profile");
				}
			}else {
				System.out.println("Better go to Gym !! or you are too Short");
			}
		}else
		{
			System.out.println("your Age is Not Matching the Criteria");
		}
	}else {
		System.out.println("Better Luck next time");
	}

	}

}
