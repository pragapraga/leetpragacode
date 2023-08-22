package com.leetcode.dsa;

import java.util.Arrays;

public class StaticArray {

    public static void main(String[] args){
        int[] arr =  {1,2,3};
        int[][] arr1 = {{1,2},{4,5}};
        System.out.println(arr[2]);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(new Integer[]{}); //[Ljava.lang.Integer;@1d251891  -  Integer denotes the Integer class which is non Primitive
        System.out.println(new int[]{});// [I@48140564 - I denotes Integer

        for (int j : arr) {
            System.out.print(j+",");
        }

        /*
        arr ->100
        zero index memory location+(bye of index)

        a[0] => 100
        a[1] => 104
        a[2] = 108
         */
    }
}
