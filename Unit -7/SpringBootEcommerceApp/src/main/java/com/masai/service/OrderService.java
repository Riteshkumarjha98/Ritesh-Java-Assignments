package com.masai.service;

import java.util.List;

import com.masai.exception.NotFoundException;

import com.masai.model.Order;

public interface OrderService {
	
public Order createOrder(Order Order) throws NotFoundException;
	
	public Order findOrderById(Integer id) throws NotFoundException;
	
	public Order getOrdersById(Integer id) throws NotFoundException;
	
	public List<Order> getAllOrdersDetails() throws NotFoundException;
	
	public Order CancelOrder(Integer id)  throws NotFoundException;

	

	

}
