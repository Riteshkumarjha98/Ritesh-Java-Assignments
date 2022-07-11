package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Utitlity.DBUtil;
import com.bean.Employee3;
import com.exceptions.Employee3Exception;


 public class Employee3DaoImpl implements Employee3Dao {



	@Override
	public String insertEmployeeDetails2(Employee3 Employee3) {
		
    String message = "Not inserted...";
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("insert into Employee3 values(?,?,?,?)");
			
			ps.setInt(1, Employee3.getEid());
			ps.setString(2, Employee3.getName());
			ps.setString(3, Employee3.getAddress());
			ps.setInt(4, Employee3.getSalary());
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				message = "Inserted successfully..!";
			
			else {
				message = "Not Inserted...!";
			}
			
		} catch (SQLException e) {
		
			message = e.getMessage();
		}
		
		
	return message;
		
	}
//===================================================================================================================	

	@Override
	public int getSalaryByEid(int eid) throws Employee3Exception {
     int Salary = -1;
		

		try(Connection conn = DBUtil.provideConnection()) {
			

		PreparedStatement ps= conn.prepareStatement("select Salary from Employee3 where eid=?");	
			
		ps.setInt(1, eid);
		
		ResultSet rs= ps.executeQuery();
			
		if(rs.next())
			Salary= rs.getInt("Salary");
		else
		{
			//Employee3Exception exp = new Employee3Exception("Employee3 does not exist with the eid: "+eid);
			//throw exp;
			
			
			throw new Employee3Exception("Employee3 does not exist with eid :"+eid);
		}
		
		
			
			
		} catch (SQLException e) {
			//e.printStackTrace();
			throw new Employee3Exception(e.getMessage());
			
		}
		
		
		return Salary;
	}
//============================================================================================================
	@Override
	public Employee3 getEmployee3Byeid(int eid) throws Employee3Exception {

		Employee3 Employee3 = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from Employee3 where eid =?");
			
			ps.setInt(1, eid);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				
				int r= rs.getInt("eid");
				String n= rs.getString("name");
				String a= rs.getString("address");
				int m= rs.getInt("Salary");
				
				Employee3 = new Employee3(r, n, a, m);
				
				
			}else
				throw new Employee3Exception("Employee3 does not exist with eid :"+eid);
			
			
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			throw new Employee3Exception(e.getMessage());
		}
		
		
		return Employee3;
	}
	
//=========================================================================================================

	@Override
	public List<Employee3> getAllEmployee3s() throws Employee3Exception {

		List<Employee3> Employee3s = new ArrayList<>();
		
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from Employee3");
			ResultSet rs= ps.executeQuery();
			
			
			while(rs.next()) {
				
				int r= rs.getInt("eid");
				String n= rs.getString("name");
				String a= rs.getString("address");
				int m= rs.getInt("Salary");
				
				Employee3 Employee3 = new Employee3(r, n, a, m);
				
				Employee3s.add(Employee3);
				
			}
			
			if(Employee3s.size() <=0)
				throw new Employee3Exception("There is no any Employee3");
			
			
			
			
			
		} catch (SQLException e) {
			throw new Employee3Exception(e.getMessage());
			
		}
		
	
		
		return Employee3s;
	}

//=========================================================================================================
	
	@Override
	public List<Employee3> getAllEmployee3salary_less8k() throws Employee3Exception {

		List<Employee3> Employee3s = new ArrayList<>();
		
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from employee3 where salary < 80000");
			ResultSet rs= ps.executeQuery();
			
			
			while(rs.next()) {
				
				int r= rs.getInt("eid");
				String n= rs.getString("name");
				String a= rs.getString("address");
				int m= rs.getInt("Salary");
				
				Employee3 Employee3 = new Employee3(r, n, a, m);
				
				Employee3s.add(Employee3);
				
			}
			
			if(Employee3s.size() <=0)
				throw new Employee3Exception("There is no any Employee3");
			
			
			
			
			
		} catch (SQLException e) {
			throw new Employee3Exception(e.getMessage());
			
		}
		
	
		
		return Employee3s;
	}


//============================================================================================
	@Override
	public boolean GivingBonus() throws Employee3Exception{
		
	boolean flag = false;
		
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("update employee3 set salary = salary + 500");
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				flag = true;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return flag;
		
		
	}

 }
	
//========================================================================================================================================



