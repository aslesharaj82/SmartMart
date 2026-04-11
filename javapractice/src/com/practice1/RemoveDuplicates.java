package com.practice1;

public class RemoveDuplicates {

	static void Even(int n) {
		if (n % 2 == 0) {
			System.out.print(n + " ");

		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
		boolean[] s = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (s[i]) {
				continue;
			}
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					s[j] = true;
				}
			}
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		boolean[] a = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (a[i]) {
				continue;
			}
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					a[j] = true;
				}
			}
			Even(arr[i]);

		}
	}

}
