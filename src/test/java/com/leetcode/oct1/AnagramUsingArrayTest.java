package com.leetcode.oct1;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
@input - String
@output - boolean


 */
public class AnagramUsingArrayTest {
    @Test
    public void testCase1(){
        String s1 = "Anagram";
        String s2 =  "Gagaram";
        Assert.assertTrue(checkAnagram(s1,s2));
    }

    private boolean checkAnagram(String s1, String s2) {
        boolean flag=false;
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        for (int i = 0; i <s1.length() ; i++) {
            char currentChar = s1.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                if(s2.charAt(j)==currentChar){
                    flag=true;
                }
            }
        }
        return flag;
    }
}
