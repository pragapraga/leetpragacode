package com.leetcode.oct21;

/*

@input - int[]
@output - int[]

testdata1 - [1,2,3,4,5] -> [1,2,3,4,5]
testdata 2 - [1,4,2,4,0] -> [0,1,2,4,4]
testdata 3 - [10,9,2,4,0] -> [0,2,4,9,10]

Psuedo code
1. Have 2 inner for loop, take an element and compare against all elements
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class InsertionSortTest {
    int swapCount;
    public int[] sortAnArray(int[] input) {
        int n = input.length;
        int swapCount = 0; // Initialize the swap count to 0

        for (int i = 1; i < n; i++) {
            int key = input[i];
            int j = i - 1;

            while (j >= 0 && input[j] > key) {
                // Move elements of the sorted section that are greater than the key
                // to one position ahead of their current position
                input[j + 1] = input[j];
                j--;
                swapCount++; // Increment the swap count
            }

            input[j + 1] = key;
        }

        System.out.println("Number of swaps: " + swapCount); // Print the number of swaps
        return input;
    }


    @Test
    public void testCase1() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] output = new int[]{1, 2, 3, 4, 5};
        Assert.assertEquals(sortAnArray(input), output);
    }

    @Test
    public void testCase2() {
        int[] input = new int[]{1, 4, 2, 4, 0};
        int[] output = new int[]{0, 1, 2, 4, 4};
        Assert.assertEquals(sortAnArray(input), output);
    }

    @Test
    public void testCase3() {
        int[] input = new int[]{10, 9, 2, 4, 0};
        int[] output = new int[]{0, 2, 4, 9, 10};
        Assert.assertEquals(sortAnArray(input), output);
    }
}
