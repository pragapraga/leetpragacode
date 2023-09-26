package com.leetcode.sep14;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
/*
12:13am
@input - String[]
@output - int

Testdata - words = ["ab","ba","zz"] => 1
Testdata - words = ["ab"] => 0
Testdata - words = ["ab","cd"] => 0

12:15am
Psuedo code
1. int pairFound=0
2. Create a Hashset
3. Create a helper function to reverse it
4. Iterate through all the individual words
4.1 reverse it and check if the word is found, if found increment pairFound and remove from the Hashset
4.2 If not found, add to the Hashset
*/
public class MaximumStringPairs {
    public int maximumNumberOfStringPairs(String[] words) {
        int pairFound=0;
        HashSet<String> hashy = new HashSet();

        for(int i=0;i<words.length;i++){
            String currentWord = words[i];
            if(hashy.contains(reverseIt(currentWord))){
                pairFound++;
                hashy.remove(currentWord);
            }
            else{
                hashy.add(currentWord);
            }
        }
        return pairFound;
    }
    public String reverseIt(String stringToBeReversed){
        StringBuilder sb = new StringBuilder(stringToBeReversed);
        return sb.reverse().toString();
    }

    @Test
    public void testOne(){
        String[]  words = new String[] {"cd","ac","dc","ca","zz"};
        Assert.assertEquals(maximumNumberOfStringPairs(words),2);
    }
    @Test
    public void testTwo(){
        String[]  words = new String[] {"ab","ba","cc"};
        Assert.assertEquals(maximumNumberOfStringPairs(words),1);
    }
}
