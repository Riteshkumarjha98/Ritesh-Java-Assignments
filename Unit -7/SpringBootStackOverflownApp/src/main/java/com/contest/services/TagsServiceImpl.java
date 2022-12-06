package com.contest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.contest.exception.NotFoundException;
import com.contest.model.Tags;
import com.contest.model.Tags;
import com.contest.repository.TagsRepository;
import com.contest.exception.TagsException;


@Service
public class TagsServiceImpl implements TagsService{

	 @Autowired
	private TagsRepository TagsRepo;
	 
	 
	@Override
	public Tags createTags(Tags Tags) throws NotFoundException {
		// TODO Auto-generated method stub
		return TagsRepo.save(Tags);
	}





	@Override
	public Tags getTagssById(Integer id) throws NotFoundException {
		   Optional<Tags> opt = TagsRepo.findById(id);
			 
		    if(opt.isPresent()) {
		    	return opt.get();
		    }
		    else
		    	
		    	throw new NotFoundException("Tagss Doesn't Exist With Id :" + id);
		}


	@Override
	public List<Tags> getAllTagssDetails() throws NotFoundException {
	    List<Tags> Tagss = TagsRepo.findAll();
		
				if(Tagss.size()>0)
					return Tagss;
				
				else 
					
					throw new NotFoundException("Tagss Not Found");
		}


	@Override
	public Tags DeleteTags(Integer id) throws NotFoundException {
       Tags existingTags = TagsRepo.findById(id).orElseThrow(() -> new TagsException("Tags Doesn't Exist with Id "+id));
		
     
	TagsRepo.delete(existingTags);
			
		 return existingTags;
	}





	@Override
	public Tags updateTags(Integer id, Tags Tags) throws NotFoundException {
		Optional<Tags> optTags = TagsRepo.findById(id);
		if(!optTags.isPresent())
			throw new NotFoundException("Tags not found with id : " + id);
		
		   Tags updatedTags =   optTags.get();
		   updatedTags.setTitle(Tags.getTitle());
		   updatedTags.setDescription(Tags.getDescription());
		  
		    return Tags;
	}


	

}
