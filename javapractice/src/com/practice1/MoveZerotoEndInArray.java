package com.practice1;

import java.util.Scanner;

public class MoveZerotoEndInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter array elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < size - 1; i++) {
			boolean status = false;
			for (int j = 0; j < size - 1 - i; j++) {
				if (arr[j] != 0) {
					continue;
				} else {
					
					    int temp = arr[j];
					    arr[j] = arr[j + 1];
					    arr[j + 1] = temp;
						status = true;
				}

			}
			if (!status) {
				break;
			}
		}
		for (int j = 0; j < size; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
