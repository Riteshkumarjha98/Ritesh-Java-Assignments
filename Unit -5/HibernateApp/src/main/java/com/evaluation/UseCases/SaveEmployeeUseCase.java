package com.evaluation.UseCases;

import java.util.Scanner;

import com.evaluation.dao.EmployeeDao;
import com.evaluation.dao.EmployeeImpl;
import com.evaluation.entites.Employee;

public class SaveEmployeeUseCase {

	public static void main(String[] args) {
		
		
		EmployeeDao dao = new EmployeeImpl();
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the employee name:");
		String name = sc.next();
		
		System.out.println("Enter the employee ID:");
		int empId = sc.nextInt();
		
		
		System.out.println("Enter the employee address:");
		String address = sc.next();
		System.out.println("Enter the employee salary");
		int salary = sc.nextInt();
		
		Employee newEmployee = new Employee();
		
		newEmployee.setName(name);
		newEmployee.setempId(empId);
		newEmployee.setAddress(address);
		newEmployee.setSalary(salary);
		
       String result = dao.saveEmployeeDetails(newEmployee);
       System.out.println(result);

	}

}

