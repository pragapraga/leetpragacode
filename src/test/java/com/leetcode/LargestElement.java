package com.leetcode;

/*
https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279


@input - int[]
@output - int

Testdata - [1,2,3] => 3
Testdata - [1] => 1
Testdata - [99,1,2,3,5,90] => 99

Psudeo code
1. Assign the minimum number as Max
2. Iterate through array, assign the max if the number is greater than max declared in step 1
3. Repeat 1,2 util whole traverse is done in array

 */
public class LargestElement {

    public static void main(String[] args) {
        int[] arr = new int[]{1};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
