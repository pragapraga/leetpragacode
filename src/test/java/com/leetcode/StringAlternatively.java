package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;
/*

@input - String, String
@output - String

Testdata 1 - "abc" , "pqr" => apbqcr
Testdata 2 - "ab" , "pqrs" => apbqrs

Psuedo code
1. Have while loop and iterate the string and add the i value
2. if we have left over, concat them


*/
public class StringAlternatively {
    public String mergeAlternately(String word1, String word2) {
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1Array.length || j < word2Array.length) {
            if (i < word1Array.length) sb.append(word1Array[i]);
            if (j < word1Array.length) sb.append(word2Array[j]);
            i++;j++;
        }
        return sb.toString();
    }

    @Test
    public void testOne() {
        Assert.assertEquals(mergeAlternately("abc", "pqr"), "apbqcr");
    }
}

/*
1. Declare char Array for word1 and word2
2. StringBuilder to save the values, i and j = 0
3. Iterate while loop comparing  append each char to sb
4. return sb
*/
