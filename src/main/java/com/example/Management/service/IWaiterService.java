package com.example.Management.service;

import java.util.List;

import com.example.Management.model.Waiter;

public interface IWaiterService {
	List<Waiter> getAll();
	Waiter getSingle(Integer id);
	Integer add(Waiter waiter);
}
