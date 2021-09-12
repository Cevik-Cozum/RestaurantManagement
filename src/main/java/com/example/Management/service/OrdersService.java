package com.example.Management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Management.model.Orders;
import com.example.Management.repository.OrdersRepository;

@Service
public class OrdersService implements IOrdersService{
	@Autowired
	private OrdersRepository ordersRepository;
	
	//return list of orders
	@Override
	public List<Orders> getAll() {
		return (List<Orders>) ordersRepository.findAll();
	}
	
	//Save new order
	@Override
	public void add(Orders orders) {
		ordersRepository.save(orders);
	}
	
	@Override
	public Optional<Orders> getSingle(Integer id) {
		return ordersRepository.findById(id);
	}

	
	
}
