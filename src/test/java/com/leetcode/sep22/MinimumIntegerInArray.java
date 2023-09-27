package com.leetcode.sep22;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
@input - int[]
@output - int

Testdata 1 - [1,32,4,0] => 0
Testdata 2 - [-2,4,0,8] => -2

Psuedo code
1. Initialize the min to Integer.MAX_VALUE
2. Iterate through the array, if the currentNumber < MAX_VALUE, reassign
3.  Repeat step 2 till end of the array

 */
public class MinimumIntegerInArray {

    @Test
    public void testOne(){
        int[] input = new int[]{1,32,4,0};
        Assert.assertEquals(findMinIntegerInArray(input),0);
    }
    @Test
    public void testTwo(){
        int[] input = new int[]{-2,4,0,8};
        Assert.assertEquals(findMinIntegerInArray(input),-2);
    }
    public int findMinIntegerInArray(int[] intarr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <intarr.length ; i++) {
            if(intarr[i]<min){
                min = intarr[i];
            }
        }
        return min;
    }
}
