package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
@Input - String[]
@output - int

Testdata 1 - ["I love Programming","Lets do it now","Whatsup bro","Hey there"] => 4
Testdata 2 - ["Hi","Hey There","Bye"] => 2

Psuedo Code
1. Iterate through individual sentences with help of for each loop
2. count the spaces
2.1 if there is only one word, return 1
2.2. if there is n space, number of words is (count of space +1)
3. return the maximum words on given sentence

*/
public class MaxWordsInSen {

    public int mostWordsFound(String[] sentences) {
        int maxLength=Integer.MIN_VALUE;

        for(String currentSentence: sentences){
            String[] words = currentSentence.split(" ");
            if(words.length>maxLength){
                maxLength = words.length;
            }
        }
        return maxLength;
    }

    @Test
    public void testOne(){
        String[] input = new String[] {"I love Programming","Lets do it now","Whatsup bro","Hey there"};
        Assert.assertEquals(mostWordsFound(input),4);
    }
}
