package com.leetcode.nov20;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
Input: arr = [1,2,2,1,1,3]
Output: true

1->3
2 ->2
3->1

@input - int[]
@output - boolean

Testdata 1 - [1,2,2,1,1,3] => true
Testdata 2 - [1,2,2,1,1,3,3] => false since frequency of 3 and 2 are same

Psuedo code
1. Calculate the occurrence using hashmap and validate if the occurrence has same value, if so return false else true
 */
public class FrequencyUniqueTest {

    @Test
    public void testcase1() {
        int[] input = new int[]{1, 2, 2, 1, 1, 3};
        Assert.assertTrue(calculateOccurrence(input));
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{1, 2, 2, 1, 1, 3, 3};
        Assert.assertFalse(calculateOccurrence(input));
    }

    private boolean calculateOccurrence(int[] input) {
        HashMap<Integer, Integer> mappy = new HashMap<>();

        for (int n : input) {
            int freq = mappy.getOrDefault(n, 0) + 1;
            mappy.put(n, freq);
        }
        
        Set<Integer> set = new HashSet<>();
        for (int n : mappy.values()) {
            if (!set.add(n)) {
                return false;
            }
        }
        return true;
    }
}
