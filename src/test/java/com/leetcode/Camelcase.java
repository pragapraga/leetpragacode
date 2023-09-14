package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

//https://www.hackerrank.com/challenges/camelcase/problem
/*
     @input - String
     @Output - int

     testdata - saveChangesInTheEditor => 5

     Psuedo code
     1. Declare a counter
     2. Parse the string and if the char is Uppercase increment the counter
 */
public class Camelcase {

    public int camelcase(String s) {
        int wordCounter = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                wordCounter++;
            }
        }
        return wordCounter;

    }

    @Test
    public void testOne(){
        String input ="saveChangesInTheEditor";
        Assert.assertEquals(camelcase(input),5);
    }
}
