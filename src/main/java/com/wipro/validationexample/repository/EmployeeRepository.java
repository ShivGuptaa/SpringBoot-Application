package com.wipro.validationexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.validationexample.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
	Employee  findById(int id);
}
  