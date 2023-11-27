package com.leetcode.nov21;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
Find if a given parantheses is valid or not
  eg. String input = "({[]})";
output = true;

Optum


Psuedo code

1. HashMap<Character,Character> mappy = new HashMap<>();
2. mappy.put(')','(');
3. mappy.put('}','{');
4. mappy.put(']','[');
5. Convert the String to char array
6. push into stack if it is opening bracket
7. else
7.1



 */
public class BalancedParenthesisTest {

    @Test
    public void testcase1(){
        String input = "{([])}";
        Assert.assertTrue(checkBraces(input));
    }

    @Test
    public void testcase2(){
        String input = "{([[])}";
        Assert.assertFalse(checkBraces(input));
    }
    @Test
    public void testcase3(){
        String input = "(]";
        Assert.assertFalse(checkBraces(input));
    }

    private boolean checkBraces(String input) {
        char[] chArr = input.toCharArray();
        int counter=0;
        for (char ch:chArr) {
            if(ch=='('||ch=='{'||ch=='['){
                counter++;
            }
            else if(ch==')'||ch=='}'||ch==']'){
                counter--;
            }
        }
        return counter==0;
    }
}
