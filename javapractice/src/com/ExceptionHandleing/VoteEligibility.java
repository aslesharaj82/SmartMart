package com.ExceptionHandleing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("enter the age: ");
			int age = sc.nextInt();
			if (age<0) {
				throw new InvalidAgeException("Invalid age....!Enter the correct age ");
			}
			if (age < 18) {
				
				throw new InvalidAgeException("you are not eligible for voting");
			}else
			
			System.out.println("Eligible for voting!!!");
		} catch (InvalidAgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("INputMismatchException occured!");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
