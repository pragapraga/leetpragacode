package com.leetcode.oct29;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;

public class GoodStringTest {

    @Test
    public void testcase1() {
        String input = "xyzzaz";
        Assert.assertEquals(goodString(input), 1);
    }

    @Test
    public void testcase2() {
        String input = "aababcabc";
        Assert.assertEquals(goodString(input), 4);
    }

    public int goodString(String input) {
        int counter = 0;
        for (int i = 0; i < input.length() - 2; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < i + 3; j++) {
                set.add(input.charAt(j));
            }
            if (set.size() == 3) {
                counter++;
            }
        }
        return counter;
    }
}
