package com.StringHandling;

public class TestSTrDemo12 {

	public static void main(String[] args) {
		System.out.println("main method Started");
		String str1="Java";//String Constant Pool
		String  str2=new String("Java");//String heap memory
		System.out.println(str1==str2);
		str2=str2.intern();
		System.out.println(str1=str2);
		System.out.println("main method ended");
	}

}
