package com.leetcode.nov25;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
1. Longest Substring without Repeating Characters:
Given a string, find the length of the longest substring without repeating characters.
String input = "abcabcbb";
// Output: 3 (for "abc")

Psuedo code
1. Initialize left and right pointer
2.

 */
public class LongestSubStringTest {
    @Test
    public void testcase1() {
        String input = "abcabcbb";
        Assert.assertEquals(findLongestSubString(input), 3);
    }

    private int findLongestSubString(String input) {

        int left = 0;
        int right = 0;
        int size = 0;
        while (right < input.length()) {

        }
        return size;
    }

}
