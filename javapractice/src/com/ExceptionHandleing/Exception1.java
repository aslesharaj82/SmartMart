package com.ExceptionHandleing;

public class Exception1 {

	public static void main(String[] args) {
		
		try {
			String s = null;
			System.out.println(s.length());
			dostuff();

		} catch (Exception n) {
			System.out.println("Null pointer exception");
		}
		System.out.println("hii");

	}

	static void dostuff() {
		try {
			domorestuff();
//			String s = null;
//			System.out.println(s.length());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception");
		}
	}

	static void domorestuff() {
		System.out.println(10 / 0);
		
	}

}
