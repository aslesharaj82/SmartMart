package com.Interfaces;

import java.util.Scanner;

public class LibraryManagementSystem {

	String BookName;
	int BookId;
	String BookDetails;
	

	LibraryManagementSystem(int BookId, String BookName) {
		this.BookId = BookId;
		this.BookName = BookName;
		System.out.println(BookId + " " + BookName);

	}

	static void BOOKDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book Id:");
		int BookId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the book name:");
		String BookName = sc.nextLine();
		LibraryManagementSystem t = new LibraryManagementSystem(BookId, BookName);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {

			BOOKDetails();
			System.out.println("Do you want to add another book? (yes/no)");
			String choice = sc.nextLine();

			if (choice.equalsIgnoreCase("no")) {
				break;
			}

		}

	}

}
