package com.practice1;

import java.util.Scanner;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		boolean[] rep = new boolean[size];
		for (int i = 0; i < size; i++) {
			if (rep[i]) {
				continue;
			}
			int count = 0;

			for (int j = 0; j < size; j++) {
				if (arr[i] == arr[j]) {
					count++;
					rep[j] = true;
				}

			}
			if (count > 1) {
				System.out.println(arr[i] + "count = " + count);
			}

		}

	}

}
