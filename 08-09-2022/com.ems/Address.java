package com.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//These lombok annotations automatically create getter and setter method 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	private String city;
	private String country;
}
