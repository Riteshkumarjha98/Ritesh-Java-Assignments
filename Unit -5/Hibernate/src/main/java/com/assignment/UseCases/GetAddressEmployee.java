package com.assignment.UseCases;

import java.util.Scanner;

import com.assignment.dao.AccountDao;
import com.assignment.dao.AccountImpl;
import com.assignment.entities.Account;

public class GetAddressEmployee {

	public static void main(String[] args) {
		AccountDao dao = new AccountImpl();
		
		Scanner sc  = new Scanner (System.in);
		
		System.out.println("Enter Employee Id to get Address Of Employee..!");
	
	int empId = sc.nextInt();
	
	String res = dao.getAddressOfEmployee(empId);
	if (res!=null)
	System.out.println("Address:" + res);
	else {
		System.out.println("Employee Address not Found..!");
	}
	
	}
}
