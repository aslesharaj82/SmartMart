package com.Arrays;

import java.util.Scanner;

public class Min_Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int Min = arr[0];
		int Max = arr[0];
		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
			if (arr[i] < Min) {
				Min = arr[i];
			} else if (arr[i] > Max) {
				Max = arr[i];
			}
		}
		System.out.println("Maximum Number: " + Max);
		System.out.println("Minimum Number: " + Min);

	}

}
