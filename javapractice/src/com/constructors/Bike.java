package com.constructors;

public class Bike {
	String Model;
	String Brand;
	Bike(){
		System.out.println("no arg called");
	}

	public static void main(String[] args) {
		Bike b1= new Bike();
		System.out.println(b1.Model);
		System.out.println(b1.Brand);
	}

}
