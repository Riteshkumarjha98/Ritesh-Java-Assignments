package com.p3;

public class Account {
	
	double balance = 0;
	public int accountNo;
	private String accountNumber;
	
	Account(String message){
		this.accountNumber = message;
	}
       public Account() {
		// TODO Auto-generated constructor stub
	}
	void deposit (int amount) {
	balance = balance + amount;
   }
         double withdraw (int amount) throws InsufficientFundsException {
	 if(amount > balance) {
		
	 }
	 return balance - amount;
 }


}