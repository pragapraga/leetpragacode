package com.leetcode.oct21;

public class StringBasics {
    public static void main(String[] args) {
        String str = "2[abc]3[cd]ef";

        System.out.println(str.indexOf("["));
        System.out.println(str.lastIndexOf("["));
        System.out.println(str.indexOf("[",2));
        System.out.println(str.indexOf("]"));
        System.out.println(str.lastIndexOf("]"));
    }
}
