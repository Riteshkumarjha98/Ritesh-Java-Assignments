package com.evaluation.service;

import java.util.List;

import com.evaluation.entities.Address;
import com.evaluation.exception.AddressException;
import com.evaluation.exception.NotFoundException;

public interface AddressServiceIntr {
   
    public Address createNewAddress(Address Address);
	
	public List<Address> getAllAddressDetails() throws NotFoundException;
	
	public Address deleteAddress(Integer Id)  throws NotFoundException;
          
	public Address getAddressById(Integer Id) throws AddressException;
    
	Address updateAddress(Integer Id, Address Address) throws NotFoundException;
	
	public Address deleteAllAddress() throws NotFoundException;
}
