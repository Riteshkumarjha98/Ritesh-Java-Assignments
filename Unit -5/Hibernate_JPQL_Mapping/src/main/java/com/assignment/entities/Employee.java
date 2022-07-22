package com.assignment.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int empId;
	private String name;
	private String gender;
	private int Salary;
	
	@ElementCollection
	@Embedded
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private Set<Address> empAddress = new HashSet<Address>();

	public Employee(int empId, String name, String gender, int salary, Set<Address> empAddress) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.Salary = salary;
		this.empAddress = empAddress;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public Set<Address> getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Set<Address> empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", gender=" + gender + ", Salary=" + Salary
				+ ", empAddress=" + empAddress + "]";
	}
	
	
	
	

}
