package com.leetcode.sep25;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
07:05
@input - String
@output - int

07:05
Testdata 1 - "WWBBBBBBWBWB" k=10 => 2
Testdata 2 - "WBWBBBW" k=2 => 0
07:10


Brute Force Psuedo code
1. Have W counter
2. If there is consecutive black blocks already exists  , return k as 0
3. Start from i value and iterate till less than end of the length, have wCounter, whichever is less return the counter
07:16
 */
public class ConsecutiveBlackBlocksTest {
    @Test
    public void testcase1() {
        String input = "WWBBBBBBWBWB"; // 0123456789  123456789'10' 23456789'10'11'
        int k = 10;
        Assert.assertEquals(testConsecutiveBlackBlock(input, k), 2);
    }

    @Test
    public void testcase2() {
        String input = "WBWBBBW"; //01  12  23  34   45  56
        int k = 2;
        Assert.assertEquals(testConsecutiveBlackBlock(input, k), 0);
    }

    private int testConsecutiveBlackBlock(String input, int k) {
        int minValue = Integer.MAX_VALUE;
        int wCounter = 0;
        int start = 0;
        int end = k - 1;
        while (end < input.length()) {
            wCounter=0;
            for (int i = start; i <= k; i++) {

                if (input.charAt(i) == 'W') {
                    wCounter++;
                }
            }
            minValue = Math.min(minValue,wCounter);
            start++;
            end++;
        }


        return wCounter;
    }
}
