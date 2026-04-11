package com.practice1;

public class MaxContinueELement {

	public static void main(String[] args) {
		int[] a = { 2, 3, 1, 5, 7, 8, 4 };
		int size = a.length;
		for (int i = 0; i < size; i++) {
			int count = 0;
			for (int j = i; j < size; j++) {
				if (a[i] <= a[j]) {
					count++;
				} else {
					break;
				}
			}
			for (int k = i - 1; k >= 0; k--) {
				if (a[i] <= a[k]) {
					count++;
				} else
					break;
			}
			System.out.println(count * a[i]);
		}
	}

}
