package com.leetcode;

import org.testng.annotations.Test;
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
    public String decodeMessage(String key, String message) {
        StringBuilder keyBuilder = new StringBuilder();
        if (key.contains(" ")) {
            String[] words = key.split(" ");
            for (String word : words) {
                keyBuilder.append(word);
            }
        }
        System.out.println(keyBuilder);
        return null;
    }

    @Test
    public void testOne(){
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        decodeMessage(key,message);
    }
}
