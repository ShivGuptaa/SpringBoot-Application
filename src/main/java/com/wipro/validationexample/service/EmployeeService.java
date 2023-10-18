package com.wipro.validationexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.validationexample.dto.EmployeeRequest;
import com.wipro.validationexample.entity.Employee;
import com.wipro.validationexample.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public Employee saveEmployee(EmployeeRequest employeeRequest)
	{
		Employee employee=Employee.build(0,employeeRequest.getName(),
				employeeRequest.getEmail(),employeeRequest.getMobile(),employeeRequest.getGender(),
				employeeRequest.getAge(),employeeRequest.getNationality());
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployee()
	{
		return employeeRepository.findAll();
	}
	
	public Employee getEmployeeIId(int id)
	{
		return employeeRepository.findById(id);
	}
}
