package com.oboutjvm;

public class Gc {
	@Override
	protected void finalize() throws Throwable {
	System.out.println("finalised method called");
	}
//	 void hi() {
//		System.out.println("1");
//	}
	static void hello() {
		Gc t2= new Gc();
		t2=null;
//		t2.hi();
//		System.out.println(t2);
	}

	public static void main(String[] args) {
	System.out.println("main method called");
	Gc t= new Gc();
	Gc t1= new Gc();
	System.out.println(t);
	t=t1;
	new Gc();
	System.gc();
	hello();
	System.gc();
	
	}

}
