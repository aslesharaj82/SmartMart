package com.Arrays;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size of Array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		Class c= Class.forName("com.Arrays.ReverseArray");
		Method[] m= c.getDeclaredMethods();
		for (Method m1:m) {
			System.out.println(m1);
		}

	}

}
