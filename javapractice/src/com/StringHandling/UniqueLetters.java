package com.StringHandling;

import java.util.Scanner;

public class UniqueLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String n = sc.nextLine();
		boolean[] a = new boolean[n.length()];
		for (int i = 0; i < n.length(); i++) {
			int count = 1;
			if (a[i]) {
				continue;
			}
			for (int j = i + 1; j < n.length(); j++) {
				if (n.charAt(i) == n.charAt(j)) {
					count++;
//					a[i] = true;
					a[j] = true;
				}
				
			}
			if (count == 1) {
				System.out.println(n.charAt(i));
			}
		}

	}

}
