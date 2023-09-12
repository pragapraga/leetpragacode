package com.leetcode;

/*
11:40
//https://www.hackerrank.com/challenges/minimum-distances/problem
@input - int[]
@output - int

Testdata - a [3,2,1,2,3] => 2

Psuedo code
1. Iterate the array
2. Again iterate the array with all elements
3. if the i value is equals, call one another method to fix the min
4. Return the min

O[N^2]

 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class miniumDistance {

    private int findMinimumDistance(int[] input) {
    int minDistance=Integer.MAX_VALUE;
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length ; j++) {
                if(input[i]==input[j]&&(j-i)<minDistance){
                    minDistance = j -i;
                }
            }
        }
        return minDistance;
    }



    @Test
    public void testMe(){
        int[] input = new int[]{3,2,1,2,3};
        Assert.assertEquals(findMinimumDistance(input),2);
    }


}
