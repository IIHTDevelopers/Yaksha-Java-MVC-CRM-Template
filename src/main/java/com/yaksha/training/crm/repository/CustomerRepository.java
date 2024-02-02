package com.yaksha.training.crm.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.crm.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	// write your logic here
	Page<Customer> findByFirstNameAndLastName(@Param("keyword") String keyword, Pageable pageable);

	// write your logic here
	void updateIsVerified(@Param("id") Long id);

}
