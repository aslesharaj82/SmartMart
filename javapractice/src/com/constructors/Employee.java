package com.constructors;

public class Employee {
	int eid;
	double esal;
	String ename;
	int eage;

//While creating an object if we want to pass any values to the object instance data we need parametrized constructor
	Employee(int eid, double esal, String ename, int eage) {
		System.out.println("4-parametrrized Construcotr called");
		this.eid = eid;
		this.esal = esal;
		this.ename = ename;
		this.eage = eage;

	}

	Employee(int id, String name) {
		System.out.println("2-parametrized construcotr called");
		eid = id;// 1
		ename = name;// Anshu
	}

	Employee() {
		System.out.println("no arg Constructor Called");
		eid = 100;
		esal = 1000;
		ename = "unknown";
		eage = 18;
	}

	public static void main(String[] args) {
		System.out.println("main method Started");
		Employee e1 = new Employee();
		e1.show();

		Employee e2 = new Employee(1, 1000000, "Aslesha", 24);
		e2.show();

		Employee e3 = new Employee(1, "Anshu");
		e3.show();

		System.out.println("main method ended");
	}

	void show() {
		System.out.println(eid);
		System.out.println(esal);
		System.out.println(ename);
		System.out.println(eage);

	}

}
