package com.assignment.UseCases;

import java.util.List;

import javax.persistence.EntityManager;

import com.assignment.Utility.EMUtil;
import com.assignment.model.Department;
import com.assignment.model.Employee;

public class NavigatingDeptToEmp {

	public static void main (String[] args) {
		
	EntityManager em = EMUtil.provideEntityManager();
	
	List<Employee>empList = em.find(Department.class,1).getEmpList();

	empList.forEach(a->{
		
	System.out.println(a.getEname());
	System.out.println(a.getEmpId());
	System.out.println(a.getAddress());
	System.out.println(a.getSalary());
	
	});
	
	}

}