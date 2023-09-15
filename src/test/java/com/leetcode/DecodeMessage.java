package com.leetcode;

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
        String atoz = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder keyBuilder = new StringBuilder();
        if (keyValue.contains(" ")) {
            String[] words = keyValue.split(" ");
            for (String word : words) {
                keyBuilder.append(word);
            }
        }
        HashMap<Character, Character> mappy = new LinkedHashMap<>();
        for (int i = 0; i < 26; i++) {
            mappy.put(keyBuilder.toString().charAt(i), atoz.charAt(i));
        }
        mappy.forEach((key, value) -> System.out.println(key + " = " + value));

        for (int i = 0; i < message.length(); i++) {
            char currentCharater = message.charAt(i);
            //message.replace(message.charAt(i),mappy.getOrDefault(message.charAt(i), " "));
            message.replace(currentCharater, mappy.get(currentCharater));
            System.out.println(message);
        }


        return null;
    }

    @Test
    public void testOne() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        decodeMessage(key, message);
    }
}
