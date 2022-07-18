package com.evaluation.UseCases;

import java.util.Scanner;

import com.evaluation.dao.EmployeeDao;
import com.evaluation.dao.EmployeeImpl;
import com.evaluation.entites.Employee;

public class GetEmployeeByIdUseCase {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id..!");
	
		int id = sc.nextInt();
		
		EmployeeDao dao = new EmployeeImpl();
		Employee e = dao.getEmployeeById(id);
		
		System.out.println(e);
		
		}
		
	
	}


