package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/*

@input - int[]
@output - int

Psuedo Code
1. Sort the array, initialize sum
2. Declare a for loop which iterates with i=i+2 times
3. increment the sum with num[i]
4. return sum
 */
public class ArrayPairSum {
    public int Solution(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }

    @Test
    public void testOne(){
        int[] input = new int[]{1,4,3,2};
        Assert.assertEquals(Solution(input),4);
    }
    @Test
    public void testTwo() {
        int[] input = new int[]{6, 2, 6, 5, 1, 2};
        Assert.assertEquals(Solution(input), 9);
    }
}
