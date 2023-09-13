package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.* ;
import java.io.*;


/*
@input - String
@output - boolean

Psuedo code
1. Reverse the string, it is already a palindrome, return TRUE
2.1 Appraoch 1 - Check 1st index and last index is equal or not, if equal, proceed else remove the index which is least
2.2 Approach 2 - find the middle index and delete it, check the string reverse nature


*/
public class NinjaPalindrome {

    public static boolean validPalindrome(int n, String s) {
        boolean flag = true;
        if(s.equals(reverse(s))) return flag;
        StringBuilder sb = new StringBuilder(s);
        int index = (int)n/2;
        sb.deleteCharAt(index);
        if(s.equals(reverse(sb.toString()))) {
            return flag;
        }
        return false;
    }

    public static String reverse(String currentString){
        return new StringBuilder(currentString).reverse().toString();
    }

    @Test
    public void test(){
        Assert.assertTrue(validPalindrome(14, "BGPHBJNNJBHPGB"));
    }

    @Test
    public void testOne(){
        Assert.assertTrue(validPalindrome(8, "AZBCDCBA"));
    }

}

/*

4
14
BGPHBJNNJBHPGB
13
UQXYDILIDYXZU
10
XZUFVVFUZX
10
DOGTFFTGOD

 */
