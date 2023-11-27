package com.leetcode.nov25;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

/*
Given two strings, check if they are anagrams of each other.
String str1 = "listen";
String str2 = "silent";
// Output: true

Psuedo code
1. Calculate the frequency of each character of str1 and str2 separately
2. Check the frequencies are same or not
3. if the frequency is same, it is anagram else not
 */
public class AnagramTest {
    @Test
    public void testacase1(){
    String str1 = "listen";
    String str2 = "silenT";

    Assert.assertTrue(checkAnagram(str1,str2));
    }

    private boolean checkAnagram(String str1, String str2) {
        char[] chstr1arr = str1.toCharArray();
        char[] chstr2arr = str2.toCharArray();
        HashMap<Character,Integer> str1hMap = new HashMap<>();
        HashMap<Character,Integer> str2hMap = new HashMap<>();

        for(char ch1 : chstr1arr){
            int freq1 = str1hMap.getOrDefault(ch1,0)+1;
            str1hMap.put(ch1,freq1);
        }

        for(char ch2 : chstr2arr){
            int freq2 = str2hMap.getOrDefault(ch2,0)+1;
            str2hMap.put(ch2,freq2);
        }
        System.out.println(str1hMap);
        System.out.println(str2hMap);
        for(int i=0;i<str1.length();i++){
            return str1hMap.get(str1.charAt(i)).equals(str2hMap.get(str1.charAt(i)));
        }

        return false;
    }
}
