package com.StringHandling;

import java.util.Scanner;

public class FirstnonRepeatingElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enther the String: ");
		String n = sc.next();// aaabbccccd
		int size = n.length();
		boolean[] a = new boolean[size];
		for (int i = 0; i < size; i++) {
			int count = 1;
			if (a[i]) {
				continue;
			}
				for (int j = i+1 ; j < size; j++) {
//	    		System.out.println(n.charAt(i)==n.charAt(j));
					if (n.charAt(i) != n.charAt(j)) {// a!a a!a a!b
						continue;
					} else {
//						a[i] = true;
						a[j]=true;
						count++; // 3
					}
				}
			if (count == 1) {
				System.out.println(n.charAt(i));// p
				return;
			}
		}
	}

}
