package com.contest.services;


import java.util.List;


import com.contest.exception.NotFoundException;
import com.contest.model.Tags;


public interface TagsService {

	public Tags createTags(Tags Tags) throws NotFoundException;
	
    public Tags getTagssById(Integer id) throws NotFoundException;
    
    public Tags updateTags(Integer id, Tags Tags) throws NotFoundException;
	
	public List<Tags> getAllTagssDetails() throws NotFoundException;
	
	public Tags DeleteTags(Integer id)  throws NotFoundException;

	


	
}
