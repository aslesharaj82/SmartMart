package com.StringHandling;

public class SplitMethod {

	public static void main(String[] args) {
	String s="java is simple";
	
	String[] s1= s.split(" ");
	for(int i=0;i<s1.length;i++)
	{
		System.out.println(s1.length);
	
	System.out.print(s1[i].intern());
	}
	}

}
