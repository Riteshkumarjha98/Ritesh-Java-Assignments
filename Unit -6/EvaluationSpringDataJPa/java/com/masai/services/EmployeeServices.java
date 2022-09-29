package com.masai.services;


import java.util.List;

import com.masai.exceptions.EmployeeException;

import com.masai.model.Employee;


public interface EmployeeServices {
	
	public Employee AddEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee) throws EmployeeException;
		
	
     public Employee deleteEmployeeById(Integer id) throws EmployeeException;

	 public List<Employee> getAllEmployeeDetaisl() throws EmployeeException;
	


}
