package com.p1;

public class Account {
	String accountNumber;
	double balance = 0;
	
	Account(String message){
		this.accountNumber = message;
	}
       void deposit (int amount) {
	balance = balance + amount;
   }
         double withdraw (int amount) throws InsufficientFundsException {
	 if(amount > balance) {
		 throw new InsufficientFundsException("Insufficient balance in your Acount");
	 }
	 return balance - amount;
 }


}