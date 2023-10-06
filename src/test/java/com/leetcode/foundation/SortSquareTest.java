package com.leetcode.foundation;
/*
https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
@input - int[]
@output - int[]

Testdata 1 - [-3,-2,4,10] => [4,9,16,100]
Testdata 2 - [0,-3,9] => [0,9,81]

Psuedo code
1. Iterate the elements, square it
2. Sort using temp variable
*/

import org.testng.annotations.Test;

import java.util.Arrays;

public class SortSquareTest {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        System.out.print(Arrays.toString(nums));
        Arrays.sort(nums);
        return nums;
    }

    @Test
    public void testcase1(){
        int[] input = new int[]{-3,-2,4,10};
        int[]  output = new int[]{4,9,16,100};
    }
    @Test
    public void testcase2(){
        int[] input = new int[]{0,-3,9};
        int[]  output = new int[]{0,9,81};
    }
}
