package com.leetcode.nov16;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
https://leetcode.com/problems/sort-colors/
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.



Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]


Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.

@input - int[]
@output - int[]

Testdata 1 - [2,0,1] => [0,1,2]
Testdata 2 - [2,2,0,0,1,1] => [0,0,1,1,2,2]

Brute force Psuedo code
1. Iterate through the int[]
2. Swap the elements based on asc order
3. return the resultant int[]

 */
public class SortColorsTest {
    @Test
    public void testcase1() {
        int[] input = new int[]{2, 0, 1};
        int[] output = new int[]{0, 1, 2};
        Assert.assertEquals(sortColors(input), output);
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{2, 2, 0, 0, 1, 1};
        int[] output = new int[]{0, 0, 1, 1, 2, 2};
        Assert.assertEquals(sortColors(input), output);
    }

    private int[] sortColors(int[] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j <= input.length - 1; j++) {
                if (input[i] > input[j]) { //2>1
                    //logic swap the numbers to be asc order
                    int temp = input[j];
                    input[j] = input[i];
                    input[i] = temp;
                }
            }
        }
        return input;
    }
}
