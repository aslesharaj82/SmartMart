package com.ExceptionHandleing;
import java.util.Scanner;

public class UserSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // NumberFormatException
            System.out.println("Enter your age:");
            String ageInput = sc.next();
            int age = Integer.parseInt(ageInput);

            // NullPointerException
            String name = null;
            System.out.println("Name length: " + name.length());

            // ArrayIndexOutOfBoundsException
            int marks[] = {80, 75, 90};
            System.out.println("Mark: " + marks[5]);

            // ArithmeticException
            int result = age / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
//        	e.printStackTrace();
            System.err.println("Exception occurred1: " + e);
        }catch (Exception e) {
//        	e.printStackTrace();
            System.err.println("Exception occurred: " + e);
        }
        

        sc.close();
    }
}