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

import java.util.Arrays;

public class BubbleSortTest {
    int swapCount;
    public int[] sortAnArray(int[] input) {
        for (int i = 0; i < input.length; i++) { //0,1,2,3,4
            System.out.println("-------");
            System.out.println("For the value i = " + i);
            for (int j = i + 1; j <= input.length - 1; j++) { //[0 - 1,2,3,4]  [1 - 2,3,4]  [2 - 3,4]  [3 - 4]
                System.out.println("j =  " + j);
                if (input[i] > input[j]) {
                    swapCount++;
                    System.out.println("Swapping " + input[i] + " and " + input[j]);
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
            System.out.println("****" + Arrays.toString(input));
        }
        return input;
    }

    @Test
    public void testCase1() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] output = new int[]{1, 2, 3, 4, 5};
        Assert.assertEquals(sortAnArray(input), output);
        System.out.println("Swapping Count "+swapCount);
    }

    @Test
    public void testCase2() {
        int[] input = new int[]{1, 4, 2, 4, 0};
        int[] output = new int[]{0, 1, 2, 4, 4};
        Assert.assertEquals(sortAnArray(input), output);
        System.out.println("Swapping Count "+swapCount);
    }

    @Test
    public void testCase3() {
        int[] input = new int[]{10, 9, 2, 4, 0};
        int[] output = new int[]{0, 2, 4, 9, 10};
        Assert.assertEquals(sortAnArray(input), output);
        System.out.println("Swapping Count "+swapCount);
    }
}
