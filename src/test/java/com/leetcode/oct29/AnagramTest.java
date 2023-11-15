package com.leetcode.oct29;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;

public class AnagramTest {

    @Test
    public void testcase1() {
        String s = "anagram";
        String t = "nagaram";
        Assert.assertTrue(testAnagram(s, t));
    }

    @Test
    public void testcase2() {
        String s = "cat";
        String t = "rat";
        Assert.assertFalse(testAnagram(s, t));
    }

    public boolean testAnagram(String s, String t) {
        HashMap<Character,Integer> sSet =  new HashMap<>();
        HashMap<Character,Integer> tSet =  new HashMap<>();

        for (char ch: s.toCharArray()) {
            //  sSet.put();
        }

        return false;

    }
}
