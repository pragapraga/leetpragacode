package com.leetcode.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i <10 ; i++) {
            a.add(i);
        }
        ArrayList<String> a1 = new ArrayList<String>(5);
        for (int i = 0; i <5 ; i++) {
            a.add(i);
        }
        a.add(7);

        Integer[] cab = new Integer[]{1,2,3,4};
        ArrayList<Integer> ab = new ArrayList(Arrays.asList(cab));
        System.out.print(ab);
       // System.out.print(a);


    }
}
