package com.leetcode.sep18;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
16:04

@input - String
@output - int

Testdata 1 - "abccbel" => "abc" ,"bcc", "ccb" , "cbe", "bel" => 3
Testdata 2 - "abc" => "abc" => 1
Testdata 3 - "aaaaaaaa" => 0

Psuedo code
1. Initialize counter
2. Traverse through the string using for loop, if there are repeating characters, leave as is else increment the counter by 1
3. return counter
 */
public class GoodSubString {
    @Test
    public void testOne() {
        String input = "abccbe";
        Assert.assertEquals(findGoodString(input), 2);
    }

    @Test
    public void test() {
        String input = "xyzzaz";
        Assert.assertEquals(findGoodString(input), 1);
    }


    @Test
    public void testTwo() {
        String input = "abc";
        Assert.assertEquals(findGoodString(input), 1);
    }

    @Test
    public void testThree() {
        String input = "ccccc";
        Assert.assertEquals(findGoodString(input), 0);
    }

    private int findGoodString(String input) {
        int counter = 0;
        if (input.length() < 3) {
            return counter;
        } else if (input.length() == 3 && checkGoodString(input, 0)) {
            return ++counter;
        }

        for (int i = 0; i <= input.length() - 3; i++) {
            if (checkGoodString(input.substring(i, i + 3), 3)) {
                ++counter;
            }
        }
        return counter;
    }

    private boolean checkGoodString(String substring, int k) {
        System.out.println("SubString:: " + substring);
        for (int i = 0; i < substring.length(); i++) {
            for (int j = i + 1; j < substring.length(); j++) {
                if (substring.charAt(i) == substring.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}

//16:47
