package com.leetcode.additional;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TwoPointerPalindromeTest {

    @Test
    public void testCase1() {
        String input = "hello";
        String output = "olleh";
        Assert.assertEquals(testPalindrome(input), output);
    }

    private String testPalindrome(String input) {
        char[] inputArray = input.toCharArray();
        int leftPointer = 0;
        int rightPointer = input.length() - 1;
        while (leftPointer < rightPointer) {
            char temp = inputArray[leftPointer];
            inputArray[leftPointer] = inputArray[rightPointer];
            inputArray[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }
        return Arrays.toString(inputArray);
    }
}
