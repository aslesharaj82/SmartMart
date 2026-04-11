package com.Arrays;

import java.util.Scanner;

public class Min_Max_UsingForeach {
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
		for (int n : arr) {
			if (n > Max) {
				Max = n;
			} else if (n < Min) {
				Min = n;
			}
		}System.out.println("Maximum Number: "+Max);System.out.println("Minimum Number: "+Min);
}

}
