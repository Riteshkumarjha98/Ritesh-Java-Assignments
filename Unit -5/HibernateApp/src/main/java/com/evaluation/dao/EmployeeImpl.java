package com.evaluation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.evaluation.entites.Employee;
import com.evaluation.exception.EmployeeException;




public class EmployeeImpl implements EmployeeDao{

	

	@Override
	public String getAddressOfEmployee(int empId) {
		String Address ="";
		EntityManager em = com.evaluation.Utility.EMUtil.provideEntityManager();
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
//======================================================================================

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String result ="Not added";
		EntityManager em = com.evaluation.Utility.EMUtil.provideEntityManager();
		
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

		
//================================================================================================	

	@Override
	public String deleteEmployee(int empId) {
		String result = null;
		EntityManager em = com.evaluation.Utility.EMUtil.provideEntityManager();
		
		Employee emp = em.find(Employee.class,empId);
		
		if(emp != null) {
			em.getTransaction().begin();
			em.remove(emp);
			result = "Deleted Successfully";
			em.getTransaction().commit();
			
			}
		return result;
		
	}
//========================================================================================

	@Override
	public String[] getNameAndAddress(int empId) {
		String[] nameAndaddress = new String[2];
		
		EntityManager em = com.evaluation.Utility.EMUtil.provideEntityManager();
		
		Employee emp = em.find(Employee.class,empId);
		
		if(emp != null) {
			em.getTransaction().begin();
			nameAndaddress[0]=emp.getName();
			nameAndaddress[1]=emp.getAddress();
			
		
			em.getTransaction().commit();
			
			}
		return nameAndaddress;
 	
	}
//==================================================================================================
	@Override
	public String saveEmployeeDetails(Employee employee) {
		String message = "";
		
   EntityManager em = com.evaluation.Utility.EMUtil.provideEntityManager();
	
    em.getTransaction().begin();
	em.persist(employee);
	message ="saved Sucessfuly";
	em.getTransaction().commit();
	em.close();
	
		
		return message;
	}
//======================================================================================================

	@Override
	public Employee getEmployeeById(int empId){
		
		Employee employee = null;
	   EntityManager em = com.evaluation.Utility.EMUtil.provideEntityManager();
		Employee emp =	em.find(Employee.class,empId);
		
		if(emp !=null) {
			  em.getTransaction().begin();
			  em.getTransaction().commit();
				
         }
	  em.close();
		return employee;
	}
//=========================================================================================================

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employee = null;
		
			  EntityManager em = com.evaluation.Utility.EMUtil.provideEntityManager();

			
				String jpql= "from Employee";
				Query q= em.createQuery(jpql);
				
				 employee= q.getResultList();
				 
			
				return employee;
}
	
}
//=========================================================================================================
