package com.leetcode.additional;


public class Child extends Parent {
    static int a = 5;
    static int b = 1;
    public static void main(String[] args){
        a =++a + ++a + a++;
        System.out.println(a);
        a++;
        System.out.println(a);
    }
}


