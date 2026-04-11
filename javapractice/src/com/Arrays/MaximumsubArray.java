package com.Arrays;

public class MaximumsubArray {

	public static void main(String[] args) {
		int[] a = { -2, -4,9};
		int start=0;
		int end=0;
		int max = 0;
		for (int i = 0; i < a.length - 1; i++) {
			int sum=0;
			for (int j = i; j < a.length; j++) {
				sum = sum + a[j];
				if (sum > max) {
					max = sum;
					start=i;
					end=j;
				}
			}
		}
		System.out.println(max);
		System.out.println(start+" "+ end); 

	}

}
