package com.practice1;

public class Sort {

	public static void main(String[] args) {
		int[] a = { 23, 15, 12, 78 };
		int temp = 0;
		int size = a.length;
		for (int i = 0; i < size; i++) {
			boolean s = false;
			for (int j = i + 1; j < size; j++) {
				if (a[i] % 10 > a[j] % 10) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp; // 12,15,23,78//12,23,15,78
					s = true;
				}
			}
			if (!s) {
				break;
			}

		}
		for (int a1 : a)
			System.out.print(a1 + " ");
	}
}
