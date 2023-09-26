package com.leetcode.sep26;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;

/*
https://leetcode.com/problems/decode-the-message/description/

07:20
@input - String , String
@output -String

Testdata1  key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"  =>  Output: "this is a secret"
Testdata2  key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb" => Output: "the five boxing wizards jump quickly"

Psuedo code
1. remove the spaces of key and map it to alphabets (key as key and value as alphabets)
1.1 if the key already exists move to next alphabet
2. Iterate through the message and print the value from the map
2.1 Add spaces at necessary places in condition with output 
07:26
 */
public class DecodeMessage {

    @Test
    public void testCase1() {
        String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv", output = "this is a secret";
        Assert.assertEquals(decodeMessage(key, message), output);
    }

    @Test
    public void testCase2() {
        String key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb", output = "the five boxing wizards jump quickly";
        Assert.assertEquals(decodeMessage(key, message), output);
    }

    private String decodeMessage(String key, String message) {
        String keyWithoutSpaces = key.replaceAll(" ", "");
        System.out.println(keyWithoutSpaces);
        LinkedHashMap<Character, Character> linkedHashMap = new LinkedHashMap<>();
        char currentChar = 'a';
        for (int i = 0; i < keyWithoutSpaces.length(); i++) {
            if (!linkedHashMap.containsKey(keyWithoutSpaces.charAt(i))) {
                linkedHashMap.put(keyWithoutSpaces.charAt(i), currentChar++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (!(message.charAt(i) == ' ')) {
                sb.append(linkedHashMap.get(message.charAt(i)));
            } else {
                sb.append(" ");
            }

        }
        return sb.toString();
    }

//07:41
}
