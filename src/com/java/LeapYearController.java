package com.java;

/**
 * @author Prerna Garg
 *
 */
public class LeapYearController {

	public boolean isLeapYear(int year) {
		boolean leapYear = false;
		if (year % 400 == 0) {
			leapYear = true;
		}
		return leapYear;
	}

}
