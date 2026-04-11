package com.practice1;

import java.util.Scanner;

public class RevEveryElementInArray {

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
		int rev=0;
		
		for(int n:arr) {
			String bin="";
			for (int i=0; i<n;n=n/10) {
				rev=n%10;
				bin= bin+rev;
//				System.out.println(bin);
			}
			System.out.println(bin);
		}
		
	}

}
