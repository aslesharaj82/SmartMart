package com.oboutjvm;

public class Testdemo4 {
	void hello() {
		 System.out.println("Instance Mthod called");
		
 	}

	public static void main(String[] args) {
	System.out.println("hello main method started!!!");
 hi();
	}
	static void hi() {
		System.out.println("static mehotd called");
		Testdemo4 t= new Testdemo4();
		t.hello();
	}

}
