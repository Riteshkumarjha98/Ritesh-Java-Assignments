package com.assignment.UseCases;

import java.util.Scanner;

import com.assignment.dao.AccountDao;
import com.assignment.dao.AccountImpl;

  public class GiveBonusUseCase {

	public static void main (String[] args) {
		
		AccountDao dao = new AccountImpl();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The  Employee Id To Give  Bonus..!");
		int empId = sc.nextInt();
		System.out.println("Enter bonus Amount to be added");
		int bonus = sc.nextInt();
	
		

		String res = dao.giveBonusToEmployee(empId,bonus);
	
			System.out.println("Bonus Added to Employee..!");

		
		}
	}

