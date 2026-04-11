package com.Patterns;
//     1
//    1 1
//   1 2 1 
//  1 3 3 1
// 1 4 6 4 1 


public class PascalProblem {

	public static void main(String[] args) {
		int n=5;
		for (int i=1;i<=n;i++) {
			int value=1;
			for (int k=0;k<n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
//				if(j==1 || j==i)
//				System.out.print(" 1");
				System.out.print(value + " ");
				value = value * (i - j) / j;

			}
			System.out.println();
		}
	}

}
