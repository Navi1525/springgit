package com.training.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.training");
	DbConnection dbConnection = (DbConnection) context.getBean("dbConnection");
	System.out.println(dbConnection);
	
	
	
	
	}

}
