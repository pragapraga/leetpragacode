package com.leetcode;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * 1. Spy Number
 * 
 * @input - int		@output - int
 * Testdata 1 - 132 => 1+3+2=6 and => 1*3*2=6 Yes
 * Testdata 2 - 1124 => 1+1+2+4=8 and => 1*1*2*4 Yes
 * Testdata 3 - 223 => 2+2+3=7 and => 2*2*3=12 No
 * 
 * Psuedo Code
 * 1. Split the number digit by digit & store it in array
 * 2. Iterate and calculate the sum and product
 * 3. Check the equality and return boolean
 */

public class Spynumber {
	public boolean isSpy(int num) {
		ArrayList<Integer> individualDigit = new ArrayList<Integer>();
		boolean result=true;
		int sum=0,product=1,reminder;
		while(num!=0) {
			reminder = num%10;
			individualDigit.add(reminder);
			num = num/10;
		}
		for(int i=0;i<individualDigit.size();i++) {
			sum += individualDigit.get(i);
			product *=individualDigit.get(i);
		}
		
		if(sum!=product) {
			return !result; 
		}
		return result;
	}
	
	@Test
	public void testOne() {
		Assert.assertEquals(true, isSpy(123));
	}
	@Test
	public void testTwo() {
		Assert.assertEquals(true, isSpy(1124));
	}
	@Test
	public void testThree() {
		Assert.assertEquals(false, isSpy(1238));
	}

}
