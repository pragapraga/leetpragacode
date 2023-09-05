package com.leetcode;
/*

https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/

@input - List<String> and String
@output - boolean

1. Testdata - ["apple","banana","carrot","mango"] , "abcm" => true
2. Testdata - ["apple","banana"] , "aa" => false
3. Testdata - ["apple","banana","carrot","mango"] , "yzd" => false


Pseudo code
1. Traverse through the list of string
2. Get the 1st char of every string , append it
3. check the equality of framed string vs string value passed in input
 */

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Acronym {

    //public static void main(String[] args) {
    public boolean formAcronym(List<String> list, String acronym) {
        StringBuilder sb = new StringBuilder();
        for (String currentString : list) {
            sb.append(currentString.charAt(0));
        }
        //System.out.println(sb);
        return sb.toString().equals(acronym);
    }

    @Test
    public void testOne() {
    List<String> list = new ArrayList<>(Arrays.asList("apple","banana","carrot"));
        Assert.assertTrue(formAcronym(list,"abc"));
    }

    @Test
    public void testSecond() {
        List<String> list = new ArrayList<>(Arrays.asList("apple","banana"));
        Assert.assertTrue(formAcronym(list,"ab"));
    }

    @Test
    public void testThree() {
        List<String> list = new ArrayList<>(Arrays.asList("apple","banana"));
        Assert.assertFalse(formAcronym(list,"aa"));
    }
}
