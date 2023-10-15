package com.leetcode.oct15;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

public class ValidParanthesisTest {

    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(currentChar=='('||currentChar=='['||currentChar=='{'){
                stack.push(currentChar);
            }
            else{
                if(stack.peek()==map.get(currentChar)){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

//    public static void main(String[] args) {
//        ValidParanthesisTest vt = new ValidParanthesisTest();
//        vt.isValid("()[]{}");
//    }

    @Test
    public void testcase1(){
        Assert.assertTrue(isValid("()[]{}"));
        Queue a = new ArrayDeque();
    }

    @Test
    public void testcase2(){
        Assert.assertFalse(isValid("()[]{}{"));
    }
    @Test
    public void testcase3(){
        Assert.assertFalse(isValid("({[]})"));
    }

}

