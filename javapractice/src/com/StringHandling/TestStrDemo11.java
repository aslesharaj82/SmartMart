package com.StringHandling;

public class TestStrDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started");
		String str1 = "Java is simple in Vcube at JNTU in a hyderabad";
		System.out.println(str1.indexOf("Vcube"));//1
		System.out.println(str1.indexOf('a'));//1
		System.out.println(str1.lastIndexOf("a"));//40+

		System.out.println(str1.indexOf('a', str1.indexOf("a") + 10));//
		System.out.println(str1.indexOf('a', str1.indexOf("a",str1.indexOf("a") + 1)));
		
		System.out.println(str1.indexOf("in"));
		
		
	}

}
