package com.constructors;
// Constructor  Chaining
public class Customer {
	int cid;
	String cname;
	int cage;
//	 no arg constructor called
	Customer(){
		System.out.println("no arg constructor called");
		cid=101;
		cname="unknown";
		cage=24;
	}
	//	 one arg constructor
	Customer (int cid){
		this();
		System.out.println("one arg constructor called");
		this.cid=cid;
		
		
	}
//	two arg constructor
	Customer (int cid, String name ){
		this(cid);
		this.cid=cid;
		this.cname=name;
		System.out.println("two arg constructor called");
	}
//	three arg constructor
	Customer (int cid, String name, int cage ){
		this(cid,name);
		System.out.println("three arg constructor called");
	}

	public static void main(String[] args) {
		System.out.println("main method Started !");
		Customer c1= new Customer();
		c1.display();
		Customer c7= new Customer();
		c7.display();
		Customer c2= new Customer(102);
		c2.display();
		Customer c3= new  Customer(103,"Raju");
		c3.display();
		Customer c4= new Customer (104,"Rainy");
		c4.display();
				
		System.out.println("main method ended!!");

	}
	void display() {
		System.out.println("****************************");
		System.out.println("Customer Id: "+cid);
		System.out.println("Customer Name: "+ cname);
		System.out.println("Customer Age: "+ cage);
		System.out.println("****************************");
	}

}
