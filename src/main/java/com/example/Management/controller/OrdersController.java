package com.example.Management.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Management.model.Orders;
import com.example.Management.service.IOrdersService;

@Controller
public class OrdersController {
	@Autowired
	private IOrdersService ordersService;
	
	@GetMapping("/allOrders")
	public String allOrders(Model model) {
		var result = (List<Orders>) ordersService.getAll();
		model.addAttribute("ordersList",result);
		return "allOrders";
	}
	
	@GetMapping("/newOrders")
	public String newOrders(Model model) {
		model.addAttribute("orders", new Orders());
		return "newOrders";
	}
	
	
	@PostMapping("/addOrders")
	public String addOrders(@Validated Orders orders) {
		ordersService.add(orders);
		return "redirect:/allOrders/";
	}
	
	@RequestMapping("allOrders/findById")
	@ResponseBody
	public Optional<Orders> getSingle(int id){
		return ordersService.getSingle(id);
	}

}
