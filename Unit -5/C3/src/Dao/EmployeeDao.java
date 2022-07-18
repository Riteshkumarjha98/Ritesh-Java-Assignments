package Dao;

import java.util.List;

import bean.Employee;
import exceptions.EmployeeException;

public interface EmployeeDao {
	Employee getEmployeeByeid(int eid) throws  EmployeeException;
    
	List<Employee> getAllEmployees() throws EmployeeException;

	
}
