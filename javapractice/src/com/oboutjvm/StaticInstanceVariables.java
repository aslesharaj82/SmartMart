package com.oboutjvm;

public class StaticInstanceVariables {
	int a;
	boolean b;
	String c;
	double d;
	static int x = 19;
	static boolean y;
	static String z = "Anshu";
	static double p;

	StaticInstanceVariables() {
	}

	StaticInstanceVariables(int a, boolean b, String c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public static void main(String[] args) {
		StaticInstanceVariables t1 = new StaticInstanceVariables();
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
		System.out.println(t1.d);
		System.out.println("*************************");
		StaticInstanceVariables t = new StaticInstanceVariables(100, false, "aslesha", 18.0);
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(t.d);
		System.out.println("*************************");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(p);
	}

}
