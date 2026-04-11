package com.practice1;

public class FirstPositiveFirstNegative {

	public static void main(String[] args) {

		int[] a = { 1, 2,-8,9 };
		int icount = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				icount++;
				count = 0;

				for (int j = 0; j < a.length; j++) {

					if (a[j] < 0) {
						count++;
					}
					if (icount == count) {
						System.out.println(a[i] + "  " + a[j]);
						break;
					}
				}
			}

		}

	}

}
