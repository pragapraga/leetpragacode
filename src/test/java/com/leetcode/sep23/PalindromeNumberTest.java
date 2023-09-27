package com.leetcode.sep23;

import org.junit.Assert;
import org.testng.annotations.Test;

public class PalindromeNumberTest {
    @Test
    public void testOne(){
        int input = 123321;
        Assert.assertTrue(checkNumberPalindrome(input));
    }

    private boolean checkNumberPalindrome(int input) {
        int originalNumber= input;
        int revNumber=0;
        while(input>0) {
            int reminder = input % 10;
            //System.out.println(reminder);
            revNumber = revNumber*10+reminder;
            input = input / 10;
        }
        System.out.println("revNumber = " + revNumber);
        System.out.println("input = " + input);
        return revNumber==originalNumber;
    }
}
