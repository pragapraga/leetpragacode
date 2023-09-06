package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;
/*
3:56am
@input - String[], int
@output - String

03:58
Testdata - "What is the solution to this program" , 3 => "What is the"
Testdata - "What is the solution to this program" , 6 => "What is the solution to this program"
Testdata - "What is the solution to this program" , 1 => "What"

03:59
Psuedo code
1. Read the sentence s and k value
2. Find the length of the word by splitting
3. while (k<i value in for loop append it to StringBuilder)
4. return StringBuilder reference

*/

public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<k;i++){
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }

    @Test
    public void testOne(){
        String currenttring = "What is the solution to this program";
        Assert.assertEquals(truncateSentence(currenttring,3),"What is the");
    }
    @Test
    public void testTwo(){
        String currenttring = "What is the solution to this program";
        Assert.assertEquals(truncateSentence(currenttring,7),currenttring);
    }
    @Test
    public void testThree(){
        String currenttring = "What is the solution to this program";
        Assert.assertEquals(truncateSentence(currenttring,1),"What");
    }
}
/*
Psuedo code
1. Read the sentence s and k value
2. Find the length of the word by splitting
3. while (k<i value in for loop append it to StringBuilder with space)
4. return StringBuilder reference after trimming as last space will be included in step 3

*/