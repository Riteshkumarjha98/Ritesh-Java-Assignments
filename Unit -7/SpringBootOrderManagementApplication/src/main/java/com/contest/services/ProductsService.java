package com.contest.services;


import java.util.List;

import com.contest.exception.NotFoundException;

import com.contest.model.Products;


public interface ProductsService {
   
	public Products createProducts(Products Products);
	
	 Products CancelProductss(Integer id)  throws NotFoundException;
	 
    public List<Products> getAllProductsDetails() throws NotFoundException;

	Products updateProducts(Integer id, Products Products) throws NotFoundException;
}
