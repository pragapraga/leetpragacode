package com.leetcode.nov6;
/*
@input - int[] , int
@output - int

Psuedo Code
1. Take outter loop with nums length
2. Take inner loop with length 3
3. Check the difference of the sum of 3 numbers and target, if it is less, update it else return as is
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class ThreeSumClosestTest {

    @Test
    public void testcase1() {
        int[] intArr = new int[]{-1, 2, 1, -4};
        int target = 1;
        Assert.assertEquals(threeSumClosest(intArr, target), 2);
    }

    @Test
    public void testcase2() {
        int[] intArr = new int[]{0, 0, 0};
        int target = 1;
        Assert.assertEquals(threeSumClosest(intArr, target), 0);
    }

    @Test
    public void testcase3() {
        int[] intArr = new int[]{0, 1, 2};
        int target = 3;
        Assert.assertEquals(threeSumClosest(intArr, target), 3);
    }

    @Test
    public void testcase4() {
        int[] intArr = new int[]{1, 1, 1, 0};
        int target = -100;
        Assert.assertEquals(threeSumClosest(intArr, target), 3);
    }


    int currentDiff;
    int resSum;

    public int threeSumClosest(int[] nums, int target) {
        int difference = Integer.MAX_VALUE; //[1,2,3,4,5,7,8]

        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }

        for (int i = 0; i < nums.length - 2; i++) {
            int currentSum = nums[i] + nums[i + 1] + nums[i + 2];
            currentDiff = currentSum - target;
            System.out.println("difference:: " + Math.abs(difference));
            System.out.println("currentDiff:: " + Math.abs(currentDiff));

            if (Math.abs(currentDiff) < Math.abs(difference)) {
                difference = currentDiff;
                resSum = currentSum;
            }
        }
        return resSum;
    }
}
