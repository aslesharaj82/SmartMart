package com.practice1;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Marks");

		double marks=sc.nextDouble(); 

		String result= 
			(marks>=90 && marks<=100 )? "A":
			(marks>=80 && marks<90 )?"B":
			(marks>=70 && marks<80)? "C":
			(marks>=50 && marks<70)? "D":
			(marks>=35 && marks<50)? "E":
			(marks>=0 && marks<35)? "Fail":
				"Invalid";
		System.out.println("Result:"+result);
	}
}


		
	
