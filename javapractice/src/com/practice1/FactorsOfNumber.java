package com.practice1;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number:- ");
		int number=sc.nextInt();
		System.out.println("The factors of a number"+" "+number );
		FactorsOfNumber n= new FactorsOfNumber();
		n.factors(number);
	}
		
		void factors(int number) {
		for (int i=1; i<=number/2;i++){
			if(number%i==0) 
			System.out.print(i+" ");	
		}

	}

}

