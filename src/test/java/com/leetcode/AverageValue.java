package com.leetcode;

import org.junit.Test;

import org.junit.Assert;

public class AverageValue {
	/*
	@input - int[]
	@output - int

	TestData 1 - [1,3,6,10,12,15] => 9
	TestData 2 - [1,2,4,7,10] => 0

	Psudeo Code
	1. Iterate the integer array, initialize the sum =0
	2. Check if the number is divisble by 2 and check if the number is divisble by 3
	2.1 Add them if 2 satisfied
	2.2 return the sum

	*/
	    public int averageValue(int[] nums) {
	    int sum=0;
	    int counter=0;
	    for(int i=0;i<nums.length;i++){
	        if((nums[i]%2==0)&&(nums[i]%3==0)){
	            sum=sum+nums[i];
	            counter++;
	        }
	    }
	    if(counter!=0){
	        return sum/counter;
	    }
	    return sum;
	    }
	@Test
	public void testOne() {
		int[] input = new int[] {1,3,6,10,12,15};
		Assert.assertEquals(averageValue(input), 9);
	}
	
	@Test
	public void testTwo() {
		int[] input = new int[] {1,2,4,7,10};
		Assert.assertEquals(averageValue(input), 0);
	}
}
