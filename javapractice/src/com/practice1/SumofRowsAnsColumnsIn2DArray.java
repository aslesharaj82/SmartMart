package com.practice1;

public class SumofRowsAnsColumnsIn2DArray {

	public static void main(String[] args) {
		int[][] arr = { { 3, 50, 2 }, { 6, 5, 12 }, { 3, 9, 15 } };
		int Size = arr.length;
		int maxSum = 0;
		int rowIndex = 0;
		for (int i = 0; i < Size; i++) {
			int sum = 0;
			for (int j = 0; j < arr[0].length; j++) {
				sum = sum + arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("  --row sum ->" + sum);
			if (maxSum < sum) {
				maxSum = sum;
				rowIndex = i + 1;
			}
		}

		System.out.println("max sum : " + maxSum + "    index-> : " + rowIndex);

	}
//	static int max=0;
//	static void findmax(int sum) {
//		
//		if(sum>max) {
//			max=sum;
//			
//		}
//	
//		System.out.println("maximum sum: "+ max);
//		
//	}

}
