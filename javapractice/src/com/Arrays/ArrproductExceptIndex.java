package com.Arrays;

public class ArrproductExceptIndex {

	public static void main(String[] args) {
		int [] a= {1,2,3,4};
		int size= a.length;
		for (int i=0 ; i<size;i++) {
			int sum=1;
			for (int j=0;j<size;j++) {
				
				if(i==j) {
					continue;
				}
				else
				{
					sum=sum*a[j];
				}
			}
			System.out.print(sum+" ");
		}
	}

}
