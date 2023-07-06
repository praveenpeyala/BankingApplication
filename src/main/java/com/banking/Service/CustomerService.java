package com.banking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.banking.Entity.Customer;
import com.banking.Repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	 public List<Customer> listAll() {
	        return customerRepo.findAll();
	    }
	     
	    public void save(Customer customer) {
	        customerRepo.save(customer);
	    }
	     
	    public Customer get(long id) {
	        return customerRepo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	    	customerRepo.deleteById(id);
	    }

}
