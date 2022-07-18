package com.assignment.UseCases;

import java.util.Scanner;

import com.assignment.dao.EmployeeDao;
import com.assignment.dao.EmployeeImpl;

public class DeleteEmployeeUSeCase {

	public static void main (String[] args) {
		EmployeeDao dao = new EmployeeImpl();
		
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
