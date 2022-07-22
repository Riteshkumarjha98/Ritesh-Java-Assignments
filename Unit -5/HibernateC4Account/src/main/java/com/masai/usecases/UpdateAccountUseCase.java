package com.masai.usecases;

import java.util.Scanner;

import com.masai.accountException.InvalidAccount;
import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class UpdateAccountUseCase {

	public static void main(String[] args) {
		
   AccountDao dao = new AccountDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter you id");
	     int id =sc.nextInt();
	     
	     System.out.println("Please enter you email");
	     String email =sc.next();
		
	     System.out.println("Please enter you address");
	     String address =sc.next();
		
		
		Account acc = new Account();
		
		acc.setId(id);
		acc.setEmail(email);
		acc.setAddress(address);
		
	   try {
		Account account = dao.findById(id);
		
		
		if(account != null) {
			try {
			dao.update(acc);
		} catch (InvalidAccount e) {
			System.out.println(e.getMessage());
		}
			
		}
		else {
			throw new InvalidAccount("Invalid account..");
		}
	} catch (InvalidAccount e1) {
		System.out.println(e1.getMessage());
	}
		
		

	}

}
