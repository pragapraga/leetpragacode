package com.leetcode.sep30hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

/*
https://leetcode.com/problems/valid-anagram/

@input - String, String
@output - boolean

Testdata1 - s1="rat" s2="cat" => false
Testdata2 - s1= "anagram"  s2="nagaram"=>true

Psuedo code
1. Initialize the Hashmap
2. Iterate s1 => Add the value as 1 default value if the key is new
3. Iterate s2 => Decrement the


 */
public class AnagramUsingHashing {
    @Test
    public void testCase1(){
        String s1="dgqztusjuu";
        String s2="dqugjzutsu";
        Assert.assertTrue(checkAnagramUsingForLoop(s1,s2));
    }

    private boolean checkAnagram(String s1, String s2) {
        HashMap<Character,Integer> mappy1= new HashMap<>();
        HashMap<Character,Integer> mappy2= new HashMap<>();
        for (char ch:s1.toCharArray()) {
            mappy1.put(ch,mappy1.getOrDefault(ch,0)+1);
        }
        for (char ch:s2.toCharArray()) {
            mappy2.put(ch,mappy2.getOrDefault(ch,0)+1);
        }
        return mappy1.equals(mappy2);
    }

    private boolean checkAnagramUsingForLoop(String s1, String s2) {
        HashMap<Character,Integer> mappy1= new HashMap<>();
        if(s1.length()!=s2.length())    return false;
        for (int i = 0; i < s1.length(); i++) {
            mappy1.put(s1.charAt(i),mappy1.getOrDefault(s1.charAt(i),0)+1);
            mappy1.put(s2.charAt(i),mappy1.getOrDefault(s2.charAt(i),0)-1);
            if(mappy1.get(s1.charAt(i))==0||mappy1.get(s2.charAt(i))==0){
                mappy1.remove(s1.charAt(i));
                mappy1.remove(s2.charAt(i));
            }
        }
        System.out.println(mappy1);
        return mappy1.isEmpty();
    }
}
