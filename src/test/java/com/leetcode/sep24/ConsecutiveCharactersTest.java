package com.leetcode.sep24;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
10:39
@input - String
@Output - int

Testdata 1 - leetcode => 2
Testdata 2 - abbcccddddeeeeedcba =>5
Testdata 3 - abc => 0

10:40
Psuedo code
1. left =i , right =i+1 , increment the counter and make left = right
2. If some other character appears, increment left by 1
3.


 */
public class ConsecutiveCharactersTest {

    @Test
    public void testCase1() {
        String s = "leetcode";
        Assert.assertEquals(maxPower(s), 2);
    }

    @Test
    public void testCase2() {
        String s = "l";
        Assert.assertEquals(maxPower(s), 1);
    }
    public int maxPower(String s) {
        int left = 0;
        int right = 0;
        int count = 0;
        while (right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                left = right;
            } else {
                count = Math.max(count, right - left + 1);
            }
            right++;
        }
        return count;
    }
}
