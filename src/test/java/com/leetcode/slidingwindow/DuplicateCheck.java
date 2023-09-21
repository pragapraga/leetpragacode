package com.leetcode.slidingwindow;
/*
Given an array and a positive number k, check whether the array contains any duplicate elements within the range k. If k is more than the array’s size, the solution should check for duplicates in the complete array.
Example:
Input:

nums[] = { 5, 6, 8, 2, 4, 6, 9 }
k = 4

Output: 6

(element 6 repeats at distance 4 which is <= k)

Testdata 1 - nums[] = { 5, 6, 8, 2, 4, 6, 9 },  k=4       =>      [6]
Testdata 2 - nums[] = { 1,2,3,4,5,6,7,8 } ,  k=10         =>      []
Testdata 3 - nums[] = { 1,2,1,8,1,6,7,8 } ,  k=10         =>      [1,8]

Psuedo code - Brute Force
1. Declare an int[]
2. Take each element, check if there is any duplicate next k elements, if found print the element
2.1 Frame condition such that it will not have ArrayIndexOutofBound Exception


 */

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class DuplicateCheck {
    @Test
    public void testOne(){
        int[] input = new int[]{5, 6, 8, 2, 4, 6, 9 };
        int k=4;
        int[] output = new int[]{6};
        Assert.assertEquals(findDuplicateWithRange(input,k),output);
    }

    @Test
    public void testTwo(){
        int[] input = new int[]{ 1,2,3,4,5,6,7,8  };
        int k=10;
        int[] output = new int[]{};
        Assert.assertEquals(findDuplicateWithRange(input,k),output);
    }

    @Test
    public void testThree(){
        int[] input = new int[]{1,2,1,8,1,6,7,8 };
        int k=10;
        Set<Integer> output = new HashSet<>();
        output.add(1);output.add(8);
        Assert.assertEquals(findDuplicateWithRange(input,k),output);
    }

    private Set<Integer> findDuplicateWithRange(int[] input, int k) {
        Set<Integer> set = new HashSet<>();
        int finalLength = Math.min(input.length,k);
        for (int i = 0; i < input.length; i++) {
            int currentNumber = input[i];
            for (int j = i+1; j < finalLength; j++) {
                int currentComparision = input[j];
                if(currentNumber==currentComparision){
                    set.add(currentNumber);
                }
            }
        }

        return set;
    }
}
