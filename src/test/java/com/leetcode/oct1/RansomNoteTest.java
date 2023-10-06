package com.leetcode.oct1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/*
@input - String, String
@output - boolean

Testdata1 - ransomenote= "abc" magazine="aabbcc" => true
Testdata2 - ransomenote= "abc" magazine="xyz" => false

Bruteforce Psuedo code
1.
2. Convert ransomenote into characters, check whether all characters are present in magazine


Frequency Array psuedo code
1. Initialize the char array with 128 chracters
2. increment the frequency array when ever you find the characters and decrement the characters when you find the same character again


HashMap psuedo code
1.
2. Add the frequency to the character
 */
public class RansomNoteTest {

    @Test
    public void testCase1() {
        String ransomeNote = "abc";
        String magazine = "abc";
       Assert.assertTrue(checkRansomFrequencyArray(ransomeNote, magazine));
        //Assert.assertTrue(checkRansomNoteBruteForce(ransomeNote, magazine));
    }

    @Test
    public void testCase3() {
        String ransomeNote = "abc";
        String magazine = "aabbcc";
        Assert.assertTrue(checkRansomFrequencyArray(ransomeNote, magazine));
    }

    @Test
    public void testCase2() {
        String ransomeNote = "abc";
        String magazine = "xyz";
        Assert.assertFalse(checkRansomFrequencyArray(ransomeNote, magazine));
    }

    private boolean checkRansomNoteBruteForce(String ransomeNote, String magazine) {
        //String[] ch = ransomeNote.split("");
        boolean flag=true;
        for (int i = 0; i < ransomeNote.length()&& i<magazine.length(); i++) {
            for (int j = 0; j < magazine.length();j++) {
                if(!(magazine.charAt(i)==ransomeNote.charAt(j))){
                    flag= false;
                }
            }
        }
        return flag;
    }

    private boolean checkRansomFrequencyArray(String ransomeNote, String magazine){
        int[] result = new int[128];

        for (char ch :magazine.toCharArray()) {
            result[ch-'a']++;
        }

        for (char ch :ransomeNote.toCharArray()) {
            if(result[ch-'a']==0){
                return false;
            }
        }
//        for (int i = 0; i < ransomeNote.length(); i++) {
//            result[ransomeNote.charAt(i)-'a']--;
//            result[magazine.charAt(i)-'a']++;
//        }
//        System.out.println(Arrays.toString(result));
//        for (int n :result) {
//            if(n!=0){
//                return false;
//            }
//        }
        return true;
    }

    private boolean checkRansomHashMap(String note, String magazine){

        return false;
    }

}
