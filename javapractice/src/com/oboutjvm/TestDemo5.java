package com.oboutjvm;

public class TestDemo5 {
	//instance method
	void hello() {
		System.out.println(" hello");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		TestDemo5 t= new TestDemo5();//creating  an object 
		welcome();//calling a static method
		t.hello();

	}
	//instance method
	static void welcome() {
		System.out.println("Welcome");
	}

}
