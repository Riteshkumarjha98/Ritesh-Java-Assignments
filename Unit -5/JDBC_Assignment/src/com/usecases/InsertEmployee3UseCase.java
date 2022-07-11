package com.usecases;

import java.util.Scanner;

import com.bean.Employee3;
import com.dao.Employee3Dao;
import com.dao.Employee3DaoImpl;



public class InsertEmployee3UseCase {

	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Eid");
		int Eid= sc.nextInt();
		
		System.out.println("Enter name");
		String name= sc.next();
		
		System.out.println("Enter address");
		String address= sc.next();
		
		System.out.println("Enter Salary");
		int Salary= sc.nextInt();
		
		
		Employee3Dao dao = new Employee3DaoImpl();
		
		
		Employee3 Employee3 = new Employee3();
		
		
		Employee3.setEid(Eid);
		Employee3.setName(name);
		Employee3.setAddress(address);
		Employee3.setSalary(Salary);
		
		
		
		String msg= dao.insertEmployeeDetails2(Employee3);

		System.out.println(msg);
	}


}


