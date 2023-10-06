package com.leetcode.oct1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;


/*
@Input - String
@output - boolean


Psuedo code
1. Remove the white spaces between the words
2. Declare an int[] with 26 size with '1'
3. Iterate the sentence char by char, if you find the character, decrement it
 */
public class CheckAllAlphabetsTest {
    @Test
    public void testcase1(){
        String atoz = "the quick brown fox jumps over the lazy dog";
        Assert.assertTrue(checkAlphabets(atoz));
    }

    private boolean checkAlphabets(String atoz) {
        String input = atoz.replace(" ","");
        int[] result = new int[26];
        for (int i =0;i<26;i++) {
            result[i]=1;
        }
        System.out.println(input);
        System.out.println(Arrays.toString(result));

        if(input.length()<26) return false;
        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i)-'a';
            System.out.println(index);
            result[index]--;
        }
        System.out.println(Arrays.toString(result));
        for (int n: result) {
            if(!(n==1)){
                return false;
            }
        }
        return true;
    }
}
