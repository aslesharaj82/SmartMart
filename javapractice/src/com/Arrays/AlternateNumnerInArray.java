package com.Arrays;

import java.util.Scanner;

public class AlternateNumnerInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter elemlents of array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < size; i++) {
			if (i % 2 == 1) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
