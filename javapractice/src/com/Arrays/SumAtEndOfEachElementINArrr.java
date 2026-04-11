package com.Arrays;

public class SumAtEndOfEachElementINArrr {

	public static void main(String[] args) {
		int [] a= { 12,123,1,34,57};
		for(int i=0;i<a.length;i++) {
			int sum=0;
			int n=a[i];
			for (;n>0;n=n/10) {
				int rem= n%10;
				sum=sum+rem;
			}
			String s=a[i]+""+sum;
			a[i]= Integer.parseInt(s);
			System.out.print(a[i]+" ");
		}

	}

}
