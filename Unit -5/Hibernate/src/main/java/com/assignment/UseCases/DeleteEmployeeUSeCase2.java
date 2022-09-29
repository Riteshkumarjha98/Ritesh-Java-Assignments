package com.assignment.UseCases;

import java.util.Scanner;

import com.assignment.dao.AccountDao;
import com.assignment.dao.AccountImpl;

public class DeleteEmployeeUSeCase2 {

	public static void main (String[] args) {
		AccountDao dao = new AccountImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id to delete Employee..!");
		int empId = sc.nextInt();
		
		boolean result=dao.deleteEmployee(empId);
		
		if(result)
			System.out.println("Employee Deleted...!");
		else {
			System.out.println("Employee not delted..!");
		}
	}
}
