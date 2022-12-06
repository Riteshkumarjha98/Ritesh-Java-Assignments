package com.contest.services;


import java.util.List;

import com.contest.exception.NotFoundException;
import com.contest.model.Followers;

public interface FollowersService {
   
	public Followers createFollowers(Followers Followers);
	
	 Followers deleteFollowerss(Integer id)  throws NotFoundException;
	
	public List<Followers> getAllFollowersDetails() throws NotFoundException;
}
