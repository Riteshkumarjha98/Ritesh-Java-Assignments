package com.contest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.contest.exception.NotFoundException;
import com.contest.model.User;
import com.contest.repository.UserRepository;
import com.contest.exception.UserException;


@Service
public class UserServiceImpl implements UserService{

	 @Autowired
	private UserRepository UserRepo;
	 
	 
	@Override
	public User createUser(User User) throws NotFoundException {
		// TODO Auto-generated method stub
		return UserRepo.save(User);
	}


	@Override
	public User findUserById(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		
	   Optional<User> optUser =	UserRepo.findById(id);
	   if(!optUser.isPresent())
		   throw new NotFoundException("User not Found with id : " + id);
		return optUser.get();
	}


	@Override
	public User getUsersById(Integer id) throws NotFoundException {
		   Optional<User> opt = UserRepo.findById(id);
			 
		    if(opt.isPresent()) {
		    	return opt.get();
		    }
		    else
		    	
		    	throw new NotFoundException("Users Doesn't Exist With Id :" + id);
		}


	@Override
	public List<User> getAllUsersDetails() throws NotFoundException {
	    List<User> Users = UserRepo.findAll();
		
				if(Users.size()>0)
					return Users;
				
				else 
					
					throw new NotFoundException("Users Not Found");
		}


	@Override
	public User BlockUser(Integer id) throws NotFoundException {
       User existingUser = UserRepo.findById(id).orElseThrow(() -> new UserException("User Doesn't Exist with Id "+id));
		
     
	UserRepo.delete(existingUser);
			
		 return existingUser;
	}





}
