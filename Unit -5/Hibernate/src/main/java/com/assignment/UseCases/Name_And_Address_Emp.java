package com.assignment.UseCases;

import java.util.Scanner;

import com.assignment.dao.AccountDao;
import com.assignment.dao.AccountImpl;

public class Name_And_Address_Emp {

	public static void main(String[] args) {
		AccountDao dao = new AccountImpl();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id to get Name And Address..!");
	    int id= sc.nextInt();
	
	    String[] result = dao.getNameAndAddress(id);
	
	    System.out.println("Name:" +result[0]+"\n"+ "Address:" + result[1]);
	
	
	}

}
