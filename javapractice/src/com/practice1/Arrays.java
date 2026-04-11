package com.practice1;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
		int [] A = new int [10];
		
		for (int i=0; i<A.length;i++) {
			System.out.println("Enter a marks:");
			A[i]=sc.nextInt();	

		}
//		int count=0;
		for ( int i=0;i<A.length;i++) {
//			if(A[i]%2==0) {
				System.out.print(A[i]+" ");
//				count++;
//			}
		}
//		System.out.println("no of even numbers:"+count);
		int max=A[0];
		int secondmax=A[1];
		int count =1;
		for (int j=1;j<A.length;j++) {
			if(max<A[j]) {
				secondmax=max;
				max=A[j];
				count++;
			}
			
		}
		System.out.println("\n" +max);
		System.out.println("Second maximum:" +secondmax);
	}

}
