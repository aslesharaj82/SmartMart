package com.Arrays;

public class desc1stHalfnAscLastHalfofArray {

	public static void main(String[] args) {
		int[] arr = { 4, 9, 10, 11, 10, 1, 6, 8, 3 };
		int size = arr.length;
		int r = size / 2;
		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size-1; j++) {
//			if (i <= r)
				if(j<r-1){
					if (arr[j] < arr[j + 1]) {
						temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					} 
				}
			 else if(j>r)
//				if (i > r) {
//				for (int k = r + 1; k < r-1; k++) 
				{
					if (arr[j] > arr[j+ 1]) {
						temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}

			}
	}
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

}
