package com.StringHandling;

import java.util.Scanner;

public class RearrangeTheSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		int l = s.length;
		String[] s1 = new String[l];

		for (String w:s) {
			int position = 0;
			String text = "";
			char[] a = w.toCharArray();
			for (char n : a) {
				if (Character.isDigit(n)) {

					position = n - '0';

				} else {
					text = text + n;
				}
			
			}
			s1[position-1] = text;
		}
		for (String z : s1) {
			System.out.print(z+" ");
		}
	}
}
