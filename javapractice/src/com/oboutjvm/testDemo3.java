package com.oboutjvm;

public class testDemo3 {
	void hello(){
		System.out.println("Hello Good Evening !! ");
	}

	public static void main(String[] args) {
		 System.out.println("Main method strated: ");
		//calling a static method in static method
		 welcome();//1st way
		 testDemo3.welcome();//2nd way
		// calling a instance method  we need to create an object
		 testDemo3 t= new testDemo3();
		 t.hello();//calling the instance method using reference variable
		 System.out.println(Thread.currentThread().getName());
	}
	static void welcome() {
		 System.out.println("welcome To Jvm Architectire");
	 }

}
