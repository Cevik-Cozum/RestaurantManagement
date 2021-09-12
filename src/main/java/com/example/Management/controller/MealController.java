package com.example.Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Management.model.Meal;
import com.example.Management.service.IMealService;

@Controller
public class MealController {
	@Autowired
	private IMealService mealService;
	
	@GetMapping("/allMeals")
	public String allMeal(Model model) {
		var result = (List<Meal>) mealService.getAll();
		model.addAttribute("mealList",result);
		return "allMeals";
	}
	
	@GetMapping("/newMeal")
	public String newMeal(Model model) {
		model.addAttribute("meal", new Meal());
		return "newMeal";
	}
	
	
	@PostMapping("/addMeal")
	public String addMeal(Model model, @ModelAttribute("meal") Meal m) {
		mealService.add(m);
		return "redirect:/allMeals/";
	}
}













/*@GetMapping("meals")
	public List<Meal> getAllMeal(){
		return this.mealRepository.findAll();
	}
	
	@GetMapping("/meals/{id}")
	public ResponseEntity<Meal> getMealById(@PathVariable(value="id") Integer id) throws ResourceNotFoundException {
			Meal meal = mealRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Meal not found for this is::" + id));
		return ResponseEntity.ok().body(meal);	
	}
	
	@PostMapping("meals")
	public Meal createMeal(@RequestBody Meal meal) {
		return this.mealRepository.save(meal);
	}
	
	@DeleteMapping("meals/{id}")
	public Map<String, Boolean> deleteMeal(@PathVariable(value="id") Integer id) throws ResourceNotFoundException{
		Meal meal = mealRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Meal not found for this id::" + id ));
		this.mealRepository.delete(meal);
		Map<String,Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		
		return response;
	}
	@PutMapping("meals/{id}")
public ResponseEntity<Meal> updateMeal(@PathVariable(value = "id") Long id, @Validated @RequestBody Meal meal_name){
	//Update
}*/