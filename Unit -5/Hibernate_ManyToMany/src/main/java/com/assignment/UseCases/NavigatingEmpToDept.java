package com.assignment.UseCases;

import java.util.List;

import javax.persistence.EntityManager;

import com.assignment.Utility.EMUtil;
import com.assignment.model.Department;
import com.assignment.model.Employee;

public class NavigatingEmpToDept {

	public static void main (String[] args) {
		
	EntityManager em = EMUtil.provideEntityManager();
	

	List<Department> dlist =em.find(Employee.class, 2).getDeptList();
	
	dlist.forEach(a->{
		
	System.out.println(a.getDeptId());
	System.out.println(a.getDname());
	System.out.println(a.getLocation());
	
	});
//	System.out.println(dlist);
	
	
	
	}
}
