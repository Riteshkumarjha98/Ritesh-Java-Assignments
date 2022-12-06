package com.contest.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.contest.exception.NotFoundException;
import com.contest.model.User;
import com.contest.services.UserService;

@RestController
public class UserController {
	
	@Autowired
    private UserService UsrService;
	

    @PostMapping(value = "/User")
	public ResponseEntity<User>  createUserHandler(@RequestBody User User) throws NotFoundException{
	
		User e = UsrService.createUser(User);
		return new ResponseEntity<User>(e,HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "User/{id}")
	public ResponseEntity<User> findUserByIdHandler(@PathVariable Integer id) throws NotFoundException{
		
	  User foundUser =	UsrService.findUserById(id);
	  return new ResponseEntity<User>(foundUser,HttpStatus.ACCEPTED);
	}


	 
	
	@GetMapping("/Users")
	public List<User> getUsers() throws NotFoundException{
	   return this.UsrService.getAllUsersDetails();
	}
	
	
	 @DeleteMapping(value= "/User/{id}")
	 public User BlockUser(@PathVariable int id) throws NotFoundException {
//		
		 return this.UsrService.BlockUser(id);
		 
		 
	 }
	
}
