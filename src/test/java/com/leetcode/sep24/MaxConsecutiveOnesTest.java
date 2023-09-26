package com.leetcode.sep24;

/*
https://leetcode.com/problems/max-consecutive-ones/description/

@input - int[]
@output - int

Testdata 1- nums = [1,1,0,1,1,1] => 3
Testdatat 2- nums = [1,1,0,1,1,] => 2
Testdata 3 - nums = [0,0] => 0


Brunte Force Pseudo code
1. Have a counter
2. Check for the continuous 1's, based on consecutive one's increment the counter.
3.
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxConsecutiveOnesTest {

    @Test
    public void testCase1() {
        int[] input = new int[]{1, 1, 0, 1, 1, 1};
        Assert.assertEquals(checkConsecutiveOnes(input), 3);
    }

    @Test
    public void testCase2() {
        int[] input = new int[]{1, 1, 0, 1, 1};
        Assert.assertEquals(checkConsecutiveOnes(input), 2);
    }

    @Test
    public void testCase3() {
        int[] input = new int[]{0, 0};
        Assert.assertEquals(checkConsecutiveOnes(input), 0);
    }

    @Test
    public void testCase4() {
        int[] input = new int[]{1, 0, 1, 1, 0, 1};
        Assert.assertEquals(checkConsecutiveOnes(input), 2);
    }

    private int checkConsecutiveOnes(int[] input) {
        int maxCount = Integer.MIN_VALUE, currentCount = 0;
        int i = input.length - 1;
        while (i >= 0) {
            if ((input[input.length - 1] == 1) && (input[(input.length - i) - 1] == 1)) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else if (input[i] == 0) {
                currentCount = 0;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            }
            i--;
        }
        return maxCount;
    }


}
