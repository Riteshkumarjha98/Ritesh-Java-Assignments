package com.masai.usecases;

import java.util.Scanner;

import javax.security.auth.login.AccountException;

import com.masai.accountException.InsufficientBalance;
import com.masai.accountException.InvalidAccount;
import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;


public class WithdrawUseCase {
	
	public static void main(String[] args) {
		
		AccountDao dao=new AccountDaoImpl();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		
		
		try {
		Account account = dao.findById(id);
			if(account!= null) {
			try {
				System.out.println("Enter amount");
				double amount = sc.nextDouble();
				
				int BalanceAfterwithdrawAmnt = dao.withdraw(amount, account);
//	    	System.out.println("Money has withdrawn and Your Balance is: " + BalanceAfterwithdrawAmnt);
			} catch (InsufficientBalance e) {
				System.out.println(e.getMessage());
			}	
			}else {
				throw new InvalidAccount("Invalid account..");
			}
			
			
		} catch (InvalidAccount e1) {
			
			System.out.println(e1.getMessage());
		}
		
		
		
		
		
		
	
		}	

}