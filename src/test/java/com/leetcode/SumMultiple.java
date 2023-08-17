package com.leetcode;

import org.junit.Assert;
import org.junit.Test;



/*
@input - int
@output - int

Testdata 1 - 7 
Testdata 2 - 
Testdata 3 - 

Psuedo Code
1. Declare i , sum = 0 , 
2. Iterate the value from 1 to n value
3. Check the divisiblity using mod operator
3.1. if divisible add to sum and return it
*/
//https://leetcode.com/problems/sum-multiples/submissions/

public class SumMultiple {
	public int sumOfMultiples(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	@Test
	public void testDataOne() {
		Assert.assertEquals(sumOfMultiples(3), 3);
	}
	
	@Test
	public void testDataTwo() {
		Assert.assertEquals(sumOfMultiples(10), 40);
	}


}
