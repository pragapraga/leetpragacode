package com.leetcode.sep19;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
16:57
@input - int[]
@input - int

Testdata 1 - arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Testdata 2 - arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5

Psuedo code
1. check for every k values of the array
2. if the average is more than threahold, increase the counter
3. return the counter
16:59

 */
public class SubArrayAverage {

    @Test
    public void testOne() {
        int[] arr = new int[]{2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;
        Assert.assertEquals(checkSubArrayAverage(arr, k, threshold), 3);
    }

    @Test
    public void testTwo() {
        int[] arr = new int[]{11, 13, 17, 23, 29, 31, 7, 5, 2, 3};
        int k = 3;
        int threshold = 5;
        Assert.assertEquals(checkSubArrayAverage(arr, k, threshold), 6);
    }

    private int checkSubArrayAverage(int[] arr, int k, int threshold) {
        int counter = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            int avg = (arr[i] + arr[i + 1] + arr[i + 2]) / k;
            System.out.println(avg);
            if ((avg) >= threshold) {
                counter++;
            }
        }
        return counter;
    }

}
