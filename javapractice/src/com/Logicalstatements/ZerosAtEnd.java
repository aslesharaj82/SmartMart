package com.Logicalstatements;

public class ZerosAtEnd {

	public static void main(String[] args) {
		int[] a = {0, 1, 0, 2, 0, 3, 0};
		int temp = 0;

		for (int i = 0; i < a.length-1; i++) {
			int count = 0;
			for (int j = i; j < a.length - 1 - i; j++) {
		
				if (a[j] == 0) { 
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					count++;
				}
			}
			if (count == 0) {
				break;
			}

		}
		for (int n : a) {
			System.out.print(n + " ");
		}

	}

}
