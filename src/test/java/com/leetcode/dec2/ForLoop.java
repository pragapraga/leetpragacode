package com.leetcode.dec2;

import com.leetcode.sep30hashing.TwoSumUsingHashingTest;

public class ForLoop {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        int windowSize = 3;
        for (int i = 0; i <= input.length - windowSize; i++) {
            for (int j = i; j < i + windowSize; j++) {
                System.out.print(input[j]);
                System.out.println(" ");
            }
        }
    }
}
