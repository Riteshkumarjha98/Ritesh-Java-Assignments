package com.contest.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contest.exception.NotFoundException;


import com.contest.model.Followers;
import com.contest.repository.FollowersRepository;
import com.contest.exception.FollowersException;

@Service
public class FollowersServiceImpl implements FollowersService {

	@Autowired
	private FollowersRepository FollowersRepo;

	@Override
	public Followers createFollowers(Followers Followers) {
		// TODO Auto-generated method stub
		return FollowersRepo.save(Followers);
	}



	@Override
	public Followers deleteFollowerss(Integer id) throws NotFoundException {

		Followers existingFollowers= FollowersRepo.findById(id).orElseThrow(() -> new FollowersException("Followerss Doesn't Exist with Id "+id));
		
		FollowersRepo.delete(existingFollowers);
			
		 return existingFollowers;
	}
	
	

	@Override
	public List<Followers> getAllFollowersDetails() throws NotFoundException {
		
	    List<Followers> Followers = FollowersRepo.findAll();
		
					if(Followers.size()>0)
						return Followers;
					else 
						throw new NotFoundException("Followers Not Found");
			}
	

	}



	


