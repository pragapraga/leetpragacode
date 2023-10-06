package com.leetcode.sep28;


import org.testng.Assert;
import org.testng.annotations.Test;

/*
https://leetcode.com/problems/faulty-keyboard/description/

@input - String
@output - String

Testdata1 - poiinter => ponter
Testdata2 - string => rtsng
Testdata3 - pragaii => praga


Psuedo code
1. Concept - StringBuilder
2. Iterate through all the characters one by one
2.1 if the char is 'i' reverse it using StringBuilder
 */
public class FaultyKeyboardTest {

    @Test
    public void testCase1(){
        String input ="poiinter";
        String output = "ponter";
        Assert.assertEquals(faultyKeyboard(input),output);
    }

    @Test
    public void testCase2(){
        String input ="string";
        String output = "rtsng";
        Assert.assertEquals(faultyKeyboard(input),output);
    }

    @Test
    public void testCase3(){
        String input ="pragaii";
        String output = "praga";
        Assert.assertEquals(faultyKeyboard(input),output);
    }

    private String faultyKeyboard(String input) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)!='i'){
                sb.append(input.charAt(i));
            }
            else{
                sb = sb.reverse();
            }

        }
        return sb.toString();
    }
}
