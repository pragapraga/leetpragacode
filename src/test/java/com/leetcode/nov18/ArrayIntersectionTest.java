package com.leetcode.nov18;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/*

@input - int[] , int[]
@output - int[]

Testdata1
        int[] input1 = new int[]{1, 2, 3, 4};
        int[] input2 = new int[]{2, 3, 5};
        int[] output = new int[]{2, 3};


Brute Force Pseudo code
	1. Iterate through both the arrays, having I and J pointer respectively, if the elements matches track it somehow
	2. Return the tracked numbers
 */
public class ArrayIntersectionTest {
    @Test
    public void testcase1() {
        int[] input1 = new int[]{1, 2, 3, 4};
        int[] input2 = new int[]{2, 3, 5, 9, 10, 11};
        int[] output = new int[]{2, 3};
        //Assert.assertEquals(findIteractionUsingTwoPointer(input1, input2), output);
        findIteractionUsingTwoPointer(input1, input2);
    }

    private int[] findIntersection(int[] input1, int[] input2) {
        int[] output = new int[input1.length];
        int index = 0;
        for (int k : input1) {
            for (int i : input2) {
                if (k == i) {
                    output[index++] = k;
                }
            }
        }
        return Arrays.copyOf(output, index);
    }

    /*
    Two Pointers approach
    1. Move Left
    2. Move Right
    3. Breaking Condition - Length of the array since both array size is equal
    4. Equi directional or Bi directional? - Equi directional
     */
    private int[] findIteractionUsingTwoPointer(int[] input1, int[] input2) {
        int[] output = new int[]{};
        int input1Pointer = 0;
        int input2Pointer = 0;
        while (input1Pointer < input1.length && input2Pointer < input2.length) {
            if (input1[input1Pointer] == input2[input2Pointer]) {
                System.out.println(input1[input1Pointer]);
                input1Pointer++;
                input2Pointer++;
            } else if (input1[input1Pointer] < input2[input2Pointer]) {
                input1Pointer++;
            } else {
                input2Pointer++;
            }
        }
        return null;
    }
}

//HashMap
