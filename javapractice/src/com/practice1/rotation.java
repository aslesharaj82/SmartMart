package com.practice1;

import java.util.Scanner;

public class rotation {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8};//50,40,30,20,10 //20,30,40,50,10
		Scanner sc= new Scanner (System.in);
		System.out.println("enter no of rotations:");
		int r= sc.nextInt();
		int j = a.length;
		int temp=0;
		for(int i=0;i<j;i++) {
			temp=a[i];
			a[i]=a[j-1];
			a[j-1]=temp;
			j--;
		
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		// reversing 1 st half according to no of rotations
		int k=r-1;
		for(int i=0;i<r-1;i++) {
			temp=a[i];
			a[i]=a[k];
			a[k]=temp;
			k--;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		// reversing 2 st half according to no of rotations
		int p=r;
		int q=a.length-1;
		for(;p<q;p++) {
			temp=a[p];
			a[p]=a[q];
			a[q]=temp;
			q--;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
