package com.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// These lombok annotations automatically create getter and setter method 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private long empId;
	private String empName;
	private double empSal;
	Address address;

}
