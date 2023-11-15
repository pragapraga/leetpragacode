package com.leetcode.nov7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveZerosTest {
    @Test
    public void testcase1() {
        int[] input = new int[]{0, 1, 0, 3, 12};
        int[] output = new int[]{1, 3, 12, 0, 0};
        Assert.assertEquals(moveZeros(input), output);
    }

    public int[] moveZeros(int[] nums) {
        int[] res = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                res[index++] = nums[i];
            }
        }
        return res;
    }
}
