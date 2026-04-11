package com.Multithreading;


class threadtest2 extends Thread{
	
}
 class Threadtest1 extends Thread{
	
	public void run() {
		System.out.println("hello "+ Thread.currentThread().getName());
	}
	
	
	
	public static void main(String[] args) {
		
		Threadtest1 t= new Threadtest1();
		t.start();
		Thread t1= new Thread();
		t1.start();
	}

}
