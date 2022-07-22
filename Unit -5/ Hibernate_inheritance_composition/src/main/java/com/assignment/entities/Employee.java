package com.assignment.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "pid")
public class Employee extends Person {
  
	private int salary;	
	@Embedded
	@ElementCollection
	@JoinTable(name = "emp_address", joinColumns = @JoinColumn(name ="pid"))

	private Set<Address>addrs = new HashSet<>();
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Set<Address> getAddrs() {
		return addrs;
	}
	public void setAddrs(Set<Address> addrs) {
		this.addrs = addrs;
	}

	
}
