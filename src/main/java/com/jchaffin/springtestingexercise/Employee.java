package com.jchaffin.springtestingexercise;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private Long id;
	private String name;

	public String getName() {
		return name;
	}

	public Employee() {

	}

	public Employee(String name) {
		this.name = name;
	}

}
