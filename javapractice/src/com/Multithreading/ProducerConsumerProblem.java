package com.Multithreading;

class Resource {
	int i = 0;
	boolean status = false;

	synchronized void put(int i) throws InterruptedException {
		while (status) {
			wait();
		}
		this.i=i;

		System.out.println("put: " + i);
		status = true;
		notify();
	}

	synchronized void get() throws InterruptedException {
	while (!status) {
			wait();
		}
	
		System.out.println("Get: " + i);
		status = false;
		notify();
	}

}

class Producer implements Runnable {
	Resource r;

	public Producer(Resource r) {
		this.r = r;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	public void run() {
		int i = 0;
		while (true) {
			try {
				r.put(i++);
				Thread.sleep(500);
			} catch (InterruptedException e) {

				System.out.println("interrupted Exception");
			}
		}

	}
}

class Consumer implements Runnable {
	Resource r;

	public Consumer(Resource r) {
		this.r = r;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	public void run() {

		while (true) {
			try {

				r.get();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("interrupted Exception");
			}
		}
	}
}

public class ProducerConsumerProblem {

	public static void main(String[] args) {

		Resource r = new Resource();
		Producer p = new Producer(r);
		Consumer c = new Consumer(r);
	}

}
