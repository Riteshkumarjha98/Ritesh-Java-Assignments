package com.assignment.UseCases;

import java.util.Scanner;

import com.assignment.dao.EmployeeDao;
import com.assignment.dao.EmployeeImpl;

public class Name_And_Address_Emp {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeImpl();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id to get Name And Address..!");
	    int id= sc.nextInt();
	
	    String[] result = dao.getNameAndAddress(id);
	
	    System.out.println("Name:" +result[0]+"\n"+ "Address:" + result[1]);
	
	
	}

}
