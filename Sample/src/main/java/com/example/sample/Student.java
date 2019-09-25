package com.example.sample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("stude")
public class Student {

	public Student() {
		super();
		System.out.println("Student Object Created");
	}

	private int Id;
	private String name;
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
		return "Student [Id=" + Id + ", name=" + name + "]";
	}
	
	
}
