package com.practice1;

import java.util.Scanner;

public class Exam {
	static String pass() {
		return"Student passed the Exam!!!";
	}
	static String fail() {
		return "Student failed the Exam";
	}
	String Invalid() {
		return "invalid";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student marks:");
		int M=sc.nextInt();
		Exam t = new Exam();
		if (M<0) {
			String S=t.Invalid();
			System.out.println(S);
		}else {
		String result =(M>=40?pass():fail());
		System.out.println(result);
		
		}
		sc.close();
	}

}
