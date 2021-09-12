package com.example.Management.service;

import java.util.List;
import java.util.Optional;

import com.example.Management.model.Orders;

public interface IOrdersService {
	List<Orders> getAll();
	
	Optional<Orders> getSingle(Integer id);
	
	void add(Orders orders);
}
