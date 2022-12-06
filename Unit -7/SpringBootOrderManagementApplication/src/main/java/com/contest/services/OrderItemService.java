package com.contest.services;


import java.util.List;


import com.contest.exception.NotFoundException;
import com.contest.model.OrderItem;

public interface OrderItemService {

	public OrderItem createOrders(OrderItem Orders) throws NotFoundException;
	
	public OrderItem findOrdersById(Integer id) throws NotFoundException;
	
	public OrderItem getOrderssById(Integer id) throws NotFoundException;
	
	public List<OrderItem> getAllOrderssDetails() throws NotFoundException;
	
	public OrderItem CancelOrders(Integer id)  throws NotFoundException;


	
}
