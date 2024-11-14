package com.codegym.c0424m1springdatarepository.repository;

import com.codegym.c0424m1springdatarepository.model.Province;
import org.springframework.data.repository.CrudRepository;

public interface IProvinceRepository extends CrudRepository<Province, Long> {
}