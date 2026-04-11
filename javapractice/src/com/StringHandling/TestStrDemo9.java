package com.StringHandling;
import java.util.Scanner;

public class TestStrDemo9 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter username: ");
		String user=sc.next();
		
		System.out.println("Enter password: ");
		String password=sc.nextLine();
		
		if(user.equalsIgnoreCase("Admin")&& password.equals("Admin#123")) {
			System.out.println("Login Successful.Welcome to home page!!");
		}
		else {
			System.out.println("incorrect credentials!!! Incorrect password or username !");
		}
	}

}
