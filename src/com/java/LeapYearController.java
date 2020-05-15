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

		if (year % 100 == 0 && year % 400 != 0) {
			leapYear = false;
		}
		
		if (year % 4 == 0 && year % 100 != 0) {
			leapYear = true;
		}
		return leapYear;
	}

}
