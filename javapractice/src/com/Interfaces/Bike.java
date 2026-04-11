package com.Interfaces;

public class Bike implements Vehicle {
	String Brand;
	int count=0;
	

	public Bike(String Brand) {
		this.Brand= Brand;
	}

	public static void main(String[] args) {
		 
		Bike t= new Bike("Royal Enfield");
		t.start();
		t.stop();
		t.stop();
	}

	@Override
	public void start() {
		count++;
		System.out.println(Brand +" Bike Started!!!!");
		stop();
	}

	@Override
	public void stop() {
		if (count!=0) {
			count=0;
		System.out.println(Brand +" Bike has Stopped" );
		}
		else 
		{
			System.out.println(Brand+" Bike has not started yet!!");
		}
	}

}
