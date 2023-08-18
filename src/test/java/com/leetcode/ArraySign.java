package com.leetcode;

import org.testng.annotations.Test;

import org.junit.Assert;

public class ArraySign {
	public int arraySign(int[] nums) {
		double result = 1;
		for (int i = 0; i < nums.length; i++) {
			result = result * nums[i];
		}
		if (result < 0) {
			return -1;
		} else if (result > 0) {
			return 1;
		}
		return 0;
	}

	@Test
	public void positiveCase() {
		int[] input = new int[] { 1, 3, 4, 5, 393 };
		Assert.assertEquals(arraySign(input), 1);
	}

	@Test
	public void negativeCase() {
		int[] input = new int[] { 1, 3, 4, 5, -393 };
		Assert.assertEquals(arraySign(input), -1);
	}

	@Test
	public void edgeCase() {
		int[] input = new int[] { 12,4,523,324134};
		Assert.assertEquals(arraySign(input), 1);
	}
}
