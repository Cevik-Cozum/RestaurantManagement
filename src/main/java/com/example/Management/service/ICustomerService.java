package com.example.Management.service;

import java.util.List;

import com.example.Management.model.Customer;


public interface ICustomerService {
	List<Customer> getAll();
	
	Customer getSingle(Integer id);
	
	Integer add(Customer customer);

	void delete(Integer id);
}
