package com.practice1;

import java.util.Scanner;

public class Pattrens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
//		for (int i = 1; i < n+1; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<n+1;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<n+1;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<n+1;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
//		----*
//		---**
//		--***
//		-****
//		*****
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" "+" ");
			}
			
		
		for(int k=0;k<i;k++) {
			
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}


