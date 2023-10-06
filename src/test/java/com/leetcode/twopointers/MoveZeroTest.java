package com.leetcode.twopointers;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

@input - int[]
@output - int[]

Testdata 1 - nums = [0,1,0,3,12] => [1,3,12,0,0]
12:13pm
Psuedo code
1. Have 2 pointers - firstPointer and lastPointer
2. begin - firstPointer and lastPointer is same which is 0
3. if the lastPointer !=0, do swapping with firstPointer and lastPointer and increment firstPointer


 */
public class MoveZeroTest {

    @Test
    public void testOne() {
        int[] input = new int[]{0, 1, 0, 3, 12};
        int[] output = new int[]{1, 3, 12, 0, 0};
        Assert.assertEquals(moveZerosTwoPointer(input), output);
    }

    @Test
    public void testThree() {
        int[] input = new int[]{1, 0};
        int[] output = new int[]{1, 0};
        Assert.assertEquals(moveZerosToEnd(input), output);
    }

    private int[] moveZerosToEnd(int[] input) {
        int firstPointer = 0;
        for (int secondPointer = 0; secondPointer < input.length; secondPointer++) {
            if (input[secondPointer] != 0) {
                int temp = input[firstPointer];
                input[firstPointer] = input[secondPointer];
                input[secondPointer] = temp;
                firstPointer++;
            }
        }
        return input;
    }

    private int[] moveZerosTwoPointer(int[] input) {
        //int firstPointer=0;
        int secondPointer = 1;
        for (int firstPointer = 0; firstPointer < input.length; firstPointer++) {
            if (input[firstPointer] != 0) {
                input[secondPointer] = input[firstPointer];
                if (secondPointer != firstPointer) {
                    input[firstPointer] = 0;
                }
                secondPointer++;
            }
        }
        return input;
    }
}
