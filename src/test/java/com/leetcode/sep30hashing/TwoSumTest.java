package com.leetcode.sep30hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
@input - int[] , int
@output - int[]

Testdata 1- [0,1,2,3] k=5  => [2,3]

Psuedocode
1. Iterate through all the elements
2. Declare 2 for loops and check the sum is equal to target, if target matches, return indices
 */
public class TwoSumTest {

    @Test
    public void testCase(){
        int[] input = new int[]{0,1,2,3};
        int[] output = new int[]{1,3};
        int target = 4;
        Assert.assertEquals(checkToSum(input,target),output);
    }

    private int[] checkToSum(int[] input,int target) {
        int[] result = new int[]{-1,-1};
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length ; j++) {
                if(input[i]+input[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }

        }
        return result;
    }

}
