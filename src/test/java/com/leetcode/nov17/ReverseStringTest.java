package com.leetcode.nov17;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ReverseStringTest {
    @Test
    public void testcase1() {
        String input = "Praga";
        String output = "agarP";
        Assert.assertEquals(reverseItUsingTwoPointer(input), output);
    }

    private String reverseIt(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    private String reverseItUsingTwoPointer(String input) {
        int left = 0;
        int right = input.length() - 1;
        char[] charr = input.toCharArray();
        while (left < right) {
            char temp = charr[left];
            charr[left] = charr[right];
            charr[right] = temp;
            right--;
            left++;
        }
        return new String(charr);
    }
}
