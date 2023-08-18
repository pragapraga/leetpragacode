package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;



public class NumberReverse {
	int reminder, reversedNumber = 0;

	public int reverseit(int num) {
		while (num != 0) {
			reminder = num % 10;
			reversedNumber = reversedNumber * 10 + reminder;
			num = num / 10;
		}
		return reversedNumber;
	}
	
	@Test(enabled = false)
	public void testOne() {
		Assert.assertEquals(123, reverseit(321));
	}
	
	@Test
	public void testTwo() {
		Assert.assertEquals(321, reverseit(1230));
	}

}
