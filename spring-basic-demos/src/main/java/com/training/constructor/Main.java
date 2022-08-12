package com.training.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.training");
		Student student = (Student)context.getBean("student");
		System.out.println(student);
	
	
	
	}

}
