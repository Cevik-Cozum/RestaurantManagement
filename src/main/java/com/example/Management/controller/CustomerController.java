package com.example.Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Management.model.Customer;
import com.example.Management.service.ICustomerService;

@Controller
public class CustomerController {
	@Autowired
	private ICustomerService customerService;
	
	@GetMapping("/allCustomers")
	public String allCustomer(Model model) {
		var result = (List<Customer>) customerService.getAll();
		model.addAttribute("customerList",result);
		return "allCustomers";
	}
	
	@GetMapping("/newCustomer")
	public String newCustomer(Model model) {
		model.addAttribute("customer", new Customer());
		return "newCustomer";
	}
	
	
	@PostMapping("/addCustomer")
	public String addCustomer(Model model, @ModelAttribute("customer") Customer c) {
		customerService.add(c);
		return "redirect:/allCustomers/";
	}
	
	@RequestMapping(value="/deleteCustomer", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String deleteCustomer(Integer id) {
		customerService.delete(id);
		return "redirect:/allCustomers";
	}
}
