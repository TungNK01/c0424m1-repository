package com.codegym.c0424m1springdatarepository.repository;

import com.codegym.c0424m1springdatarepository.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {
}