package com.leetcode.twopointers;

/*
Given a sorted array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
Input: nums = [2,3,5,7], target = 9
Output: [0,3]
Output: Because nums[0] + nums[3] == 9, we return [0, 3].
 */

/*
@input - int[] ,int
output - int[]

Testdata 1 - nums = [2,3,5,7], target = 9 => [0,3]

Psuedo code
1. Read the int[] and int
2. Using the two pointer,
2.1 one pointer - start
2.2 second pointer - length-1


 */


import org.testng.Assert;
import org.testng.annotations.Test;

public class TargetSum {

    @Test
    public void testOne() {
        int[] input = new int[]{2, 3, 5, 7};
        int[] output = new int[]{0, 3};
        int target = 9;
        Assert.assertEquals(findTargetUsingTwoPointer(input, target), output);
    }

    @Test
    public void testTwo() {
        int[] input = new int[]{-1, 0, 2, 3, 4};
        int[] output = new int[]{0, 3};
        int target = 2;
        Assert.assertEquals(findTargetUsingTwoPointer(input, target), output);
    }

    @Test
    public void testThree() {
        int[] input = new int[]{2, 3, 5, 7};
        int[] output = new int[]{0, 3};
        int target = 9;
        Assert.assertEquals(findTargetUsingTwoPointer(input, target), output);
    }

    @Test
    public void testFour() {
        int[] input = new int[]{1, 4, 5, 8, 11, 12, 16, 21};
        int[] output = new int[]{3, 4};
        int target = 19;
        Assert.assertEquals(findTargetUsingTwoPointer(input, target), output);
    }

    @Test
    public void testFive() {
        int[] input = new int[]{1, 5, 9};
        int[] output = new int[]{0, 1};
        int target = 6;
        Assert.assertEquals(findTargetUsingTwoPointer(input, target), output);
    }

    private int[] findTarget(int[] input, int target) {
        int firstPointer = 0;
        int secondPointer = firstPointer + 1;
        while (input[firstPointer] + input[secondPointer] != target) {
            secondPointer++;
        }
        return new int[]{firstPointer, secondPointer};
    }

    private int[] findTargetUsingTwoPointer(int[] input, int target) {
        int firstPointer = 0;
        int secondPointer = input.length - 1;
        while (firstPointer < secondPointer) {
            int currentSum = input[firstPointer] + input[secondPointer];
            if (currentSum == target) {
                return new int[]{firstPointer, secondPointer};
            } else if (currentSum < target) {
                firstPointer++;
            } else {
                secondPointer--;
            }
        }
        return null;
    }
}

