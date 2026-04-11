package com.ExceptionHandleing;

 public class InvalidUserNameException extends Exception{

	public InvalidUserNameException(String msg) {
		super(msg);
	}

	

}
 class NegativeNumberException extends Exception{

	public NegativeNumberException(String string) {
		super(string);
	}
	 
 }
 class IncorrectPasswordException extends Exception{

	public IncorrectPasswordException(String string) {
		super(string);
	}
	 
 }
