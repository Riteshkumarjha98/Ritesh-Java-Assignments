package com.contest.services;


import java.util.List;


import com.contest.exception.NotFoundException;
import com.contest.model.Category;
import com.contest.model.Category;

public interface CategoryService {


	public Category createCategory(Category Category) throws NotFoundException;
	
	public Category findCategoryById(Integer id) throws NotFoundException;
	
	
	
	public List<Category> getAllCategorysDetails() throws NotFoundException;
	
	
	
}
