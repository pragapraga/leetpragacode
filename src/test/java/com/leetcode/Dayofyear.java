package com.leetcode;

import org.junit.Test;

import org.junit.Assert;

//https://leetcode.com/problems/day-of-the-year/
public class Dayofyear {

	@Test
	public void testOne() {
		Assert.assertEquals(findDayYear("2000-01-19"), 19);
	}

	@Test
	public void testTwo() {
		Assert.assertEquals(findDayYear("2019-02-10"), 41);
	}

	@Test
	public void testThree() {
		Assert.assertEquals(findDayYear("1900-05-02"), 122);
	}

	public int findDayYear(String inputDate) {

		String[] dateComponents = inputDate.split("-");
		int year = Integer.parseInt(dateComponents[0]);
		int day = Integer.parseInt(dateComponents[2]);
		int month = Integer.parseInt(dateComponents[1]);

		int[] days = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int sumOfDays = 0;
		boolean isLeap = checkLeap(year);

		for (int i = 0; i < month - 1; i++) {

			if ((isLeap) && (i == 1)) {
				sumOfDays += days[i] + 1;
				continue;
			}
			sumOfDays += days[i];
		}
		return sumOfDays + day;
	}

	boolean checkLeap(int yr) {
		if (yr % 100 == 0) {
			if (yr % 400 == 0) {
				return true;
			}
		}else if (yr % 4 == 0) {
			return true;
		}
		return false;
	}
}
