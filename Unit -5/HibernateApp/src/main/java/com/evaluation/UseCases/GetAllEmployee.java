//package com.evaluation.UseCases;
//
//import com.evaluation.dao.EmployeeDao;
//import com.evaluation.dao.EmployeeImpl;
//import com.evaluation.entites.Employee;
//
//import antlr.collections.List;
//
//public class GetAllEmployee {
//
//	EmployeeDao dao = new EmployeeImpl();
//	
//	
//	List<Employee> employees= dao.getAllEmployees();
//	
//	  employees.forEach(s -> {
//		
//		System.out.println("Id is :"+s.getEmpId());
//		System.out.println("Name is :"+s.getName());
//		System.out.println("Address is :"+s.getAddress());
//		System.out.println("Salary is :"+s.getSalary());
//		
//		System.out.println("==================================");
//		
//	});
//
//	
//
//
//}
