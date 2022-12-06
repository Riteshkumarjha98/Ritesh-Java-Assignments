package com.contest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.contest.exception.NotFoundException;
import com.contest.model.Category;
import com.contest.model.User;
import com.contest.repository.CategoryRepository;



@Service
public class CategoryServiceImpl implements CategoryService{

	 @Autowired
	private CategoryRepository CategoryRepo;
	 
	 
	
    @Override
	public List<Category> getAllCategorysDetails() throws NotFoundException {
	    List<Category> Categorys = CategoryRepo.findAll();
		
				if(Categorys.size()>0)
					return Categorys;
				
				else 
					
				 throw new NotFoundException("Categorys Not Found");
		}



	@Override
	public Category createCategory(Category Category) throws NotFoundException {
		return CategoryRepo.save(Category);
	}



	@Override
	public Category findCategoryById(Integer id) throws NotFoundException {
		   Optional<Category> optCategory =	CategoryRepo.findById(id);
		   if(!optCategory.isPresent())
			   throw new NotFoundException("Category not Found with id : " + id);
			return optCategory.get();
	}












}
