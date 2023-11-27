package com.leetcode.nov20;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
https://leetcode.com/problems/maximum-subarray/description/

@input - int[]
@output - int
Math.max(num[i]+sum,num[i])
 */
public class MaxOfSubArrayTest {
@Test
    public void testcase1(){
    int[] input = new int[]{-2,1,-3,4,-1,2,1,-5,4};
    Assert.assertEquals(maxSubArray(input),6);
}

    private int maxSubArray(int[] input) {
    return 0;
    }
}

