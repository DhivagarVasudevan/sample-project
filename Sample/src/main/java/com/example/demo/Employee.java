package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.sample.Student;


@Component
@Scope("prototype")
public class Employee {

	public Employee() {
//		super();
		System.out.println("Employee Object created");
	}

	private int Id;
	
	private String name;
	
	@Autowired
//	@Qualifier(value="stude")
	private Student student;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + "]";
	}
	
	
	
}
