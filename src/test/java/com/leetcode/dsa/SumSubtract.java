package com.leetcode.dsa;
/*
        Given two array, arr1, and arr2
        Subtract the sum of arr2 with arr1 respective index value, and also the sum should exclude the respective index in arr2

        arr1 = {1,2,3,4} ,
        arr2 = {2,3,4,5}


        output = {
        3+4+5-1 => 11
        2+4+5-2 =>
        2+3+5-3,
        2+3+4-4

 Psuedo code
 1. Iterate 1st array - arr1 and 2nd array - arr2, if the index is same, skip it and subtract the value of arr1
 2.
        */

import java.util.ArrayList;
import java.util.Arrays;

public class SumSubtract {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{2, 3, 4, 5};
        int[] arr = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (i == j) {
                    continue;
                }
                else {
                    sum = sum + arr2[j];
                }
            }
            arr[i]=sum-arr1[i];

        }

        for (int a:arr
             ) {
            System.out.print(a+",");
        }
    }
}
