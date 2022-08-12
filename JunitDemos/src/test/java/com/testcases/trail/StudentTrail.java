package com.testcases.trail;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.vfislk.exception.InvalidNumException;
import com.vfislk.exception.NegValueException;
import com.vfislk.training.Student;

class StudentTrail extends Student {
	Student student = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		student = new Student();
	}

	@AfterEach
	void tearDown() throws Exception {
		student = null;
	}

	@Test
	void testCalcTotal() throws NegValueException, InvalidNumException {
		assertEquals(100, student.calcTotal(20, 40, 40));
	}

	@Test
	@DisplayName("Testing negative value ")
	void testNegTotal() {
		assertThrows(NegValueException.class, () -> student.calcTotal(-90, 80, 50));

	}

	@Test
	@DisplayName("Testing value greater than 100")
	void testGreaterTotal() {
		assertThrows(InvalidNumException.class, () -> student.calcTotal(120, 80, 90));
	}

	@Test
	@DisplayName("Testing grade A")
	void testGradeA() {
		int[] marks = { 90, 95, 98 };
		String grade = student.getGrade(marks);
		assertEquals("A", grade, "Expecting Grade A");
	}

	@Test@Tag("gradeb")
	@DisplayName("Testing grade B")
	void testGradeB() {
		int[] marks = { 80, 85, 88 };
		String grade = student.getGrade(marks);
		assertEquals("B", grade, "Expecting Grade B");
	}

	@Test
	@DisplayName("Testing grade C")
	void testGradeC() {
		int[] marks = { 70, 75, 78 };
		String grade = student.getGrade(marks);
		assertEquals("C", grade, "Expecting Grade C");
	}

	@Test
	@DisplayName("Testing grade D")
	void testGradeD() {
		int[] marks = { 60, 65, 68 };
		String grade = student.getGrade(marks);
		assertEquals("D", grade, "Expecting Grade D");
	}

	@Test
	@DisplayName("Testing grade E")
	void testGradeE() {
		int[] marks = { 50, 55, 58 };
		String grade = student.getGrade(marks);
		assertEquals("E", grade, "Expecting Grade E");
	}

	@Test@Tag("Fail")
	@DisplayName("Testing grade Fail")
	void testGradeF() {
		int[] marks = { 30, 35, 40 };
		String grade = student.getGrade(marks);
		assertEquals("Fail", grade, "Expecting Grade Fail");
	}

	@Test
	@DisplayName("Null check")
	void testNull() {
		assertNull(student.getGrade(null));
	}

//	@Test @DisplayName("Sum of marks dhould not be greater than 300")
//	void testGreater300() {
//		assertThrows(InvalidNumException300.class,()->)
}
