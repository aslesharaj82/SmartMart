package com.Multithreading;

import java.util.Scanner;

public class NumUsingThread extends Thread{
	Scanner sc= new Scanner(System.in);
	public void run() {
		System.out.println("Enter the no.of  numbers to print: ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("current Thread: "+ Thread.currentThread());
	}

	public static void main(String[] args) {
	
		System.out.println("current Thread: "+ Thread.currentThread());
		NumUsingThread t=new NumUsingThread();
		t.start();

	}

}
