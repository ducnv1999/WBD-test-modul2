package com.codegym.repository;

import com.codegym.model.Employees;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeesRepository extends PagingAndSortingRepository<Employees, Integer> {


}
