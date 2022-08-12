package com.training.setter;

import java.io.InputStream;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		
		//IOC cointainer
		ApplicationContext context =new AnnotationConfigApplicationContext("com.training");
		Employee emp=(Employee) context.getBean("employee");
		System.out.println(emp);
//		Employee emp1=context.getBean(Employee.class);
//		System.out.println(emp1);
		
//		Employee emp2=context.getBean(Employee.class,"employee");
//		System.out.println(emp2);
	
//		String[] beans = context.getBeanDefinitionNames();
//	for (String bean :beans) {
//		System.out.println(bean);
//	}
	
	//Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
		
	}

}
