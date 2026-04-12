package com.atm.model;
//create a POJO Class Account
//Include the following private fields:
//accountNo
//name
//pin
//balance
//Provide:
//Getters
//Setters

public class Account {
	private int accountNo;
	private long atmCardNumber;
	private String name;
	private int pin;
	private double balance;   
	
	public void setAtmCardNumber(long atmCardNumber) {
		this.atmCardNumber=atmCardNumber;
		
	}
	public long getAtmCardNumber() {
		return atmCardNumber;
		
	}
	
	public void setAccountNo(int accountNo) {
		this.accountNo=accountNo; 
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public void setName(String name) {
		this.name=name; 
	}
	
	public String getName() {
		return name;
	}
	
	public void setPin(int pin) {
		this.pin=pin; 
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setBalance(double balance) {
		this.balance=balance; 
	}
	
	public double getBalance() {
		return balance;
	}

}
