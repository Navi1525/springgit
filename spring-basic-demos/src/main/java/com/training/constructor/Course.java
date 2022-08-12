package com.training.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Course {

	private String courseName;
	private double fees;
	
	
	public String getCourseName() {
		return courseName;
	}
	@Value("Spring")
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getFees() {
		return fees;
	}
	@Value("20000")
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", fees=" + fees + "]";
	}
	
	
	
}
