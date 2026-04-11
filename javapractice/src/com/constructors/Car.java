package com.constructors;

public class Car {
	String model;
	String brand;
	double price;
	Car(){
		model="unknown";
		brand="unknown";
		price=0.0;
	}
	public Car(String brand) {
		this( );
		this.brand=brand;
		}
	public Car(String model, String brand) {
	this();
	this.model=model;
	this.brand=brand;
	}
	public Car(String model, String brand, int price) {
		this(brand);
		this.model=model;
		this.price=price;
	}
	public static void main(String[] args) {
		System.out.println("main Started");
		Car c1 = new Car();
		c1.show();

		Car c2 = new Car("audi");
		c2.show();

		Car c3 = new Car("benzz","benzz1");
		c3.show();

		Car c4 = new Car("Ciazz","Honda",100000);
		c4.show();
	}

	void show() {
		System.out.println(model);
		System.out.println(brand);
		System.out.println(price);

	}
}
