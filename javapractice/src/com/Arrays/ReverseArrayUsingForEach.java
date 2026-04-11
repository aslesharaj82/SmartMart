package com.Arrays;

public class ReverseArrayUsingForEach {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int size = numbers.length;
//		for (int i=0 ;i<numbers.length;i++) {
//		System.out.println(numbers[i]+""+size);
//		}
		int[] a = new int[size];
		int index = size - 1;
		for (int n : numbers) {
			a[index] = n;
			index--;
		}
		for (int n : a) {
			System.out.print(n + " ");
		}

	}

}
