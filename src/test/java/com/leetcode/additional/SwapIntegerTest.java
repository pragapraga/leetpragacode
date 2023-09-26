package com.leetcode.additional;

public class SwapIntegerTest {
    public static void main(String[] args) {
        int a = 1212;
        int b = 3434;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        String s1 = "You";
        String s2 = "Love";
        System.out.println("Before swap: " + s1 + " " + s2);
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("After : " + s1 + " " + s2);

    }
}
