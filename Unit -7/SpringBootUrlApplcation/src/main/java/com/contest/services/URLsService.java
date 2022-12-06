package com.contest.services;


import java.util.List;

import com.contest.exception.NotFoundException;
import com.contest.model.URLs;

public interface URLsService {
   
	public URLs createURLs(URLs URLs);
	
   public URLs deleteURLss(Integer id)  throws NotFoundException;
	
	public List<URLs> getAllURLsDetails() throws NotFoundException;
}
