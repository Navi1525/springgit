package com.testcases.democheck;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.vfislk.training.User;

class UserTest {
User user;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		user= new User();
	}

	@AfterEach
	void tearDown() throws Exception {
		user=null;
	}

	@Tag("greet")
	void testGreet() {
		String wish =user.greet("Thanush");
		assertEquals("Greatday Thanush",wish,"Expected Greatday Thanush");
	}
	
	@Test@DisplayName("Fruit test")
	void testshowFruits() {
		assertEquals(Arrays.asList("Apple","Mango","Watermelon"),user.showFruits());
	
	}

}
