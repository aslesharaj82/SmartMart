package com.Patterns;
//***** 1-5
//****- 2-4
//***-- 3-3
//**--- 4-2
//*---- 5-1

public class leftInvertedtriangle {

	public static void main(String[] args) {
//		for(int i=0;i<5;i++) {
//			for(int j=i;j<5;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}  
//		or
//-----------------------------
		for (int i = 0; i<5; i++) {
			for (int j=5; j>i; j--) {
				System.out.print("*");
			}

			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			System.out.println();

		}
	}

}
