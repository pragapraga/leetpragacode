package com.leetcode.sep20;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

/*
https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/
07:45
@input - String
@output - boolean

Testdata 1 - 1210 => true
Testdata 2 - 030 => false
07:48

Psuedo code
1.
2. convert string to char array, iterate through array, frame a Map<Character, Integer>
07:51


 */
public class EqualDigit {

    @Test
    public void test() {
        String num = "1210";
        Assert.assertTrue(checkEquality(num));
    }

    @Test
    public void testTwo() {
        String num = "030";
        Assert.assertFalse(checkEquality(num));
    }

    private boolean checkEquality(String num) {
        char[] chars = num.toCharArray();

        HashMap<String, Integer> mappy = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            if (mappy.containsKey(String.valueOf(chars[i]))) {
                mappy.put(String.valueOf(chars[i]), mappy.get(String.valueOf(chars[i])) + 1);
            } else {
                mappy.put(String.valueOf(chars[i]), 1);
            }
        }
        System.out.println(mappy);

        for (int i = 0; i < num.length(); i++) {
            mappy.get(String.valueOf(chars[i]));
            System.out.println(i + "::" + mappy.get(String.valueOf(i))+"::"+num.charAt(i));
            String currentValue = String.valueOf(mappy.get(String.valueOf(i)));
            if(mappy.get(String.valueOf(i))!=null){
                if(!currentValue.equals(String.valueOf(num.charAt(i)))){
                    return false;
                }
            }
        }
        return true;
    }
}
