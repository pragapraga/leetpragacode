package com.leetcode;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
@input - String, String
@output - String

Testdata 1 - key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb" => the five boxing wizards jump quickly

Testdata 2 - key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
-> this is a secret

Psuedo Code
1. Remove spaces and Map the key and alphabets [a-z]
2. Get the message
2.1 Declare a stringBuilder and append it to form String

*/
public class DecodeMessage {
    public String decodeMessage(String keyValue, String message) {
        keyValue = keyValue.replace(" ", "");
        HashMap<Character, Character> mappy = new LinkedHashMap<>();
        char ch = 'a';
        for (int i = 0; i < keyValue.length(); i++) {
            if (!mappy.containsKey(keyValue.charAt(i))) {
                mappy.put(keyValue.charAt(i), ch++);
            }
        }
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (mappy.get(message.charAt(i)) != null) finalString.append(mappy.get(message.charAt(i)));
            else finalString.append(' ');
        }
        return finalString.toString();
    }

    @Test
    public void testOne() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        Assert.assertEquals(decodeMessage(key, message),"this is a secret");
    }
    @Test
    public void testTwo(){
        String key = "eljuxhpwnyrdgtqkviszcfmabo";
        String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        Assert.assertEquals(decodeMessage(key, message),"the five boxing wizards jump quickly");
    }
}
