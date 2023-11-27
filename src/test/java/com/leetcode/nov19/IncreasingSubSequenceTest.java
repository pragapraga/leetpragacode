package com.leetcode.nov19;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence (i.e. subarray).

int nums[] = {1,3,5,4,7}
Output: 3

 */
public class IncreasingSubSequenceTest {

    @Test
    public void testcase1() {
        int[] input = new int[]{1, 3, 5, 4, 7};
        Assert.assertEquals(LongestSubSequence(input), 3);
    }

    private int LongestSubSequence(int[] input) {
        int max = 1;

        int left = 0;
        int right = 0;
        while(right<input.length-1){

        }
        return max;
    }
}
