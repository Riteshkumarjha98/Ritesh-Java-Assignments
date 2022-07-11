package com.usecases;

import java.util.List;

import com.bean.Employee3;
import com.dao.Employee3Dao;
import com.dao.Employee3DaoImpl;
import com.exceptions.Employee3Exception;



public class Get_All_Employee3_Detail {
	
	public static void main (String[] args) {
		

	Employee3Dao dao = new Employee3DaoImpl();
	
     try {
		
		List<Employee3> Employee3s= dao.getAllEmployee3s();
		
		Employee3s.forEach(s -> {
			
			System.out.println("Id is :"+s.getEid());
			System.out.println("Name is :"+s.getName());
			System.out.println("Address is :"+s.getAddress());
			System.out.println("Salary is :"+s.getSalary());
			
			System.out.println("==================================");
			
		});
		
		
      } catch (Employee3Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
	
	
	
}
