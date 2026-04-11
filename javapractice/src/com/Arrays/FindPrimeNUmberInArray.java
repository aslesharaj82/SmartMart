package com.Arrays;

import java.util.Scanner;

public class FindPrimeNUmberInArray {
	static boolean isprime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			status = false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int n : arr) {
			if (isprime(n)) {
				System.out.print("\n" + n);
			}
		}

	}

}
