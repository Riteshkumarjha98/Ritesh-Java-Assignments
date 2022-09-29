package com.masai.services;

import java.util.List;

import com.masai.exceptions.DepartmentException;
import com.masai.model.Department;


public interface DepartmentService {

	public Department AddDepartment(Department Department);
	
	public Department updateDepartment(Department Department) throws DepartmentException;
	
	
    public Department deleteDepartmentById(Integer id) throws DepartmentException;

	 public List<Department> getAllDepartmentDetaisl() throws DepartmentException;
}
