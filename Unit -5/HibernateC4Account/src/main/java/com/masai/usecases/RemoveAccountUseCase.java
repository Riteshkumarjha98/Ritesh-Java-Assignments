package com.masai.usecases;

import java.util.Scanner;

import com.masai.accountException.InvalidAccount;
import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class RemoveAccountUseCase {

	public static void main(String[] args) {
		
		   AccountDao dao = new AccountDaoImpl();
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Please enter you id");
			     int id =sc.nextInt();
			
				
				Account acc = new Account();
				acc.setId(id);
				
				try {
					
					dao.remove(acc);
					System.out.println("Account removed...");
					
				} catch (InvalidAccount e) {
					System.out.println(e.getMessage());
				}

	}

}
