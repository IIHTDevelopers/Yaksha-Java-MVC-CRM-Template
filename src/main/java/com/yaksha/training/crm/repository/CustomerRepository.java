package com.yaksha.training.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.crm.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	// feel free to update this
	List<Customer> findByFirstNameAndLastName(@Param("keyword") String keyword);
}
