package com.constructors;

import java.util.Scanner;

public class Student {
	int sid;
	String sname;

//	the below one is called the no arg constructor
//  when an explicit constructor is created then compiler will not generate or provide default constructor	
	Student() {
		System.out.println("no arg constructor called ");
		sid=100;
		sname="unknown";
	}

	public static void main(String[] args) {
		System.out.println("main method Started");
//		the below Object is created with the help of default constructor
//		default constructors are created by compiler 
//		the below object is created with the help of no arg constructor
		Student s1 = new Student();
//		Scanner sc = new Scanner(System.in); ---> we cannot create an object for Scanner beacuse it doesnot have default or no arg constructor
		System.out.println(s1.sid);
		System.out.println(s1.sname);
	}

}
