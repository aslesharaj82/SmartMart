package com.practice1;

public class desc1stHalfnAscLastHalfofArray {

	public static void main(String[] args) {
		int[] arr = { 4, 9, 10, 11, 5, 1, 6, 8, 3 };
		int r = arr.length;
		int h = r / 2;
		int temp = 0;
		for (int i = 0; i < r - 1; i++) {
			for (int j = 0; j < (h) - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int j = h + 1; j < r - 1; j++) {
			for (int i = h + 1; i < r - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

		for (int n : arr) {
			System.out.print(n + " ");
		}

	}
}