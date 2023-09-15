package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
1:02am

@input - String
@output - String

Testdata 1 - string => rtsng
Testdata 2 - poiinter => ponter

Psuedo code
1. Parse character by character
2. when the character == i, reverse the previous String and continue to parse it
3. Return the final String

*/

public class FaultyKeyboard {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='i'){
                sb.append(s.charAt(i));
            }
            else{
                sb = sb.reverse();
            }
        }
        return sb.toString();
    }

    @Test
    public void testOne(){
        String actual = finalString("string");
        Assert.assertEquals(actual,"rtsng");
    }

    @Test
    public void testTwo(){
        String actual = finalString("poiinter");
        Assert.assertEquals(actual,"ponter");
    }
}
