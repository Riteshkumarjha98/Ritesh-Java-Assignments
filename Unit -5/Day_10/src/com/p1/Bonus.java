package com.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loding the driver main class");
		}
		
		String cs = "jdbc:mysql://localhost:3306/db1";
		

		
		try {
		 Connection conn= DriverManager.getConnection(cs,"root","Rkj@1998");	
//         java.sql.Statement st= conn.createStatement();
		 
         PreparedStatement ps = conn.prepareCall("update employee set salary = salary+500 " );
         int rs = ps.executeUpdate();
         
         if (rs >0) {
        	
        	 
        	 System.out.println(rs+ "updated");
         } 
         else {
        		 System.out.println(rs+ "Not updated");
        	 }
        	 
         
           if(conn != null)
				System.out.println("connected");
			else
				System.out.println("not connected..");
				
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
}
	
