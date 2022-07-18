package com.evaluation.UseCases;

import java.util.Scanner;

import com.evaluation.dao.EmployeeDao;
import com.evaluation.dao.EmployeeImpl;



public class DeleteEmployeeUSeCase {

	public static void main (String[] args) {
		EmployeeDao dao = new EmployeeImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id to delete Employee..!");
		int empId = sc.nextInt();
		
		String result=dao.deleteEmployee(empId);
		System.out.println(result);
		
		
	}
}

