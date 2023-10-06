package com.leetcode.foundation;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

/*
10:38
Find the occurrence of each char in a String
@input - String
@output - Map

Testdata 1 - String => {S=1,t=1,r=1,i=1,n=1,g=1}
Testdata 2 - Leetcode => {L=1,e=3,d=1,c=1,o=1}

10:39
Psuedo code
1. Initialize HashMap
2. Iterate character by character using charAt method,
3. Using map.getOrDefault() maintain the counter
4. return the Hashmap
 */
public class CharacterOccurenceTest {

    private HashMap<Character,Integer> findCharacterOccurence(String str){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            int frequency = hashMap.getOrDefault(currentCharacter,0)+1;
            hashMap.put(currentCharacter,frequency);
        }
        System.out.println(hashMap);
        return hashMap;
    }

    @Test
    public void testcase1(){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        hashMap.put('r',1);hashMap.put('S',1);hashMap.put('t',1);hashMap.put('i',1);hashMap.put('g',1);hashMap.put('n',1);
        Assert.assertEquals(findCharacterOccurence("String"),hashMap);
    }

    @Test
    public void testcase2(){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        hashMap.put('e',3);hashMap.put('l',1);hashMap.put('t',1);hashMap.put('c',1);hashMap.put('o',1);hashMap.put('d',1);
        Assert.assertEquals(findCharacterOccurence("leetcode"),hashMap);
    }
}
