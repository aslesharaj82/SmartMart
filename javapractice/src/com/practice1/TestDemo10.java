package com.practice1;

public class TestDemo10 {

	public static void main(String[] args) {
		int [] a= {18,12,133,15,2};
		
		for (int i=0 ;i<a.length;i++) {
			int count=0;
			int num=a[i];
			for (;num>0;num=num/10)
			if(num%1==0) {
				count++;	
			}
		a[i]=a[i]*10+count;
		System.out.print(a[i] +" ");
		}
		
	}

}
