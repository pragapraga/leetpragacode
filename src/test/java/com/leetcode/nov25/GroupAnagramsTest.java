package com.leetcode.nov25;

import org.testng.annotations.Test;

import java.util.*;

/*
Given an array of strings, group anagrams together.
String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Psuedo code
1. Create a list with number of strings in string array ( In worst case, we will have n as list size ) else we will have <n as its size
2.1 Check String is anagram or not by comparing against other strings, if the string is anagram of another string, add it to the list
2.2 else you will end up having only one string in that list
3 Create List<List<String>> and return it

 */
public class GroupAnagramsTest {

    @Test
    public void testcase1() {
        groupAnagram();
    }

    @Test
    public void testcase2() {

    }

    public void groupAnagram() {
        HashMap<String, List<String>> map = new HashMap<>();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        ArrayList<String> arrList = new ArrayList<>();
        for (String currentWord : strs) {
            char[] charr = currentWord.toCharArray();
            Arrays.sort(charr);
            //System.out.println(charr);
            String currentSortedWord = new String(charr);
            arrList.add(currentSortedWord);
            if(!map.containsKey(currentSortedWord)){
                map.put(currentSortedWord , new ArrayList<String>());
            }
            map.get(currentSortedWord).add(currentWord);
        }
        System.out.println(new ArrayList<>(map.values()));



    }
}
