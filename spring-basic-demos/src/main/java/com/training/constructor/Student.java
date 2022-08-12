package com.training.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String name;
	private Course course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public Student(Course course) {
		super();
		this.course = course;
	}
	public String getName() {
		return name;
	}
	@Value("Naveen")
	public void setName(String name) {
		this.name = name;
	}
	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
	
	

}
