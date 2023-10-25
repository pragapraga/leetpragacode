package com.leetcode.oct25;
/*
https://leetcode.com/problems/counting-words-with-a-given-prefix/description/
https://leetcode.com/problems/goat-latin/description/
https://leetcode.com/problems/shortest-completing-word/description/
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountingWordsWithGivenPrefixTest {

    @Test
    public void testOne(){
        String[] input = new String[]{"pay","attention","practice","attend"};
        Assert.assertEquals(prefixCount(input,"at"),2);
    }

    public int prefixCount(String[] words, String pref) {
        int counter =0;
        for(String currentWord: words)
            if(currentWord.length()>=pref.length()&&currentWord.substring(0,pref.length()).equals(pref)){
                counter++;
            }
        return counter;
    }
}
