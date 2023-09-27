package com.leetcode.sep23;

import org.junit.Assert;
import org.testng.annotations.Test;

/*
@input - String
@output - String

Testdata -  RADDAR => true
Testdata - DOM => false
Testdata - MALAYALAM => true


Psuedo code
1. Check the length of the string, if the length of the string is odd leave center value
2. If the length of the string is even compare last and first

 */
public class Palindrome {
@Test
    public void testOne(){
    String input = "RADDAR";
    Assert.assertTrue(checkPalinUsingTwoPointer(input));
}
    @Test
    public void testTwo(){
        String input = "1230321";
        Assert.assertTrue(checkPalinUsingTwoPointer(input));
    }
    @Test
    public void testThree(){
        String input = "abdefghijk";
        Assert.assertFalse(checkPalinUsingTwoPointer(input));
    }
    private boolean checkPalindrome(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length()-1; i >=0 ; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString().equals(input);
    }

    private boolean checkPalinUsingTwoPointer(String input){
        int firstPointer=0;
        int secondPointer=input.length();
        input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i)!=input.charAt(input.length()-i-1)){
                    return false;
                }
        }
    return true;
    }


    /*
    1. Initialise the pointer => left is length/2 and right length/2+1 if odd or length/2 if even
    2. Loop until end of the string and validate left and right are equal
    3. return true if all are equal and false if any mismatch
     */
    public boolean isPalindrome(String input){
        int left = input.length()/2-1,right;
        if(input.length()%2==0){
            right = input.length()/2+1;
        }
        else{
            right = input.length()/2;
        }

    return false;
    }
}
