package com.codegym.service.impl;

import com.codegym.model.Employees;
import com.codegym.repository.EmployeesRepository;
import com.codegym.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class EmployeesServiceImpl implements EmployeesService {
    @Autowired
    private EmployeesRepository employeesRepository;

    @Override
    public Page<Employees> findAll(Pageable pageable) {
        return employeesRepository.findAll(pageable);
    }

    @Override
    public Employees findById(int id) {
        return employeesRepository.findOne(id);
    }

    @Override
    public void save(Employees employees) {
        employeesRepository.save(employees);

    }

    @Override
    public void remove(int id) {
        employeesRepository.delete(id);

    }


}
