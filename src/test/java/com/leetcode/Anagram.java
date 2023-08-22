package com.leetcode;

import org.testng.annotations.Test;

import org.junit.Assert;

import java.util.Arrays;

public class Anagram {
    public boolean anagram(String a, String b) {
    boolean result=false;
    if(a.length()!=b.length()){
        return result;
    }
    char[] achar = a.toLowerCase().toCharArray();
    char[] bchar = b.toLowerCase().toCharArray();

        Arrays.sort(achar);
        Arrays.sort(bchar);
        return Arrays.equals(achar,bchar);
    }

    @Test
    public void positiveCase() {

        Assert.assertTrue(anagram("hello","Hello"));
    }

    @Test
    public void negativeCase() {

        Assert.assertFalse(anagram("Hello","Yello"));
    }

    @Test
    public void edgeCase() {

       Assert.assertFalse(anagram("abc","def"));
    }
}
