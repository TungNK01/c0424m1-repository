package com.codegym.c0424m1springdatarepository.service;

import java.util.List;
import java.util.Optional;

public interface IGenerateService<T> {
    Iterable<T> findAll();

    void save(T t);

    Optional<T> findById(Long id);

    void remove(Long id);
}