package com.leetcode.nov15;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
Given a binary array, find the index of 0 to be replaced with 1 to get a maximum length sequence of continuous ones.

For example, consider array { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 }. The index to be replaced is 7 to get a continuous sequence of length 6 containing all 1’s.


@input - int[]
@output - int


Testdata 1 - {0, 0, 0, 1, 0, 1} => 4
Testdata 2 - { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 } => 6
Testdata 3 - { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 } => 1
Testdata 4 - { 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1 } => 9
Testdata 5 - { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0 } => 3


Brute force Psuedo code
1. If the (n-1)th and (n+1)th position is 1 and nth position is 0 ( Find the Pattern )
2. Extend left hand side as well as right hand side until you find 0 again, find the length

 */
public class MaximumSequenceTest {
    @Test
    public void testcase1(){
        int[] input = new int[]{0, 0, 0, 1, 0, 1};
        Assert.assertEquals(findMaximumOnesIndex(input),4);
    }
    @Test
    public void testcase2(){
        int[] input = new int[] { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };
        Assert.assertEquals(findMaximumOnesIndex(input),6);
    }

    private int findMaximumOnesIndex(int[] input) {

        return -1;
    }
}
