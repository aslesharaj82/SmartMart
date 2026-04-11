package com.Multithreading;

//import java.util.Scanner;

class test1 implements Runnable {
	Thread t;
	test1(Thread t){
		this.t=t;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			if (i==4) {
				try {
					t.join();
				} catch (InterruptedException e) {
					System.out.println("Interrupted exception");;
				}
			}
			System.out.println("r1: " + i + " ");
			
		}
	}
}

class test2 implements Runnable {
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("r2: " + i + " ");

		}
	}
}

public class Numbers implements Runnable {
//	int n;
//	Numbers(int n){
//		this.n=n;
//	}

	public void run() {

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted Exception");
			}
			System.out.println("run: " + i + " ");
		}
	}

	public void join() {
	// TODO Auto-generated method stub
	
}

	public static void main(String[] args) throws InterruptedException {
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt(); 
		Numbers r = new Numbers();
		Thread t = new Thread(r);
		t.start();
		Nums ns = new Nums();
		Thread e = new Thread(ns);
		e.start();
//		t.interrupt();
		test1 t1 = new test1(t);
		Thread f = new Thread(t1);
		f.start();
		test2 t2 = new test2();
		Thread g = new Thread(t2);
		g.start();
		for (int i = 0; i < 5; i++) {
			
			System.out.println("main: " + i + " ");
		}

	}

}

class Nums implements Runnable {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("r0: " + i + " ");
		}
	}
}
