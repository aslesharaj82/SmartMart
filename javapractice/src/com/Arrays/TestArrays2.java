package com.Arrays;

public class TestArrays2 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 5 }, { 3, 4, 7 }, { 2, 5, 8 } };
		int[][] r = new int[3][3];
		for (int a[] : arr) {
			for (int n : a) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
//		System.out.println(arr.length);
//		

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				r[i][j] = arr[j][i];
			}
		}
		System.out.println("*******************");
		for (int a[] : r) {
			for (int n : a) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}
