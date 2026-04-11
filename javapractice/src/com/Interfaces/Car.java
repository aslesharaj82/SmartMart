package com.Interfaces;

public class Car implements Vehicle {
	String Brand;
	int count=0;
	

	public Car(String Brand) {
		this.Brand= Brand;
	}

	public static void main(String[] args) {
		 
		Car t= new Car("BMW");
		t.start();
		t.stop();
		t.stop();
	}

	@Override
	public void start() {
		count++;
		System.out.println(Brand +" Car Started!!!!");
		
	}

	@Override
	public void stop() {
		if (count!=0) {
			count=0;
		System.out.println(Brand +" Car has Stopped" );
		}
		else 
		{
			System.out.println(Brand+" Car has not started yet!!");
		}
	}

}
