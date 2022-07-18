package com.assignment.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.assignment.entities.Employee;



public class EmployeeImpl implements EmployeeDao{

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		String Address ="";
	 EntityManager em = com.assignment.Utiltity.EMUtil.provideEntityManager();
		Employee emp = em.find(Employee.class, empId);
		
		if(emp != null) {
			em.getTransaction().begin();
			
			 Address =emp.getAddress();
			
			 em.getTransaction().commit();
			
			}
		else {
			System.out.println("Employee does not found..!");
		    Address = null;
		}
		
		
		
		return Address;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String result ="Not added";
		EntityManager em = com.assignment.Utiltity.EMUtil.provideEntityManager();
		
		Employee employee=em.find(Employee.class, empId);
		
		if( employee == null){
			System.out.println("Employee does not exist..");
		}
		else
		{
			
          em.getTransaction().begin();
          employee.setSalary(employee.getSalary()+bonus);
		  em.getTransaction().commit();
			
		}
	
		return result;
		
		
	}

		
	

	@Override
	public boolean deleteEmployee(int empId) {
		boolean res = false;
		EntityManager em = com.assignment.Utiltity.EMUtil.provideEntityManager();
		
		Employee emp = em.find(Employee.class,empId);
		
		if(emp != null) {
			em.getTransaction().begin();
			em.remove(emp);
			res=true;
			em.getTransaction().commit();
			
			}
		return res;
		
	}

	@Override
	public String[] getNameAndAddress(int empId) {
		String[] nameAndaddress = new String[2];
		
   EntityManager em = com.assignment.Utiltity.EMUtil.provideEntityManager();
		
		Employee emp = em.find(Employee.class,empId);
		
		if(emp != null) {
			em.getTransaction().begin();
			nameAndaddress[0]=emp.getName();
			nameAndaddress[1]=emp.getAddress();
			
		
			em.getTransaction().commit();
			
			}
		return nameAndaddress;
 
	
	}

}
