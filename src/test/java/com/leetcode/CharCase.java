package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class CharCase {
    /*
    @input - char
    @output - int

    TestData 1 - a => 0
    TestData 2 - A => 1
    TestData 3 - . => -1

    Psudeo Code
    1. Get the input from the user
    2. check the ascii values and return the result accordingly


    */
    public int charCaseValue(char ch) {
        int result =0;
        if((int)ch>=65 && (int)ch<=90){
            result =1;
            return result;
        }
        else if((int)ch>=97 && (int)ch<=122){
            return result;
        }
        return -1;
    }
    @Test
    public void testOne() {
        char input = 'c';
        Assert.assertEquals(charCaseValue(input), 0);
    }

    @Test
    public void testTwo() {
        char input = 'C';
        Assert.assertEquals(charCaseValue(input), 1);
    }
    @Test
    public void testThree() {
        char input = '(';
        Assert.assertEquals(charCaseValue(input), -1);
        Scanner in = new Scanner(System.in);
    }
}