package com.masai.service;


import java.util.List;

import com.masai.exception.NotFoundException;
import com.masai.model.Admin;


public interface AdminService {

	public Admin createAdmin(Admin Admin) throws NotFoundException;
	
	public Admin findAdminById(Integer id) throws NotFoundException;
	
	public Admin getAdminsById(Integer id) throws NotFoundException;
	
	public List<Admin> getAllAdminsDetails() throws NotFoundException;
	
	public Admin DeleteAdmin(Integer id)  throws NotFoundException;

	
	
}
