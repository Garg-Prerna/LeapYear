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
		} else {
			if (year % 100 == 0) {
				leapYear = false;
			} else {
				if (year % 4 == 0) {
					leapYear = true;
				} else {
					leapYear = false;
				}
			}
		}

		return leapYear;
	}

}
