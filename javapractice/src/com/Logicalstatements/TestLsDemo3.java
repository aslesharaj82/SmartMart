package com.Logicalstatements;

import java.util.Scanner;

public class TestLsDemo3 {
	//if else

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		double marksPercentage= sc.nextDouble();
		
		if (marksPercentage>100 || marksPercentage<0) 
		{
			System.out.println("Invalid Marks");
		}
		else if (marksPercentage>=90)
		{
			System.out.println("Grade A");
		}
		else if(marksPercentage>=80)
		{
			System.out.println("Grade B");
		}
		else if (marksPercentage>=70)
		{
			System.out.println("Grade C");
		}
		else if (marksPercentage>=60)
		{
			System.out.println("Grade D");
		
		}
		else if(marksPercentage>=35)
		{
			System.out.println("Just Pass");
		}
		else 
		{
			System.out.println("you are fail");
		}	
		sc.close();

	}

}
