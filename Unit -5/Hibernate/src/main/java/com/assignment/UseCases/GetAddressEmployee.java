package com.assignment.UseCases;

import java.util.Scanner;

import com.assignment.dao.EmployeeDao;
import com.assignment.dao.EmployeeImpl;
import com.assignment.entities.Employee;

public class GetAddressEmployee {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeImpl();
		
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
