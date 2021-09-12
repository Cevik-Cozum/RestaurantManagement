package com.example.Management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Management.model.Customer;
import com.example.Management.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService{
	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Override
	public List<Customer> getAll() {
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public Customer getSingle(Integer id) {
		return customerRepository.findById(id).get();
	}

	@Override
	public Integer add(Customer customer) {
		Integer id = customerRepository.save(customer).getId();
		return id;
	}

	@Override
	public void delete(Integer id) {
		customerRepository.deleteById(id);
	}
}
