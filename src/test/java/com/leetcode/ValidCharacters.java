package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
Psuedo code
1. Iterate through each character in the given string
2. If it is word.charAt(0)!=a , increment aCounter
3. if the current char is
 */
public class ValidCharacters {

    public int minInsertionsToMakeValid(String word) {
        int insertions = 0;
        for (int i = 0; i <= word.length(); i = i + 3) {
            char firstChar = word.charAt(i);
            char secondChar = word.charAt(i + 1);
            char thirdChar = word.charAt(i + 2);
            if (firstChar != 'a') {
                insertions++;
            }
            if (secondChar != 'b') {
                insertions++;
            }
            if (thirdChar != 'c') {
                insertions++;
            }
        }
        return insertions;
    }


    @Test
    public void testOne() {
        //Testdata 2 - word="bbb" => "abcabcabc" => 6
        String word = "abcabc";
        Assert.assertEquals(minInsertionsToMakeValid(word), 0);
    }

    @Test
    public void testTwo() {
        //Testdata 2 - word="bbb" => "abcabcabc" => 6
        String word = "bbb";
        Assert.assertEquals(minInsertionsToMakeValid(word), 6);
    }
}
