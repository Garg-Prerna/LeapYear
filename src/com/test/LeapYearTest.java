package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.java.LeapYearController;

/**
 * @author Prerna Garg
 *
 */
class LeapYearTest {

	@Test
	void testIs400LeapYear() {
		LeapYearController leapYearController = new LeapYearController();
		assertEquals(Boolean.TRUE, leapYearController.isLeapYear(400));
	}
	
	@Test
	void testIs2000LeapYear() {
		LeapYearController leapYearController = new LeapYearController();
		assertEquals(Boolean.TRUE, leapYearController.isLeapYear(2000));
	}

}
