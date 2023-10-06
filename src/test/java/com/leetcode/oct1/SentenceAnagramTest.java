package com.leetcode.oct1;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SentenceAnagramTest {
    @Test
    public void testcase1(){
        String s1 = "anagram";
        String s2 = "nagaram";
        Assert.assertTrue(checkAnagramUsingArray(s1,s2));
    }

    private boolean checkAnagramUsingArray(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int[] result = new int[26];
        System.out.println(String.valueOf(ch1));
        System.out.println(ch2);

        for (int i = 0; i <s1.length(); i++) {
            result[s1.charAt(i)-'a']++;
            result[s2.charAt(i)-'a']--;
        }
        for (int n:result) {
            if(n!=0){
                return false;
            }
        }
        System.out.println(Arrays.toString(result));


        return true;
    }

}
