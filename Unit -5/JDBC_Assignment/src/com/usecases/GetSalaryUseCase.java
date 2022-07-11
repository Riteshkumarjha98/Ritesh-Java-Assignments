package com.usecases;

import java.util.Scanner;

import com.bean.Employee3;
import com.dao.Employee3Dao;
import com.dao.Employee3DaoImpl;
import com.exceptions.Employee3Exception;


public class GetSalaryUseCase {

public static void main(String[] args)  {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Eid");
		int Eid= sc.nextInt();

		Employee3Dao dao = new Employee3DaoImpl();

		try {
			int Salary = dao.getSalaryByEid(Eid);
			
			
			
			System.out.println("Employee3 Salary is :"+Salary);
			
		} 
		catch (Employee3Exception e) {
			System.out.println(e.getMessage());
		}
		
		
}

}



