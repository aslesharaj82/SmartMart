package com.oboutjvm;

public class Employee {
	int eid;
	String empName;
	static String orgName;

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println(orgName);// orgname is a static variable stored in method area assigned by default values
									// in the prepare(linking phase).if we assign any values then they will be
									// asigned by actual values in the initialization stage
		Employee e1 = new Employee();// object creation. when object is created it is stored in the heap memory. for
										// every object a copy is created in the heap memory. and instance data is
										// loaded and asigned by default values.
		orgName = "Google";// static variable in method area assigned by actual value.
		e1.eid = 10;// after object creation default values are reasigned by assigned values
		e1.empName = "Aslesha";
		System.out.println(e1.eid);
		System.out.println(e1.empName);
		System.out.println(orgName);
		System.out.println("----2nd Object----");
		Employee e2 = new Employee();// for every object copy created in heap area
		orgName = "infosys";// static data reassigned with infosys from now it store infosys in it until
							// next reassignment
		System.out.println(e2.eid);// as for 2nd copy we have not assigned any values for eid and ename as they are
									// instance variable . they are assigend by default values when e2 object is
									// created
		System.out.println(e2.empName);
		System.out.println(orgName);
		
		System.out.println("----3nd Object----");
		Employee e3 = new Employee();
		e3.eid = 20;
		e3.empName = "Anjani";
		System.out.println(e3.eid);
		System.out.println(e3.empName);
		System.out.println(orgName);
		
		System.out.println("----3nd Object----");
//		Employee e4= null;
//		orgName="SSS";
//		e4.eid=111;
//		System.out.println(orgName);
//		System.out.println(e4.eid);//NPE: Null pointer exception
	}

}
