package com.practice1;

import java.util.Scanner;

public class DaysOfaWeek {

	public static void main(String[] args) {
		System.out.println("Mai method started");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter");
		int number=sc.nextInt();
		switch(number) {
		case 1-> System.out.println("MOnday");
		case 2-> System.out.println("Tuesday");
		case 3-> System.out.println("wednesday");
		case 4-> System.out.println("Thursday");
		case 5->System.out.println("Friday");
		case 6-> System.out.println("Saturday");
		case 7-> System.out.println("Sunday");
		default->System.out.println("Invalid");
		}
	} 

}
