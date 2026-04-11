package com.Arrays;

public class Degree90RotationINArray {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = new int[3][3];
		int[][] p = new int[3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[j][i] = a[i][j];
			}
		}
		for (int a1[] : a) {
			for (int n : a1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		System.out.println("**********************");
		for (int a1[] : b) {
			for (int n : a1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		System.out.println("**********************");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j<=0; j++) {
				p[i][j]=b[i][j+2];
				p[i][j+1]=b[i][j+1];
				p[i][j+2]=b[i][j];
			}
		}
	
		for (int a1[] : p) {
			for (int n : a1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}
}
