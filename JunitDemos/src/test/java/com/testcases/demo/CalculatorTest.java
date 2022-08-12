package com.testcases.demo;

import static org.junit.Assert.assertEquals;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vfislk.training.Calculator;

class CalculatorTest {

	Calculator calculator ;
	@BeforeAll
	public static void init() {
		System.out.println("called before all the testcase");
		}
	@BeforeEach
	public void setup() {
		calculator =new Calculator();
		System.out.println("called before each test case");
	}
	@Test
	public void testAdd() {
		System.out.println("Testing.....");
		int actual= calculator.sum(10, 20);
		assertEquals(30,actual);
	}@Test
	public void product() {
		System.out.println("testing product");
		int actual = calculator.product(10, 2);
		assertEquals(200,actual);
	}

	@AfterEach
	public void teardown() {
		System.out.println("called after each test case");
	}
	@AfterAll
	public static void cleanup() {
		System.out.println("called aftr all the test cases");
	}
	
}
