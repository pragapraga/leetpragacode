package com.leetcode.oct10;

import java.util.Arrays;

public class SmallerThanCurrentNumberTest {
    public static void main(String[] args) {
    SmallerThanCurrentNumberTest sm = new SmallerThanCurrentNumberTest();
    int[] input = new int[]{8,1,2,2,3};
    int[] result;
    result = sm.smallerNumbersThanCurrent(input);
        System.out.println(Arrays.toString(result));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int counter=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[j]<nums[i]){
                        counter++;
                    }
                }
            }
            result[i]=counter;
        }
        return result;
    }
}
