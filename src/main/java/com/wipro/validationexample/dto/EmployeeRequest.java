package com.wipro.validationexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {
	private int empId;
	private String name;
	private String email;
	private String mobile;
	private String gender;
	private int age;
	private String nationality;
	

}
