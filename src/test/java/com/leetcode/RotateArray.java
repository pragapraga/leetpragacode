package com.leetcode;
//https://www.codingninjas.com/studio/problems/rotate-array_1230543

import java.util.Arrays;

/*
 @input - int[] , int
 @output - int[]

 Testdata 1 - [1,2,3,4,5] , 3 => [4,5,1,2,3]
 Testdata 2 - [1,2] => 1 => [2,1]
 Testdata 3 - [1] , 1 => [1]

 Psuedo code
 1. Get an array of elements
 2. Shift the positions by 1 using copyArray


 Pointers
 0. find the range
 1. Shift the 1st element to last
 2. Last element to 1st
 3. move with in the range
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2};
        //int[] newArr = new int[arr.length];
        int rotate = 1;
        System.out.println(Arrays.toString(arr));
        while (rotate != 0) {
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            rotate--;
        }
        System.out.println(Arrays.toString(arr));
    }

}
