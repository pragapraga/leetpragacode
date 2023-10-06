package com.leetcode.foundation;

import org.junit.Assert;
import org.testng.annotations.Test;

/*
"Given an integer array arr, count how many elements x there are,
   such that x + 1 is also in arr.
   If there are duplicates in arr, count them separately."
 */

public class IntArrayPlusOneTest {

    @Test
    public void testCase1() {
        int[] input = new int[]{0, 0, 0, 0, 6, 6, 7};
        Assert.assertEquals(2, findNumberOfElements(input));
    }

    @Test
    public void testCase2() {
        int[] input = new int[]{0, 0, 0, 0, 6, 9, 17};
        Assert.assertEquals(0, findNumberOfElements(input));
    }

    public int findNumberOfElements(int[] input) {
        int count = 0;
        for (int n : input) {
            for (int m: input) {
                if(n+1==m){
                    count++;
                }
            }
        }
        return count;
    }
}
