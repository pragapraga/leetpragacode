package com.leetcode.nov18;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSumTest {
    @Test
    public void testcase1() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int target = 8;
        int output[] = new int[]{2, 4};
        Assert.assertEquals(findIndices(input, target), output);
    }

    private int[] findIndices(int[] input, int target) {
        int[] output = new int[]{-1,-1};
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if(input[i]+input[j]==target){
                    output[0]=j;
                    output[1]=i;
                }
            }
        }
        return output;
    }
}
