
package com.practice1;

import java.util.Scanner;

public class FindNumberAndPositionInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Array " + i + 1 + " element: ");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Array elements are: " + arr[i]);
		}
		System.out.print("enter the number to be searched: ");
		int findNum = sc.nextInt();
		int pos = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == findNum) {
				pos = i + 1;
				break;
			}
		}
		if (pos > 0) {
			System.out.println("The value in the " + pos + " position");
		} else {
			System.out.println("Value not found");
		}

	}

}
