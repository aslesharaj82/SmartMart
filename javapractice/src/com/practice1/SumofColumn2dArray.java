package com.practice1;

public class SumofColumn2dArray {

	public static void main(String[] args) {
		int[][] arr = { { 3, 50, 2 }, { 6, 5, 12 }, { 3, 9, 15 } };
		int maxSum = 0;
		int columnIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[j][i];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("     column sum " + sum);
			if (sum > maxSum) {
				maxSum = sum;
				columnIndex = i + 1;
			}

		}

		System.out.println("max sum : " + maxSum + "    index-> : " + columnIndex);
	}

}






















