package com.StringHandling;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine().toLowerCase();
		String s2 = sc.nextLine().toLowerCase();
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		if(s1.length()!=s2.length()) {
			System.out.println("Not an Anagram");
		}
		Arrays.sort(a1);
		Arrays.sort(a2);
		System.out.println(Arrays.equals(a1, a2));
		if (Arrays.equals(a1, a2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not an Anagram");
		}

	}

}
