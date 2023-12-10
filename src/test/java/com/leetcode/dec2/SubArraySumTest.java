package com.leetcode.dec2;

import org.junit.Assert;
import org.testng.annotations.Test;

/*
int nums[] = {1,5,2,3,7,1};
int k = 3; // Find the max value in k sub array items

@input - int[]
@output - int

Psuedo code
1. Declare a variable 'result' and initialize to INTEGER_MIN
2. with 3 as window, try to calculate the sum, if the current sum > result, re assign the current sum to result
3. return result


 */

/*
Psuedo code -
1. If k value is greater than size of the given int[] length, Throw an exception
2. If input int[] is empty, throw an exception
3. If k<=0 , throw an exception
4. Loop through the elements and keep adding to the sum
5. If the number of elements > k, subtract left element and add the last element
6. Keep comparing against max value
7. return max value as result

Pointers
1. int[] can have -ve values
 */
public class SubArraySumTest {
    @Test
    public void testcase1() {
        int[] input = new int[]{1, 5, 2, 3, 7, 1};
        int wSize = 3;
        Assert.assertEquals(12, findMaxSumUsingWindow(input, wSize));
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{1, 5, 2, 3, 7, 1};
        int wSize = -1;
        Assert.assertEquals(12, findMaxSumUsingWindow(input, wSize));
    }

    @Test
    public void testcase3() {
        int[] input = new int[]{1, 5, 2, 3, 7, 1};
        int wSize = 8;
        Assert.assertEquals(12, findMaxSumUsingWindow(input, wSize));
    }

    @Test
    public void testcase4() {
        int[] input = new int[]{1, 6, 9, 0, 7, 4, 2, 8};
        int windowSize = 3;
        org.testng.Assert.assertEquals(findMaxSum(input, windowSize), 16);
    }
    @Test
    public void testcase5() {
        int[] input = new int[]{3,2};
        int windowSize = 2;
        org.testng.Assert.assertEquals(findMaxSum(input, windowSize), 5);
    }

    @Test
    public void testcase6() {
        int[] input = new int[]{-3,-2,-1};
        int windowSize = 2;
        org.testng.Assert.assertEquals(findMaxSum(input, windowSize), -3);
    }

    private int findMaxSum(int[] input, int wSize) {
        int result = Integer.MIN_VALUE;
        //int result=0;
        int currentSum;
        for (int i = 0; i < input.length - wSize; i = i + wSize - 1) {
            currentSum = 0;
            for (int j = i; j < i + wSize; j++) {
                currentSum += input[j];
            }
            result = Math.max(result, currentSum);
        }

        // -5 -4 -3 -2 -1  0  1  2  3  4  5
        return result;
    }

    private int findMaxSumUsingWindow(int[] input, int wSize) {
        //int result = Inte
        if (wSize > input.length || wSize <= 0 || input.length == 0) {
            throw new RuntimeException("There is some problem!");
        }
        int windowSum = 0;
        for (int i = 0; i < wSize; i++) {
            windowSum += input[i];
        }

        int maxSum = windowSum;

        for (int i = wSize; i < input.length; i++) {
            windowSum = windowSum + input[i] - input[i - wSize];  //1, 5, 2 ,3, 7, 1
            maxSum = Math.max(windowSum, maxSum);
        }

        /*for (; right < input.length; right++) {
            if (right < wSize) {
                windowSum += input[right++];
            } else {

            }
            maxSum = Math.max(windowSum, maxSum);
        }*/
        return maxSum;
    }
}
