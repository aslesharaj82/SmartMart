package com.Patterns;

public class Patterns1 {

	public static void main(String[] args) {
		int num=1;
		for (int i=1;i<=5;i++) {
			int n=i<=5/2?num++:num--;
			for (int j=1;j<=5;j++) {
				if(i==j || i+j==5+1) {
					System.out.print(n);
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
