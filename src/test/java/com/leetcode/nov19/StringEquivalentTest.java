package com.leetcode.nov19;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class StringEquivalentTest {

    @Test
    public void testcase1(){
        String[] word1 = new String[]{"abc", "d", "defg"};
        String[] word2 = new String[]{"abcddefg"};
        Assert.assertTrue(arrayStringsAreEqual(word1,word2));
    }
    @Test
    public void testcase2(){
        String[] word1 = new String[]{"a", "cb"};
        String[] word2 = new String[]{"a", "bc"};
        Assert.assertFalse(arrayStringsAreEqual(word1,word2));
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String currentWord1 : word1){
            sb1.append(currentWord1);
        }
        for(String currentWord2 : word2){
            sb2.append(currentWord2);
        }
        System.out.print(sb1);
        System.out.println(" ");
        return sb1.toString().equals(sb2.toString());

    }
}
