package com.p1;

public class AccountDemo {
	public static void main(String[] args) {
		Account acc = new Account("707988088479555");
		acc.deposit(5000);
	
		try {
			double withdrawnAmount = acc.withdraw(2000);
			System.out.println("The Amount Left After Withdrawn Is : " + withdrawnAmount + ".");
		}
		catch(InsufficientFundsException ife) {
			System.out.println(ife.getMessage());
		}
	
	}
}