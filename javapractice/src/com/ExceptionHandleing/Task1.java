package com.ExceptionHandleing;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		Scanner sc = new Scanner(System.in);
		boolean status = true;
		
		while (status) {
			try {
				System.out.println("enter the index number: ");
				int index = sc.nextInt();
				System.out.println(arr[index]);
				System.out.println("Enter a number in String format");
				String StrNUm = sc.next();
				int StrNum = Integer.parseInt(StrNUm);
		
				int result = arr[index] / StrNum;
				System.out.println("Result : " + result);
				status = false;
			} catch (ArrayIndexOutOfBoundsException a) {
				System.out.println("ArrayIndexOutOfBoundsException...! " + "\n" + "Please Enter The correct NUmber.");

			} catch (NumberFormatException n) {
				System.out.println("NumberFormatException....!" + "\n" + " Cannot convert String to Integer.");
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException.....!" + "\n" + "Please Enter The correct NUmber.");
			}
			catch (InputMismatchException i) {
				System.out.println("InputMismatchException...!"+"\n"+"Enter the correct Input index.");
				sc.next();
			}
		}
		sc.close();
	}

}
