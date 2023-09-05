package com.leetcode;
//https://www.codingninjas.com/studio/problems/rotate-array_1230543

import org.testng.Assert;
import org.testng.annotations.Test;
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
    public String rotateArray(int[] arr, int n) {
        // int[] arr = new int[]{1, 2, 3, 4, 5};
        //int[] newArr = new int[arr.length];
        int rotate = n;

        if (arr.length == 1) {
            return Arrays.toString(arr);
        }
        while (rotate != 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            rotate--;
        }
        return Arrays.toString(arr);
    }

    @Test
    public void testOne() {
        int[] arr = new int[]{1};
        Assert.assertEquals(rotateArray(arr, 1), "[1]");
    }

    @Test
    public void testTwo() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Assert.assertEquals(rotateArray(arr, 3), "[4, 5, 1, 2, 3]");
    }

    @Test
    public void testThree() {
        int[] arr = new int[]{1, 2};
        Assert.assertEquals(rotateArray(arr, 2), "[1, 2]");
    }
}
