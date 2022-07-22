package com.assignment.dao;

import java.util.List;

import com.assignment.entities.Employee;

public interface EmployeeDao {

	public List<Employee> getAllEmployee();
	
	public void save (Employee employee);
}
