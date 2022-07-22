package com.masai.dao;

import javax.persistence.EntityManager;
import javax.security.auth.login.AccountException;

import com.masai.accountException.InsufficientBalance;
import com.masai.accountException.InvalidAccount;
import com.masai.entities.Account;

import com.masai.utility.EMUtil;


public class AccountDaoImpl implements AccountDao{


	@Override
	public void save(Account account) {
		
     EntityManager em= EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(account);
		System.out.println("Account Saved in DB");
		
		em.getTransaction().commit();
		
		
		em.close();
		
	}



	@Override
	public Account findById(int id) throws InvalidAccount {
	
		return EMUtil.provideEntityManager().find(Account.class, id);
	}



	@Override
	public void update(Account account) throws InvalidAccount {

		EntityManager em= EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(account);
		System.out.println("Account Updated");
		
		em.getTransaction().commit();
	
		em.close();
		
	}



	@Override
	public void remove(Account account) throws InvalidAccount {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Account acc=em.find(Account.class, account.getId());
		
		if(acc != null) {
			em.getTransaction().begin();
			
			em.remove(acc);
			
			
			em.getTransaction().commit();

		     em.close();
		}else {
			throw new InvalidAccount("Invalid Account..");
		}
		
		
	}



	@Override
	public int withdraw(double amount, Account account) throws InsufficientBalance {
		
		int res = 0;
		
       EntityManager em= EMUtil.provideEntityManager();
		
		Account acc  =   em.find(Account.class, account.getId());
		
		   if(acc.getBalance() >= amount){
			
			
			em.getTransaction().begin();
		    acc.setBalance(acc.getBalance() - amount);
		    em.merge(acc);
		    System.out.println("Widthraw done...");
			
			em.getTransaction().commit();	
			}else {
				throw new InsufficientBalance("Insufficient Balance in your Account..");
			}
			
		
		return (int)acc.getBalance();

	}



	@Override
	public String deposit(double amount, Account account) throws InvalidAccount {
		
		
		String res = "Not deposited..";
		
     EntityManager em= EMUtil.provideEntityManager();
			
			Account acc  =  em.find(Account.class, account.getId());
			
			if(acc != null){
				
				em.getTransaction().begin();
				
			     acc.setBalance(account.getBalance()  + amount);
			      res = "Deposite done...";
			   
				em.getTransaction().commit();
				em.close();
				
			}
		
		return res;
	}

}
