package com.Patterns;

public class RigthInvertedTriangle {
//	*****  1-5
//	-****  2-4
//	--***  3-3
//	---**  4-2
//	----*  5-1

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			for (int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
