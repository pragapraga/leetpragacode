package com.leetcode.dec2;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
@Input - int[] , int
@output - int

Testdata 1 - 1,5,2,3,7,1 , k=3 => 12


 */
public class MaxSubArrayTest {
    @Test
    public void testcase1() {
        int[] input = new int[]{1, 5, 2, 3, 7, 1};
        int windowSize = 3;
        Assert.assertEquals(findMaxSumSubArray(input,windowSize),12);
    }

    private int findMaxSumSubArray(int[] input, int windowSize) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j <windowSize ; j++) {

            }
        }
        return 0;
    }
}
