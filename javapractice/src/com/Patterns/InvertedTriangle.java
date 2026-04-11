package com.Patterns;

public class InvertedTriangle {

	public static void main(String[] args) {
		int n=6;
		for (int i=0;i<n;i++) {
			for (int k=1;k<i+1;k++) {
				System.out.print(" ");
			}
			for (int j=0;j<n-i;j++) {
				System.out.print("*"+" "); 
			}
			System.out.println();
		}

	}

}
