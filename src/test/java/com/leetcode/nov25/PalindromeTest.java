package com.leetcode.nov25;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
String input = "A man, a plan, a canal, Panama!";
// Output: true

Bruteforce Psuedo code
1. Replace with regex
2.
3.
 */
public class PalindromeTest {
    @Test
    public void testcase1(){
        String testString = "A man, a plan, a canal, Panama!";
        Assert.assertTrue(checkPalindrome(testString));
    }

    public boolean checkPalindrome(String currentString){
        currentString = currentString.replaceAll("[!,\\s+]","");
        System.out.println(currentString);
        int left = 0;
        int right = currentString.length()-1;

        while(left<right){
            //Character.isLetterOrDigit()
            /*if(!(currentString.toLowerCase().charAt(left++)==currentString.toLowerCase().charAt(right--))){
                return false;
            }*/

            if(Character.isLetterOrDigit(currentString.charAt(left))
                    && Character.isLetterOrDigit(currentString.charAt(right))
                    && (Character.toLowerCase(currentString.charAt(left))==Character.toLowerCase(currentString.charAt(right)))){
                left++;
                right++;
            }
            else if(Character.isLetterOrDigit(currentString.charAt(left))){
                left++;
            }
            else if(Character.isLetterOrDigit(currentString.charAt(right))){
                right--;
            }
            else{
                return false;
            }

        }
        return true;
    }
}
