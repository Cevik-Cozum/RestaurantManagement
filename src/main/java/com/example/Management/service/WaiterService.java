package com.example.Management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Management.model.Waiter;
import com.example.Management.repository.WaiterRepository;


@Service
public class WaiterService implements IWaiterService{
	@Autowired
	private WaiterRepository waiterRepository;

	@Override
	public List<Waiter> getAll() {
		return (List<Waiter>) waiterRepository.findAll();
	}

	@Override
	public Waiter getSingle(Integer id) {
		return waiterRepository.findById(id).get();
	}

	@Override
	public Integer add(Waiter waiter) {
		Integer id = waiterRepository.save(waiter).getId();
		return id;
	}
	
	
}
