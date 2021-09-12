package com.example.Management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Management.model.Meal;
import com.example.Management.repository.MealRepository;

@Service
public class MealService implements IMealService{
	@Autowired
	private MealRepository mealRepository;
	
	
	
	@Override
	public List<Meal> getAll() {
		return (List<Meal>) mealRepository.findAll();
	}

	@Override
	public Meal getSingle(Integer id) {
		return mealRepository.findById(id).get();
	}

	@Override
	public Integer add(Meal meal) {
		Integer id=mealRepository.save(meal).getId();
		return id;
	}

}
