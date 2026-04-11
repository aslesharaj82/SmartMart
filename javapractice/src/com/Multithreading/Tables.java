package com.Multithreading;


public class Tables extends Thread {
	
 
	public void run() {
		int n=2;
		for(int i=1; i<=10;i++) {
			System.out.println(n+" X"+ (i)+"="+n*i);
		}
	}
	public static void main(String[] args) {
		
		Tables t= new Tables();
		t.start();
		Table3 r=new Table3();
		r.start();
		Table5 b=new Table5();
		b.start();
		

	}
}
	class  Table3 extends Thread {
		
		public void run() {
		int n=3;
		for(int i=1; i<=10;i++) {
			System.out.println(n+" X"+ (i)+"="+n*i);
		}
		}
		
		
	}
class  Table5 extends Thread {
		
		public void run() {
		int n=5;
		for(int i=1; i<=10;i++) {
			System.out.println(n+" X"+ (i)+"="+n*i);
		}
		}
		
		
	}


