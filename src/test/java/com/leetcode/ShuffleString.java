package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
08:10
@input - String, int[]
@output - String

08:11
testdata 1 = s = "codeleet", indices = [4,5,6,7,0,2,1,3] => leetcode
testdata 2 = s = "aarp" , indices[5,2,1,0]


//2 approaches - char[] / StringBuilder
08:13
Psuedo code
1. variables - List<Character> finalCharArray
2. Read the indices and string
3. Char[]
3.1 Read the char and read the index, insert at appropriate index
*/
public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] shuffled = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            shuffled[indices[i]] = s.charAt(i);
        }
        return new String(shuffled);
    }

    @Test
    public void testOne() {
        String s = "codeleet";
        int[] indices = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
        Assert.assertEquals(restoreString(s, indices), "leetcode");
    }

    @Test
    public void testTwo() {
        String s = "gaarp";
        int[] indices = new int[]{3,4,2,1,0};
        Assert.assertEquals(restoreString(s, indices), "praga");
    }
}
//08:40
