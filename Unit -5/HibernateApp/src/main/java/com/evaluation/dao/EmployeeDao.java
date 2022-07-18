package com.evaluation.dao;

import java.util.List;

import com.evaluation.entites.Employee;
import com.evaluation.exception.EmployeeException;



public interface EmployeeDao {

	public String getAddressOfEmployee(int empId);

	public String giveBonusToEmployee(int empId, int bonus);

	public String[] getNameAndAddress(int empId);

	public String saveEmployeeDetails(Employee employee);
	
	public Employee getEmployeeById(int empId);
	
	public List<Employee> getAllEmployees();
	
	public String deleteEmployee(int empId);

	

}
