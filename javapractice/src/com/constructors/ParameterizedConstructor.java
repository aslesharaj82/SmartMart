package com.constructors;

public class ParameterizedConstructor {
	int sid;
	String sname;
	{
	System.out.println(sid);
	}
//	 no arg Constructor
	ParameterizedConstructor(){
		System.out.println("no arg constructor called");
		sid=100;
		sname="unKnown";
		
	}
	ParameterizedConstructor(int sid,String sname){
		System.out.println("parameterized constructor called");
		System.out.println(sid);
		this.sid=sid;
		this.sname=sname;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		ParameterizedConstructor s1= new ParameterizedConstructor();
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		ParameterizedConstructor s2= new ParameterizedConstructor(18, "virat");
		System.out.println(s2.sid);
		System.out.println(s2.sname);
	ParameterizedConstructor s3= new ParameterizedConstructor();
	System.out.println(s3.sid);
	System.out.println(s3.sname);
	}

}
