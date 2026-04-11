package com.oboutjvm;

public class TestDemo6 {
	// we can call static methods in static area directly.
	//in instance method we can call instance method directly
	void method5() {
		System.out.println("hello method 5");
		method6();
	}

	void method6() {
		System.out.println("hello method 6");
		method7();
	}

	void method7() {
		System.out.println("hello method 7");
		method8();
	}

	void method8() {
		System.out.println("hello method 8");
	}

	// in static ,if we want to call instance data members,we must need to create an
	// object
	static void method1() {
		method2();
		System.out.println("method1 called");
	}

	static void method2() {
		System.out.println("method 2 called");
		method3();
	}

	static void method3() {
		System.out.println("method 3 called");
		method4();
	}

	static void method4() {
		TestDemo6 t = new TestDemo6();
		t.method5();
		System.out.println("method 4 called");
	}

	void main() {
		System.out.println("main method Started");
		method1();
	}
}
