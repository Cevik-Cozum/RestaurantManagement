package com.example.Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Management.model.Waiter;
import com.example.Management.service.IWaiterService;

@Controller
public class WaiterController {
	@Autowired
	private IWaiterService waiterService;
	
	@GetMapping("/allWaiters")
	public String allWaiter(Model model) {
		var result = (List<Waiter>) waiterService.getAll();
		model.addAttribute("waiterList",result);
		return "allWaiters";
	}
	
	@GetMapping("/newWaiter")
	public String newWaiter(Model model) {
		model.addAttribute("waiter", new Waiter());
		return "newWaiter";
	}
	
	
	@PostMapping("/addWaiter")
	public String addWaiter(Model model, @ModelAttribute("waiter") Waiter w) {
		waiterService.add(w);
		return "redirect:/allWaiters/";
	}

}
