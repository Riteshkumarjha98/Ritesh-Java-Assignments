package com.masai.usecases;

import java.util.Scanner;

import com.masai.accountException.InvalidAccount;
import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class FindByIdUseCase {
  
public static void main(String[] args) {
	
	
	AccountDao dao = new AccountDaoImpl();
	
	Scanner sc = new Scanner(System.in);
	
	  System.out.println("Enter you id");
	  int id  = sc.nextInt();
	  
	  
	  try {
		Account account = dao.findById(id);
		if(account !=null) {
		System.out.println(account);	
		}else {
			throw new InvalidAccount("Invalid account...");
		}
		
	} catch (InvalidAccount e) {
		System.out.println(e.getMessage());
	}
	
	
}
     
}
