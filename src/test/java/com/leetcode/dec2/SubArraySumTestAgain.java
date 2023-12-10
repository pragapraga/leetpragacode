package com.leetcode.dec2;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
@input - int[]
@output - int

Testdata 1 - 1,2,3,5,6  - wSize = 3 => 14
Testdata 2 - 1,6,9,0,7,4,2,8 - wSize = 3 => 16

Psuedo code
1. Iterate through the whole array in outer for loop
2. Iterate through wSize in inner for loop
3. Declare currentSum and maxSum as varibles
4. Replace maxSum as Math.max(currentSum,maxSum)
 */
public class SubArraySumTestAgain {
    @Test
    public void testcase1() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        int windowSize = 3;
        Assert.assertEquals(findMaximumSum(input, windowSize), 15);
        Assert.assertEquals(findMaxSumWindow(input, windowSize), 15);
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{1, 6, 9, 0, 7, 4, 2, 8};
        int windowSize = 3;
        Assert.assertEquals(findMaximumSum(input, windowSize), 16);
        Assert.assertEquals(findMaxSumWindow(input, windowSize), 16);
    }

    @Test
    public void testcase3() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        int windowSize = 2;
        Assert.assertEquals(findMaximumSum(input, windowSize), 11);
    }

    @Test
    public void testcase4() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        int windowSize = 1;
        Assert.assertEquals(findMaximumSum(input, windowSize), 6);
    }

    @Test
    public void testcase5() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        int windowSize = 7;
        Assert.assertEquals(findMaximumSum(input, windowSize), 6);
        Assert.assertEquals(findMaxSumWindow(input, windowSize), 6);
    }

    @Test
    public void testcase6() {
        int[] input = new int[]{-3,-2,-1};
        int windowSize = 2;
        org.testng.Assert.assertEquals(findMaximumSum(input, windowSize), -3);
    }

    private int findMaximumSum(int[] input, int windowSize) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum;
        for (int i = 0; i <= input.length - windowSize; i++) {
            currentSum = 0;
            for (int j = i; j < i + windowSize; j++) {
                currentSum += input[j];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        if (maxSum == Integer.MIN_VALUE) {
            System.out.println("Something is wrong!");
        }
        return maxSum;
    }


    /*
    1,2,3,4,5,6
    Have pointer on 1st element

     */
    private int findMaxSumWindow(int[] input, int windowSize) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
/*        for (int i = 0; i < windowSize; i++) {
            currentSum += input[i];
            maxSum = currentSum;
}*/

        for (int i = 0; i < input.length; i++) {
            if (i < windowSize) {
                currentSum += input[i];
            } else {
                currentSum += input[i] - input[i - windowSize];
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

}
