package com.practice1;

public class LeadersOfArray {

	public static void main(String[] args) {
		int[] arr = { 13, 2, 8, 4, 5, 1 };
		int size = arr.length;
		int leader = arr[size - 1];
		System.out.print("leader"+ " "+leader);
			for (int j = size - 1; j >=0; j--) {
//				if (arr[j] < arr[j - 1]) {
//					leader = arr[j - 1];
//					System.out.print(" "+leader+" ");
//			
//				}		
//		}
				if(arr[j]>leader) {
					leader=arr[j];
					System.out.print(" " + leader);
				}

	}

	
}
}