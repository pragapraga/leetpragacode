package com.leetcode.additional;

public class Static {
    int a=0;
    Static(){
        System.out.println("Constructor");
    }
    {
        System.out.println("Non Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        new Static();
    }
}

