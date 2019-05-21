package com.codegym.service;

import com.codegym.model.Employees;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeesService {
    Page<Employees> findAll(Pageable pageable);

    Employees findById(int id);

    void save(Employees employees);

    void remove(int id);
}
