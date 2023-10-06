package com.leetcode.sep29;
/*
@input - String
@ouptut - String

Testdata 1 - This is Praga => sihT si agarP

Psuedo code
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseWordsTest {
    @Test
    public void testString(){
        String input ="This is Praga";
        String output ="sihT si agarP";
        Assert.assertEquals(reverseString(input),output);
    }

    private String reverseString(String input) {
        StringBuilder sb = new StringBuilder();

        return "";
    }
}
