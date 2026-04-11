package com.Arrays;
//enter size of an array:
//5
//Enter elemlents of array: 
//2
//3224
//22225
//56
//43
//2 3224 22225 56 43 
//enter the number to be searched : 
//2
//7

import java.util.Scanner;

public class test1 {

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
			System.out.print(arr[i] + " ");

		}
		System.out.println("");
		System.out.println("enter the number to be searched : ");
		int number = sc.nextInt();
		int rem = 0;
		int count = 0;
		for (int n : arr) {
			for (int i = 0; i < n; n = n / 10) {
				rem = n % 10;
				if (rem == number) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
