package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.java.LeapYearController;

/**
 * @author Prerna Garg
 *
 */
class LeapYearTest {

	@Test
	void testDivisibleBy400() {
		LeapYearController leapYearController = new LeapYearController();
		assertEquals(Boolean.TRUE, leapYearController.isLeapYear(400));
	}

	@Test
	void testDivisibleBy400_2() {
		LeapYearController leapYearController = new LeapYearController();
		assertEquals(Boolean.TRUE, leapYearController.isLeapYear(2000));
	}

	@Test
	void testDivisbleBy100_NotBy400() {
		LeapYearController leapYearController = new LeapYearController();
		assertEquals(Boolean.FALSE, leapYearController.isLeapYear(1700));
	}

	@Test
	void testDivisbleBy4_NotBy100() {
		LeapYearController leapYearController = new LeapYearController();
		assertEquals(Boolean.TRUE, leapYearController.isLeapYear(2008));
	}

	@Test
	void testNotDivisbleBy4() {
		LeapYearController leapYearController = new LeapYearController();
		assertEquals(Boolean.FALSE, leapYearController.isLeapYear(2017));
	}

}
