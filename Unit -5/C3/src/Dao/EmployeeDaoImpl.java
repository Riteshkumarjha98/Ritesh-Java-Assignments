package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utility.DBUtil;
import bean.Employee;
import exceptions.EmployeeException;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee getEmployeeByeid(int eid) throws EmployeeException {

		Employee Employee = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from Employee where eid =?");
			
			ps.setInt(1, eid);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				
				int r= rs.getInt("eid");
				String n= rs.getString("name");
				String a= rs.getString("address");
				int m= rs.getInt("Salary");
				
				Employee = new Employee(r, n, a, m);
				
				
			}else
				throw new EmployeeException("Employee does not exist with eid :"+eid);
			
			
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			throw new EmployeeException(e.getMessage());
		}
		
		
		return Employee;
	}
	
//=========================================================================================================

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {

		List<Employee> Employees = new ArrayList<>();
		
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from Employee");
			ResultSet rs= ps.executeQuery();
			
			
			while(rs.next()) {
				
				int r= rs.getInt("eid");
				String n= rs.getString("name");
				String a= rs.getString("address");
				int m= rs.getInt("Salary");
				
				Employee Employee = new Employee(r, n, a, m);
				
				Employees.add(Employee);
				
			}
			
			if(Employees.size() <=0)
				throw new EmployeeException("There is no any Employee");
			
			
			
			
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
			
		}
		
	
		
		return Employees;
	}


}
//=================================================================================================
	

