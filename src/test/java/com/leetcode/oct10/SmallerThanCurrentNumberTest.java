package com.leetcode.oct10;

import java.util.Arrays;

/*

@input - int[]
@output - int[]

Testdata 1 -  nums = [6,5,4,8]  => [2,1,0,3]
Testdata 2 -  nums = [7,7,7,7]  => [0,0,0,0]

Brute force Psuedo code
1. Have 2 for loops
1.1 Outter for loop for overall iteration
1.2 Inner for loop to compare each element other than itself
2. Have a resultant int[] to store the values

*/


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
