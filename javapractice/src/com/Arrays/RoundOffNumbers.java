package com.Arrays;

public class RoundOffNumbers {

	public static void main(String[] args) {
		int[] a = { 92, 1, 99, 18, 36, 41 };
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			while(n>0) {
				int rem = n % 10;
				if (rem <= 5) {
					a[i] = a[i] - rem;
					break;
				}else {
					a[i]= (a[i]-rem)+10;
					break;
				}
			}
		}
		for (int num: a) {
			System.out.print(num+" ");
		}
	}

}
