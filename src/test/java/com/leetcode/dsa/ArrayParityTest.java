package com.leetcode.dsa;

/*
@input - int[]
@output - int

Testdata1 -[1,4,3,2] => 4
Testdata2 -[6,2,6,5,1,2] => 9

Pseudo code
1. Sort the array
2. sum up the numbers which are in ith index where i are even index
3. return result

*/

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayParityTest {

    @Test
    public void testcase1() {
        int[] input = new int[]{1, 4, 3, 2};
        Assert.assertEquals(arrayPairSum(input), 4);
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{6, 2, 6, 5, 1, 2};
        Assert.assertEquals(arrayPairSum(input), 9);
    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum = sum + nums[i];
        }
        return sum;
    }
    }
}
