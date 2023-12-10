package com.leetcode.dec8;

public class A {
    public void m1(){
        System.out.println("A m1");
    }
    public void m2(){
        System.out.println("A m2");
    }
    public void m3(){
        System.out.println("A m3");
    }

    public static void main(String[] args) {
        A a1 = new B();
        A a2 = new A();
        B b1 = new B();
        //B b2 = new A();

        a1.equals(a2);



    }
}
