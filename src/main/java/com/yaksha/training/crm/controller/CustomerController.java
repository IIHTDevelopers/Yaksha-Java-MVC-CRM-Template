package com.yaksha.training.crm.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.crm.entity.Customer;

@Controller
@RequestMapping(value = { "/customer", "/" })
public class CustomerController {

	@GetMapping(value = { "/list", "/" })
	public String listCustomers(Model model) {
		return "";
	}

	@GetMapping("/addCustomerForm")
	public String showFormForAdd(Model model) {
		return "";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		return "";
	}

	@GetMapping("/updateCustomerForm")
	public String showFormForUpdate(@RequestParam("customerId") Long id, Model model) {
		return "";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") Long id) {
		return "";
	}

	@PostMapping("/search")
	public String searchCustomers(@RequestParam("theSearchName") String theSearchName, Model theModel) {
		return "";
	}
}
