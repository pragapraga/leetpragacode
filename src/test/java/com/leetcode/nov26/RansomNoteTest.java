package com.leetcode.nov26;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/*
Given an arbitrary ransom note string and another string containing letters from all the magazines,
write a code that will return true if the ransom note can be constructed from the magazines,
otherwise, it will return false.
 
String ransomNote = "aabb";
String magazine = "aabbc";
// Output: true

String note = "abcdef"
String mag = "abcefghijklmn"
//Output: true


String note = "abc"
String mag = "sxy"
//output: false

1. ASCII array
2. Hashing
 */
public class RansomNoteTest {
    @Test
    public void testcase1(){
        String note = "abc";
        String masterNote = "sxy";
        Assert.assertFalse(checkRansomNoteBuilder(note,masterNote));
    }
    @Test
    public void testcase2(){
        String note = "a";
        String masterNote = "abc";
        Assert.assertTrue(checkRansomNoteBuilder(note,masterNote));
    }

    /*
    1. Create a frequency array and store 1 in all 26 places
    2. Take the note
     */
    private boolean checkRansomNoteBuilder(String note, String masterNote) {
        boolean isPossible = true;
        //String alpha = "abcdefghijklmnopqrstuvwxyz";

        int[] freqArr = new int[26];

        for (int i=0;i<note.length();i++) {
            freqArr[note.charAt(i) -'a']++;
        }
        System.out.println(Arrays.toString(freqArr));

        for(int i=0;i<masterNote.length();i++){
            if(freqArr[masterNote.charAt(i) -'a'] >0){
                int i2 = freqArr[masterNote.charAt(i) - 'a'];
                freqArr[masterNote.charAt(i) -'a']--;
            }
        }
        /*int ch = 'a';
        System.out.println(ch);
        int[] ascii = new int[]{};
        int index=0;
        for (int currentChar:note.toCharArray()) {
            ascii[index++]=currentChar;
        }
        System.out.println(Arrays.toString(ascii));*/
        System.out.println(Arrays.toString(freqArr));
       for(int i=0;i<26;i++){
           if(freqArr[i]<0){
               isPossible = false;
               return isPossible;
           }
       }
        return  isPossible;
    }


}
