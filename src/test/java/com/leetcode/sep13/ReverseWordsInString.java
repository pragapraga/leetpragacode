package com.leetcode.sep13;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
https://leetcode.com/problems/reverse-words-in-a-string-iii/description/


@input - string
@output - String

Testdata 1 - Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Psuedo code
1. Parse each word in the given string
2. Take one word at a time and reverse it
3. Using String Builder, append it
 */
public class ReverseWordsInString {

    StringBuilder sb = new StringBuilder();

    public String reverseWords(String s) {

        String[] result = s.split(" ");
        for (int i = 0; i < result.length; i++) {
            reverseWord(result[i]);
        }
        return sb.toString().trim();
    }

    public void reverseWord(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        sb.append(" ");
    }

    @Test
    public void testOne() {
        String input = "Let's take LeetCode contest";
        String output = "s'teL ekat edoCteeL tsetnoc";
        Assert.assertEquals(reverseWords(input),output);
    }

    @Test
    public void testTwo() {
        String input = "God Ding";
        String output = "doG gniD";
        Assert.assertEquals(reverseWords(input),output);
    }

}
