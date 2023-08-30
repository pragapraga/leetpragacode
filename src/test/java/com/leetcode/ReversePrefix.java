package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
06:35
@input - String and char
@output - String

Testdata 1 - word = "abcdefd", ch = "d" => dcbafd
Testdata 2 - word = "xyxzxe", ch = "z" => zxyxxe
Testdata 3 - word = "acdb" , ch = "b" => acdb
Testdata 4 - word = "acdb" , ch = "z" => acdb

Psuedo code -
1. Traverse the string and find the 1st occurence of the char using inbuilt method
1.1 If it exists traverse till that index
1.2 else return the string as is
2. If the index exists call another method to reverse the string and append it with remaining

 */
public class ReversePrefix {
    public String reversePrefix(String word, char ch) {
        int firstOccurence = word.indexOf(ch);
        System.out.println(firstOccurence);
        int lastOccurence = word.lastIndexOf(ch);
        System.out.println(lastOccurence);
        String firstHalf = "", result = "";
        if (firstOccurence == -1 && lastOccurence == -1) {
            return word;
        } else {
            firstHalf = reverseit(word.substring(0, firstOccurence + 1));
            result = firstHalf + word.substring(firstOccurence + 1);
        }
        return result;
    }

    private String reverseit(String word) {
        StringBuilder reversedWord = new StringBuilder(word);
        return reversedWord.reverse().toString();
    }

    @Test
    public void testMe() {
        Assert.assertEquals(reversePrefix("abcdefd", 'd'), "dcbaefd");
    }

    @Test
    public void testMeAgain() {
        Assert.assertEquals(reversePrefix("acdb", 'z'), "acdb");
    }

    @Test
    public void testMeAgainAgain() {
        Assert.assertEquals(reversePrefix("xyxzxe", 'z'), "zxyxxe");
    }

}
