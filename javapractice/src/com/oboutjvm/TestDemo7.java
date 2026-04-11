package com.oboutjvm;

public class TestDemo7 {
	static {
		System.out.println("static block1 called");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
//		new TestDemo7(); anonymous object
//		TestDemo7 t=  new TestDemo7();
		
	}
	static {
		System.out.println("static block called");
	}
	{
		System.out.println("Instance block called");
	}

}
