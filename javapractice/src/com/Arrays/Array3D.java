package com.Arrays;

public class Array3D {

	public static void main(String[] args) {
		int[][][] a= new int [2][3][3];
		a[0][0][0]=3;
		a[1][0][2]=9;
		for(int[][]a1:a) {
			for(int[]a2:a1) {
				for(int a3:a2) {
					System.out.print(a3+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
