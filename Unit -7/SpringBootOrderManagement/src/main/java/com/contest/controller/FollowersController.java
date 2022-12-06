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
import com.contest.model.Followers;
import com.contest.services.FollowersService;

@RestController
public class FollowersController {
	
	@Autowired
	private FollowersService FollowersServices;
	
	
	@PostMapping(value = "/Followers")
	public ResponseEntity<com.contest.model.Followers> createFollowersHandler(@RequestBody Followers Followers){
		
		Followers createdFollowers = FollowersServices.createFollowers(Followers);
		
		return new ResponseEntity<>(createdFollowers,HttpStatus.CREATED);
	
	}
	
	 // Deleting Followerss By Id
	
	 @DeleteMapping("/Followers/{Id}")
	 public Followers deleteFollowerss(@PathVariable int Id) throws NotFoundException {
		 return this.FollowersServices.deleteFollowerss(Id);
		 
	 }
	 
		
		@GetMapping("/Followers")
		public List<Followers> getFollowers() throws NotFoundException{
		   return this.FollowersServices.getAllFollowersDetails();
		}
		
	 

}
