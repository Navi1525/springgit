package com.bookapp.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.service.Course;

@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)

class CourseTest {

	
	@Spy
	Course course;
	@Mock
	Course mcourse;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
//	void testshowCourses() {
//		List<String> courses = course.showCourses();
//		System.out.println(courses);
//	//	assertEquals("Java","JavaScript","CSS","Springs","HTML",courses);
//	}

	void testshowCoursesMock() {
		when(mcourse.showCourses()).thenReturn(Arrays.asList("Java","JavaScript","CSS","Springs","HTML"));
		List<String> courses = mcourse.showCourses();
		System.out.println(courses);
	}

}
