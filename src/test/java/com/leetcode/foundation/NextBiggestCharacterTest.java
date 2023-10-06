package com.leetcode.foundation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NextBiggestCharacterTest {
    @Test
    public  void testcase1(){
        char[] input = new char[]{'a','b','c','e'};
        Assert.assertEquals(checkNextBigChar(input,'c'),'e');
    }

    @Test
    public  void testcase2(){
        char[] input = new char[]{'a','b','c','z'};
        Assert.assertEquals(checkNextBigChar(input,'c'),'z');
    }

    @Test
    public  void testcase3(){
        char[] input = new char[]{};
        Assert.assertEquals(checkNextBigChar(input,'a'),'a');
    }

    private char checkNextBigChar(char[] input,char ch) {

        for (int i = 0; i < input.length ; i++) {
            if(input[i]>ch){
                return input[i];
            }
        }

        return 'a';
    }
}
