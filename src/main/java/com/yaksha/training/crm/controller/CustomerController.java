package com.yaksha.training.crm.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.crm.entity.Customer;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value = { "/customer", "/" })
public class CustomerController {

	@RequestMapping(value = { "/list", "/", "/search" })
	public String listCustomers(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			@PageableDefault(size = 5) Pageable pageable, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/addCustomerForm")
	public String showFormForAdd(Model model) {
		// write your logic here
		return "";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		// write your logic here
		return "";
	}

	@GetMapping("/updateCustomerForm")
	public String showFormForUpdate(@RequestParam("customerId") Long id, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") Long id) {
		// write your logic here
		return "";
	}

	@GetMapping("/updateVerified")
	public String updateVerified(@RequestParam("id") Long id, Model theModel) {
		// write your logic here
		return "";
	}
}