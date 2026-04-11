package com.ExceptionHandleing;

import java.util.Scanner;

public class UsernamePassword {
	private String Username;
	private String Password;

	public static void main(String[] args) throws InvalidUserNameException, IncorrectPasswordException {
		Scanner sc = new Scanner(System.in);
		boolean status = true;
		while (status) {
			try {

				System.out.println("enter the Username: ");
				String Username = sc.next();
				if (Username.length() < 5 || Username.equals(" ") || Username.equals("$")) {
					throw new InvalidUserNameException("Invalid UserName ");
				}
				System.out.println("enter the Password: ");
				String Password = sc.next();
				if (Password.equals(" ") || Password.length() < 5) {
					throw new IncorrectPasswordException("Incorrect password Exception");

				}
			} catch (InvalidUserNameException e) {
				System.out.println(e.getMessage());
//				e.printStackTrace();
			} catch (IncorrectPasswordException e) {
				System.out.println(e.getMessage());
//				e.printStackTrace();
			}
		}

	}

}
