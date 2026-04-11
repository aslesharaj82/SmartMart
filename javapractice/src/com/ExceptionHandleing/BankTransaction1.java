package com.ExceptionHandleing;



public interface BankTransaction1 {
	
	void withdraw(double Amount) throws InsufficientAmount,INvalidAmount;
	
	
}
