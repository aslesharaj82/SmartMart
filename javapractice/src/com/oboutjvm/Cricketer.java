package com.oboutjvm;

public class Cricketer {
//Declaration
	//instance variable
	int jno;
	String name;
	//static variable
	static int countryId =100;
	static String countryname="India";
		
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Welcome to Indian Cricket team info !!");
		//accessing instance data
		System.out.println("Object 1 Info:*********");
		Cricketer t= new Cricketer();
		//accessing static data
		System.out.println("Country ID: "+countryId);
		System.out.println("Country Name:"+countryname);
		
		t.jno=54;
		t.name="RohitSharma";
		
//		System.out.println("************************");
		//Cannot make a static reference to the non-static field jno ,name
		//that is why we created an object to access data in the static field
		System.out.println("Jersey Number:-"+t.jno);
		System.out.println("Cricketer Name:-"+t.name);
		
		System.out.println("Object 2 Info:*********");
		Cricketer n= new Cricketer();
		n.jno=18;
		n.name="Kohli";
		System.out.println("Country ID: "+countryId);//100
		System.out.println("Country Name:"+countryname);//India
		System.out.println("Jersey Number:-"+  n.jno);//18
		System.out.println("Cricketer Name:-"+ n.name);//KOhli
		System.out.println("Object 3 Info:*********");
		Cricketer kl= new Cricketer();
		countryId=91;
		countryname="Barath";
		kl.jno= 1;
		kl.name="Kl Rahul";
		System.out.println("Country ID: "+countryId);//91
		System.out.println("Country Name:"+countryname);//barath
		System.out.println("Jersey Number:-"+  kl.jno);//1
		System.out.println("Cricketer Name:-"+ kl.name);//Kl Rahul
		System.out.println("Object 4 Info:*********");
		Cricketer msd= new Cricketer();
		msd.jno=07; 
		msd.name=" Mahendra singh Dhoni";
		System.out.println("Country ID: "+countryId);//91
		System.out.println("Country Name:"+countryname);//barath
		System.out.println("Jersey Number:-"+  msd.jno);//07
		System.out.println("Cricketer Name:-"+ msd.name);//Mahendra singh Dhoni

	} 

}
