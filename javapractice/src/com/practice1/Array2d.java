package com.practice1;

public class Array2d {

	public static void main(String[] args) {
		int[] [] a= {{1,1,0},{1,1,1},{0,1,1}};
		int size= a.length;
		boolean[][] b= new boolean [size][a[0].length];
		
		for (int i=0;i<size;i++) {
			for (int j=0;j<a[0].length;j++) {
				if (b[i][j]==false) {
				if(a[i][j]==0) {
					for (int k=0;k<size;k++) {
						a[i][k]=0;
						b[i][k]=true;
					}
						for(int k=0;k<size;k++) {
							a[k][j]=0;
							b[k][j]=true;
					}
				}
			}
		}
	}
		for (int[] n:a) {
			for (int n1:n) {
			System.out.print(n1+" ");
		}
			System.out.println();
	}
	}

}
