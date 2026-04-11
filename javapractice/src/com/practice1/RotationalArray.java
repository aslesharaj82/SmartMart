package com.practice1;

import java.util.Scanner;

public class RotationalArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of rotations: ");
		int r=sc.nextInt();
		int [] arr= {1,2,3,4,5,6,7,8};
		rotational(arr,r);
		System.out.println("Array After rotation:");
		for (int n: arr) {
			System.out.print(n+" ");
		}
	}
		static void rotational(int[] arr,int r) {
			int start=0;
			int end= arr.length-1;
			reverseArray(arr,start,end);
			reverseArray(arr,start,r-1);
			reverseArray(arr,r,end);
			
		}
		static void reverseArray(int [] arr,int start,int end){
			int temp =0;
			while(start<end) {
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}

}
