package com.evaluation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluation.entities.Address;

import com.evaluation.exception.AddressException;

import com.evaluation.exception.NotFoundException;
import com.evaluation.repository.AddressDao;

@Service
public class AddressServiceImpl implements AddressServiceIntr{ 


	@Autowired
	private AddressDao AddresDao;  //For Accessing JPA Repository
	

	@Override
	public Address createNewAddress(Address Address) {
		Address savedAddress = AddresDao.save(Address);
		   return savedAddress;
	}
	
	

	@Override
	public List<Address> getAllAddressDetails() throws NotFoundException {
		List<Address> Addresss = AddresDao.findAll();
		
		if(Addresss.size()>0)
			return Addresss;
		else 
			throw new AddressException("Address Not Found");
	
		
	}

	@Override
	public Address deleteAddress(Integer Id) throws NotFoundException {
		
		Address existingAddress= AddresDao.findById(Id).orElseThrow(() -> new AddressException("Address Doesn't Exist with Id "+Id));
		
		AddresDao.delete(existingAddress);
			
		 return existingAddress;
	}

	

	@Override
	public Address updateAddress(Integer Id, Address Address) throws NotFoundException {
	
		
		 Optional<Address> foundAddress =  AddresDao.findById(Id);
		 if(!foundAddress.isPresent()) throw new NotFoundException("Address not found to update with " + Id);
		 
		 Address updateAddress = foundAddress.get();
		 
	     
	      updateAddress.setId(Address.getId());
		 updateAddress.setCity(Address.getCity());
		 updateAddress.setStreet(Address.getStreet());
		 updateAddress.setState(Address.getState());
		 updateAddress.setCountry(Address.getCountry());
		
         
           return AddresDao.save(updateAddress);
	}
	

	

	@Override
	public Address getAddressById(Integer Id) throws AddressException{
		
	   Optional<Address> opt = AddresDao.findById(Id);
		 
	    if(opt.isPresent()) {
	    	return opt.get();
	    }else
	    	throw new AddressException("Address Doesn't Exist With Id :" + Id);
	}



	


	@Override
	public Address deleteAllAddress() throws NotFoundException {
		return null;
//		Address deleteAllAddress = TrDao.deleteAll();
//		   return deleteAllAddress;
		
	}





	
}
