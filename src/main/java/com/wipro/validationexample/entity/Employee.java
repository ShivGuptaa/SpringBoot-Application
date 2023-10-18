package com.wipro.validationexample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="EMPLOYEE_TBL")
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue
	private int empId;
	private String name;
	private String email;
	private String mobile;
	private String gender;
	private int age;
	private String nationality;
	

}
