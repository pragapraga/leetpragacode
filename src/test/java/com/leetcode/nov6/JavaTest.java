package com.leetcode.nov6;

public class JavaTest {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; // 1,2,3  - 1,4,5 - 1,5,6 - 1,6,7 - 1,7,8 - 1,8,9 - 1,9,0
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i; j < i + 3 && j < nums.length - 2; j++) {
                System.out.println(nums[j] + nums[j + 1] + nums[j + 2]);
            }
        }
    }
}
