package com.leetcode;
//https://leetcode.com/problems/sum-of-squares-of-special-elements/

import org.testng.Assert;
import org.testng.annotations.Test;

/*
@input - int[]
@output - int

Test data 1 - [2,7,1,19,18,3] => 63
Test data 2 - [1,2,3,4] => 21


Pseudo code
1. Get the integer array
2. for loop starts with 1 and check the divisibility of the lengthof the array and i value
3. if Step 2 is divisible, double the value of the current element and add to the totalSum
 */
public class SumOfSquare {

    public int sumOfSquares(int[] nums) {
        int totalSum=0;
        int numsLength=nums.length;
        for(int i=1;i<=numsLength;i++){
            if(numsLength%i==0){
                totalSum+=nums[i-1]*nums[i-1];
            }
        }
        return totalSum;
    }

    @Test
    public void testOne(){
        int[] input = new int[]{2,7,1,19,18,3};
        Assert.assertEquals(sumOfSquares(input),63);
    }

    @Test
    public void testTwo(){
        int[] input = new int[]{1,2,3,4};
        Assert.assertEquals(sumOfSquares(input),21);
    }

}
