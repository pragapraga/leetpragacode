package com.leetcode.nov18;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStringTest {
    @Test
    public void testcase1() {
        String input = "abc";
        String output = "cba";
        Assert.assertEquals(reverseUsingPointer(input), output);
    }
    @Test
    public void testcase2() {
        String input = "abcd";
        String output = "dcba";
        Assert.assertEquals(reverseUsingPointer(input), output);
    }
    @Test
    public void testcase3() {
        String input = "a";
        String output = "a";
        Assert.assertEquals(reverseUsingPointer(input), output);
    }

    private String reverseTheString(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    private String reverseUsingPointer(String input) {
        int left = 0;
        int right = input.length() - 1;
        char[] charArr = input.toCharArray();
        while (left < right) {
            char temp = charArr[left];
            charArr[left++] = charArr[right];
            charArr[right--] = temp;
        }
        return new String(charArr);
    }
}
