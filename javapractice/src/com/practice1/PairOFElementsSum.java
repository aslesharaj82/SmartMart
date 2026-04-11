package com.practice1;

import java.util.Scanner;

public class PairOFElementsSum {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 3, 2, 8 };
		int s = a.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sum:");
		int Z = sc.nextInt();
		boolean[] f = new boolean[s];
		for (int i = 0; i < s-1; i++) {
			if (f[i]) {
				continue;
			}
			for (int j = i + 1; j < s; j++) {
				if (a[i] + a[j] == Z) {
					System.out.println(a[i] + "+" + a[j] + "=" + (a[i] + a[j]));
					f[i]=true;
					f[j] = true;
					
				}
			}
		}

	}

}
