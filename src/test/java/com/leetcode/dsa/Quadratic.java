package com.leetcode.dsa;

import java.util.Arrays;

public class Quadratic {

    public static void main(String[] args) {
        int count = 0;
        int[] arr = new int[]{20000, 2000, 200, 20, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                count++;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print(count);
        System.out.print(Arrays.toString(arr));
    }
}
