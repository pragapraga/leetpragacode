package com.leetcode.nov28;

public class ChildClass extends ParentClass{
    ChildClass(){
        System.out.println("ChildClass Constructor");
    }
    public static void main(String[] args) {
        ParentClass child = new ChildClass();
    }
}
