package com.leetcode.dec2;

import com.leetcode.sep30hashing.TwoSumUsingHashingTest;

public class MaxSumTest {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        /*
        currentSum = 6 + 4  - input[0] //9
        currentSum = 9 + 5 - 2 => 12
        currentSum = 12 + 6 - 3 => 15
         */


        int k = 3;
        int currentSum = 0;
        int maxSum=Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            currentSum = currentSum + input[i];
        }
        System.out.println(currentSum);
        maxSum = currentSum;
        for (int i = k; i < input.length; i++) {
            currentSum = currentSum + input[i] - input[i - k];
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println("Max Sum:: "+maxSum);
    }
}
