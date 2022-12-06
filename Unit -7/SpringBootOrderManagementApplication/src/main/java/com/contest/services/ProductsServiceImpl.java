package com.contest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.contest.exception.NotFoundException;



import com.contest.exception.ProductsException;
import com.contest.model.Products;
import com.contest.model.Products;
import com.contest.repository.ProductsRepository;


@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsRepository ProductsRepo;

	@Override
	public Products createProducts(Products Products) {
		// TODO Auto-generated method stub
		return ProductsRepo.save(Products);
	}



	@Override
	public Products CancelProductss(Integer id) throws NotFoundException {

		Products existingProducts= ProductsRepo.findById(id).orElseThrow(() -> new ProductsException("Productss Doesn't Exist with Id "+id));
		
		ProductsRepo.delete(existingProducts);
			
		 return existingProducts;
	}
	
	

	@Override
	public List<Products> getAllProductsDetails() throws NotFoundException {
		
	    List<Products> Products = ProductsRepo.findAll();
		
					if(Products.size()>0)
						return Products;
					else 
						throw new NotFoundException("Products Not Found");
			}



	@Override
	public Products updateProducts(Integer id, Products Products) throws NotFoundException {
		
		Optional<Products> optProducts = ProductsRepo.findById(id);
		if(!optProducts.isPresent())
			throw new NotFoundException("Products not found with id : " + id);
		
		   Products updatedProducts =   optProducts.get();
		  
		   updatedProducts.setId(Products.getId());
		   updatedProducts.setName(Products.getName());
		  updatedProducts.setDescription(Products.getDescription());
		  updatedProducts.setPrice(Products.getPrice());
		  updatedProducts.setQuanity(Products.getQuanity());
		   
		   
			
			return Products;
	}




	

	}



	


