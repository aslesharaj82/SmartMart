package com.Multithreading;

import java.util.Random;
import java.util.Scanner;

public class SleepMethod extends Thread {
	int n;
	public SleepMethod(int n) {
		this.n=n;
	}
	public void run() {
		int i=0;
		for(;i<n;i++){
			System.out.print(i+" ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Thread Interruption Occured!!! "+e.getMessage());
//				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		SleepMethod t= new SleepMethod(n);
		t.start();
		Random r= new Random();
		int time=r.nextInt(5000);
		try {
			Thread.sleep(time);
			t.interrupt();
		
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
