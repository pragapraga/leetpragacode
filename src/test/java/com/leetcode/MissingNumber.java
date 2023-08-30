package com.leetcode;

import org.junit.Test;

public class MissingNumber {

    public void missingNumber(int[] nums) { //{1,3,4,8,2,7,6}
        int n = nums.length;
        int totalsum = ((n)*(n+1))/2;
        System.out.println(totalsum);
        int sum=0;
        for (int j = 0; j < n; j++) {
            sum=sum+nums[j];
        }
        System.out.println(sum-totalsum);
    }

    @Test
    public void test() {
        missingNumber(new int[] {1,3,4,8,2,7,6});
    }
}
