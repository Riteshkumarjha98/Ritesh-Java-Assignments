package com.contest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contest.exception.NotFoundException;


import com.contest.model.URLs;
import com.contest.repository.URLsRepository;
import com.contest.exception.URLsException;

@Service
public class URLsServiceImpl implements URLsService {

	@Autowired
	private URLsRepository URLsRepo;

	@Override
	public URLs createURLs(URLs URLs) {
		// TODO Auto-generated method stub
		return URLsRepo.save(URLs);
	}



	@Override
	public URLs deleteURLss(Integer id) throws NotFoundException {

		URLs existingURLss= URLsRepo.findById(id).orElseThrow(() -> new URLsException("URLss Doesn't Exist with Id "+id));
		
		URLsRepo.delete(existingURLss);
			
		 return existingURLss;
	}
	
	

	@Override
	public List<URLs> getAllURLsDetails() throws NotFoundException {
		
	    List<URLs> URLs = URLsRepo.findAll();
		
					if(URLs.size()>0)
						return URLs;
					else 
						throw new NotFoundException("URLs Not Found");
			}
	

	}



	


