package com.wipro.validationexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.validationexample.dto.EmployeeRequest;
import com.wipro.validationexample.entity.Employee;
import com.wipro.validationexample.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/signup")
	public ResponseEntity<Employee> saveEmployee(@RequestBody EmployeeRequest employeeRequest)
	{
		return new ResponseEntity<>(employeeService.saveEmployee(employeeRequest),HttpStatus.CREATED);
	}

	@GetMapping("/fetchAll")
	public ResponseEntity<List<Employee>> getAllEmployee()
	{
		return ResponseEntity.ok(employeeService.getAllEmployee());
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int id)
	{
		return ResponseEntity.ok(employeeService.getEmployeeIId(id));
	}
}
