package com.StringHandling;

public class TeststrDemo10 {

	public static void main(String[] args) {
		
		String str="Aslesha";
		String str1=null;
		String str2="";
		String str3=" ";
		
		System.out.println(str.isEmpty());//false
		System.out.println(str.isBlank());//false
		
//		System.out.println(str1.isEmpty());//NPE
//		System.out.println(str1.isBlank());//NPe
		
		System.out.println(str2.isBlank());//true
		System.out.println(str2.isEmpty());//true
		
		System.out.println(str3.isBlank());//true
		System.out.println(str3.isEmpty());//false
	}

}
