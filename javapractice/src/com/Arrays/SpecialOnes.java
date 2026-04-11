package com.Arrays;

public class SpecialOnes {

	public static void main(String[] args) {
		int [][] a= { {1,0,0,1},{0,1,0},{1,0,0,0}};
		int c=0;
		for (int i=0 ;i<a.length;i++) {
			int icount=0;
			int jcount=0;
			for (int j=0;j<a.length;j++) {
				icount= icount+a[i][j];
				jcount= jcount+a[j][i];
			}
//			int sum=icount+jcount;
			if (icount==1&&jcount==1) {
				c++;
				System.out.println(c);
			}
		}

	}

}
