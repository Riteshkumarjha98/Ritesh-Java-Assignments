package com.masai.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.AdminException;
import com.masai.exception.NotFoundException;

import com.masai.model.Admin;

import com.masai.repository.AdminRepository;
import com.masai.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	 @Autowired
	private AdminRepository AdminRepo;
	 
	 
	@Override
	public Admin createAdmin(Admin Admin) throws NotFoundException {
		// TODO Auto-generated method stub
		return AdminRepo.save(Admin);
	}


	@Override
	public Admin findAdminById(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		
	   Optional<Admin> optAdmin =	AdminRepo.findById(id);
	   if(!optAdmin.isPresent())
		   throw new NotFoundException("Admin not Found with id : " + id);
		return optAdmin.get();
	}


	@Override
	public Admin getAdminsById(Integer id) throws NotFoundException {
		   Optional<Admin> opt = AdminRepo.findById(id);
			 
		    if(opt.isPresent()) {
		    	return opt.get();
		    }
		    else
		    	
		    	throw new NotFoundException("Admins Doesn't Exist With Id :" + id);
		}


	@Override
	public List<Admin> getAllAdminsDetails() throws NotFoundException {
	    List<Admin> Admins = AdminRepo.findAll();
		
				if(Admins.size()>0)
					return Admins;
				
				else 
					
					throw new NotFoundException("Admins Not Found");
		}


	@Override
	public Admin DeleteAdmin(Integer id) throws NotFoundException {
     Admin existingAdmin = AdminRepo.findById(id).orElseThrow(() -> new AdminException("Admin Doesn't Exist with Id "+id));
		
   
	AdminRepo.delete(existingAdmin);
			
		 return existingAdmin;
	}


	


}
