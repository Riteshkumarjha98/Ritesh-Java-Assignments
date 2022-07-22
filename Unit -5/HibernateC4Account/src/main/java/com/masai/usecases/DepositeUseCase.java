package com.masai.usecases;

import java.util.Scanner;

import com.masai.accountException.InvalidAccount;
import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class DepositeUseCase {
public static void main(String[] args) {
		
		AccountDao dao = new AccountDaoImpl();
		
		
		Scanner sc = new Scanner(System.in);
		
	     
		try {
			 
			System.out.println("Please enter you id");
		     int id =sc.nextInt();
		     
			Account account = dao.findById(id);
			
			if(account == null) {
				throw new InvalidAccount("Account not match..");
			}else {
				System.out.println("Enter amount");
			double amount = sc.nextDouble();
	     	String res = dao.deposit(amount, account);
			System.out.println(res);
			}
			
			
		} catch (InvalidAccount e) {
			
			System.out.println(e.getMessage());
		}
		
			
	}
	
	
}
