package com.masai.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.masai.exception.NotFoundException;
import com.masai.model.Admin;
import com.masai.service.AdminService;


@RestController
public class AdminController {
	
	@Autowired
  private AdminService AdmService;
	


	@PostMapping(value = "/Admin")
	public ResponseEntity<Admin>  createAdminHandler(@RequestBody Admin Admin) throws NotFoundException{
	
		Admin e = AdmService.createAdmin(Admin);
		return new ResponseEntity<Admin>(e,HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "Admin/{id}")
	public ResponseEntity<Admin> findAdminByIdHandler(@PathVariable Integer id) throws NotFoundException{
		
	  Admin foundAdmin =	AdmService.findAdminById(id);
	  return new ResponseEntity<Admin>(foundAdmin,HttpStatus.ACCEPTED);
	}


	 
	
	@GetMapping("/Admins")
	public List<Admin> getAdmins() throws NotFoundException{
	   return this.AdmService.getAllAdminsDetails();
	}
	
	
	 @DeleteMapping(value= "/Admin/{id}")
	 public Admin BlockAdmin(@PathVariable int id) throws NotFoundException {
	
		 return this.AdmService.DeleteAdmin(id);
		 
		 
	 }
	
}
