package com.leetcode.sep22;

import java.util.Stack;

/*
@input - String
@output - String

Testdata1 - (()) => ()
Testdata2 - (()()) (()) ((())) => ()()()(())
Testdata3 - ()() => ""

Psuedo code
1. Occurrence of '(' next to ')' skip and find the ')' break it


 */
public class RemoveOutterMostBrackets {
    public static void main(String[] args) {
        String s = "(()())(())((()))";
        Stack<Character> bracket = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(!bracket.isEmpty()){
                    sb.append(s.charAt(i));
                }
                bracket.push(s.charAt(i));
            }else{
                bracket.pop();
                if(!bracket.isEmpty()){
                    sb.append(s.charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
    }
