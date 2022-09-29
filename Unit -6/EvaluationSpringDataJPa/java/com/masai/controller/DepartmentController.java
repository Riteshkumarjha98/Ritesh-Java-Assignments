package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.DepartmentException;
import com.masai.model.Department;
import com.masai.services.DepartmentService;


@RestController
public class DepartmentController {
	
	@Autowired
  private DepartmentService DepartmentServices;   

	
   @PostMapping("/departments")
  public Department AddDepartmentHandler(@RequestBody Department Department) {
	  return DepartmentServices.AddDepartment(Department);
  }
   
   
   @GetMapping("/Departments")
   public ResponseEntity<List<Department>> getAllDepartmentsHandler() throws DepartmentException{
	   
	 List<Department> Departments =  DepartmentServices.getAllDepartmentDetaisl();
	 return new ResponseEntity<List<Department>>(Departments,HttpStatus.OK);
	   
   }
   
  
   
	@PutMapping("/Departments")
	public ResponseEntity<Department> updateDepartmentHandler(@RequestBody Department Department) throws DepartmentException {
		
	Department updatedDepartment = DepartmentServices.updateDepartment(Department);

		return new ResponseEntity<Department>(updatedDepartment,HttpStatus.ACCEPTED);

	}
   
   
	@DeleteMapping("Departments/{id}")
	public Department deleteDepartmentById(@PathVariable("id") Integer id) throws DepartmentException  {
		
		return DepartmentServices.deleteDepartmentById(id);
	}
	
	
}