package com.yaksha.training.crm.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yaksha.training.crm.entity.Customer;

@Service
public class CustomerService {

	public List<Customer> getCustomers() {
		// write your logic here
		return null;
	}

	public Customer saveCustomer(Customer customer) {
		// write your logic here
		return null;
	}

	public Customer getCustomer(Long id) {
		// write your logic here
		return null;
	}

	public boolean deleteCustomer(Long id) {
		// write your logic here
		return false;
	}

	public Page<Customer> searchCustomers(String theSearchName, Pageable pageable) {
		// write your logic here
		return null;
	}

	public boolean updateIsVerified(Long id) {
		// write your logic here
		return false;
	}

}
