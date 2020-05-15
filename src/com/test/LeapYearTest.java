package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.java.LeapYearController;

/**
 * @author Prerna Garg
 *
 */
class LeapYearTest {

	LeapYearController leapYearController = new LeapYearController();

	@Test
	void testDivisibleBy400() {
		assertEquals(Boolean.TRUE, leapYearController.isLeapYear(400));
	}

	@Test
	void testDivisibleBy400_2() {
		assertEquals(Boolean.TRUE, leapYearController.isLeapYear(2000));
	}

	@Test
	void testDivisbleBy100_NotBy400() {
		assertEquals(Boolean.FALSE, leapYearController.isLeapYear(1700));
	}

	@Test
	void testDivisbleBy4_NotBy100() {
		assertEquals(Boolean.TRUE, leapYearController.isLeapYear(2008));
	}

	@Test
	void testNotDivisbleBy4() {
		assertEquals(Boolean.FALSE, leapYearController.isLeapYear(2017));
	}

}
