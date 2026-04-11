package com.Arrays;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter N: ");
		int N=sc.nextInt();
		int[] S= new int[N];
		for(int i=0;i<S.length;i++) {
			System.out.println("Enter array elements: ");
			S[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<S.length;i++) {
			for(int j=i+1;j<S.length-1;j++) {
				if(S[i]>S[j]) {
				temp=S[j];
				S[j]=S[i];
				S[i]=temp;
				}
			}
		}
		for(int n: S) {
			System.out.print(n+" ");
		}
		System.out.println("ENter X: ");
		int X=sc.nextInt();
		int sum=0;
		int count=0;
		for (int n : S) {
			sum=sum+n;
			count++;
			if(sum>X) {
			System.out.println(count-1);
			break;
			}
			
		}
	}

}
