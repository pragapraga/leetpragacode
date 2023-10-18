package com.leetcode.oct17;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Stack;

/*
20:25
https://leetcode.com/problems/backspace-string-compare/

@input - String
@output - boolean


Testdata 1 -  s = "ab#c", t = "ad#c" =>  true
Testdata 2 -  s = "ab##", t = "c#d#" =>  true
Testdata 3 -  s = "a#c", t = "b"     => false

Psuedo code
1. Initialize Stack
2. Push the character one by one, pop it if you find # value
3. Compare two stack values, if they are equal, return true else false
 */
public class BackSpaceCompareTest {
    @Test
    public void testcase1() {
        String s = "ab#c";
        String t = "ad#c";
        Assert.assertTrue(findFinalStringAfterBackSpace(s, t));
    }

    @Test
    public void testcase2() {
        String s = "ab##";
        String t = "c#d#";
        Assert.assertTrue(findFinalStringAfterBackSpace(s, t));
    }

    @Test
    public void testcase3() {
        String s = "a#c";
        String t = "a";
        Assert.assertFalse(findFinalStringAfterBackSpace(s, t));
    }
    @Test
    public void testcase4() {
        String s = "a##c";
        String t = "a";
        Assert.assertFalse(findFinalStringAfterBackSpace(s, t));
    }


    private boolean findFinalStringAfterBackSpace(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch != '#') {
                sStack.push(ch);
            } else {
                sStack.pop();
            }
        }

        for (char ch : t.toCharArray()) {
            if (ch != '#') {
                tStack.push(ch);
            } else {
                tStack.pop();
            }
        }

        return sStack.equals(tStack);
    }
}
