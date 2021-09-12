package com.example.Management.service;

import java.util.List;

import com.example.Management.model.Meal;

public interface IMealService {
	List<Meal> getAll();
	
	Meal getSingle(Integer id);
	
	Integer add(Meal meal);
}
