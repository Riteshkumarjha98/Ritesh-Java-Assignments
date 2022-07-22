package com.assignment.dao;

import java.util.List;

import com.assignment.entities.Account;

public interface AccountDao {

	public List<Account> getAllEmployee();

	public String getAddressOfEmployee(int empId);

	public String giveBonusToEmployee(int empId, int bonus);

	public boolean deleteEmployee(int empId);

	public String[] getNameAndAddress(int empId);
}
