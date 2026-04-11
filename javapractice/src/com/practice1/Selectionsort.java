package com.practice1;

import java.util.Scanner;

public class Selectionsort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		int temp = 0;
		System.out.println("Enter array elements: ");// 4,3,6,7,6
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < size - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < size; j++) {
				if (a[minIndex] > a[j]) {
					minIndex = j;

				}
			}
			temp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;
		}
		for (int n : a) {
			System.out.print(n + " ");
		}

	}

}
