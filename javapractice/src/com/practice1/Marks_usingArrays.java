package com.practice1;

import java.util.Scanner;

public class Marks_usingArrays {
	static String AboveAvg(double arr, double avg) {
		if (arr<=35) {
			return "failed";
		}
		else if (arr>=avg) {
			return "Above Avg";
		}else
			return "below Avg";
	}
	static void evenMArks(int  arr) {
		if(arr%2==0) {
			System.out.println("Even marks"+":- "+arr);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array:");
		int n=sc.nextInt();
		int [] arr= new int [n];
		
		 for (int i=0;i<arr.length;i++) {
			 while(true) {
			 System.out.println("Enter marks from 0 to 100 : ");
			 arr[i] = sc.nextInt();
			 if( arr[i]<0 || arr[i]>100) {
				 System.out.println("invalid marks!! Enter the Valid Marks.");
			 }
			 else
				 break;
		 }
	}
		 
		 double sum=0;
		 double avg=0;
		 for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i]+" ");
		 sum= (sum+arr[i]);
		 avg=sum/arr.length;
		 }
		 System.out.println("\n"+"sum: "+sum+"\n"+"avg: "+avg);
		 
		 for (int i=0;i<arr.length;i++) {
			
			  String  m=AboveAvg(arr[i],avg);
			  System.out.println("marks:"+arr[i]+":- "+m);
			 
			}
		 for (int i=0;i<arr.length;i++) {
		 evenMArks(arr[i]);
		 }
		 }
	
}


