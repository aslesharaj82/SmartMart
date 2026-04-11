package com.Arrays;

public class Selectionsort {

	public static void main(String[] args) {
		int [] a= { 4,3,6,7,6,4,9};
		int size= a.length;
		int temp=0;
		for (int i=0;i<size-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<size;j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
				}
			}
			temp= a[minIndex];
			a[minIndex]=a[i];
			a[i]=temp;
		}
	
	
	for (int n:a) {
		System.out.print(n+" ");
	}
}
}