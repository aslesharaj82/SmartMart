package com.ExceptionHandleing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean status = true;
		while (status) {
			try {
				System.out.println(" enter the number a: ");
				Integer a = sc.nextInt();
				System.out.println("Enter the number b: ");
				Integer b = sc.nextInt();

				int result = a / b;
				System.out.println(result);

			} catch (ArithmeticException Arthematic) {
				System.out.println("Arthmatic Exception"+Arthematic);
				Arthematic.printStackTrace();
			} catch (InputMismatchException InputMismatchException) {
				System.out.println("input not matched");
				InputMismatchException.printStackTrace();
			}
			try {

				String s1 = null;
				System.out.println(s1.length());
			} catch (NullPointerException N) {

				System.out.println("Null pointer Exception");
				N.printStackTrace();
			}
			System.out.println("Do u want to continue..?");
			sc.nextLine();
			String s = sc.nextLine();
			if (s.equalsIgnoreCase("no")) {
				status = false;
				System.out.println("program closed");
				break;
			} else if (s.equalsIgnoreCase("yes")) {
				status = true;
			}
			String s1 = null;
			System.out.println(s1.length());

		}

	}

}
