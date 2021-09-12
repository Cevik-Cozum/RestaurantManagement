package com.example.Management.repository;

import org.springframework.stereotype.Repository;

import com.example.Management.model.Customer;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
}
