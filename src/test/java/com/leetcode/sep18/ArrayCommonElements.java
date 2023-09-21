package com.leetcode.sep18;
/*
https://www.codechef.com/INTPREP_01/problems/PREP17?tab=statement
07:02
@input - int[]
@output - int

07:05
Testdata 1 - [1,2,3] [3,4,5] => 1
Testdata 2 - [2] [5] => 0
Testdata 3 - [1,2,3] [3,2,1] => 3
Testdata 4 - [] [] => 0

07:08
Brute Force Psuedo code
1. int commonCounter=0,
2. If the one/both of the array is empty, return 0
3. Read 1st array in outter for loop and in the inner for loop iterate 2nd array, increment commonCounter if common element found
4. return commonCounter

Time complexity - O[N^2]
Space Complexity - O[]
//07:09

07:24
Two Pointer Psuedo code
1. int commonCounter=0,
2. Sort the array1 and array2
3. Place 1st pointer in startIndex of array1 and 2nd pointer in startIndex of array2
4. Compare both of them, if is common , increment commonCounter
Time complexity - Nlog(N)
Space Complexity - O(1)
07:28

07:56
compareArrayAndCommonElementUsingHashset
1. int commonCounter=0;
2. Have pointer in array1 and array2
3. Add element to Hashset if the add() returns false, increment commonCounter
Time complexity - O(N)
Space Complexity - O(N)
 */

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayCommonElements {

    @Test
    public void testOne() {
        int[] input1 = new int[]{1, 2, 3};
        int[] input2 = new int[]{3, 4, 5};
        Assert.assertEquals(compareArrayAndCommonElement(input1, input2), 1);
    }

    @Test
    public void testTwo() {
        int[] input1 = new int[]{2};
        int[] input2 = new int[]{5};
        Assert.assertEquals(compareArrayAndCommonElement(input1, input2), 0);
    }

    @Test
    public void testThree() {
        byte[] input1 = new byte[]{1, 2, 3, 4, 5, 6, 9};
        byte[] input2 = new byte[]{3, 1, 2, 4};
        Assert.assertEquals(compareArrayAndCommonElementUsingHashset(input1, input2), 4);
    }

    @Test
    public void testFour() {
        byte[] input1 = new byte[]{-2};
        byte[] input2 = new byte[]{-3};
        Assert.assertEquals(compareArrayAndCommonElementUsingHashset(input1, input2), 0);
    }

    private int compareArrayAndCommonElement(int[] input1, int[] input2) {
        //07:09
        int commonCounter = 0;

        if (input1.length == 0 || input2.length == 0) {
            return commonCounter;
        }

        for (int k : input1) {
            for (int i : input2) {
                if (k == i) {
                    commonCounter++;
                }
            }

        }

        return commonCounter;
        //07:19
    }


    private int compareArrayAndCommonElementUsingTwoPointer(int[] input1, int[] input2) {
        //07:29
        int commonCounter = 0;
        Arrays.sort(input1);
        Arrays.sort(input2);
        int firstPointer = 0, secondPointer = 0;
        while (firstPointer < input1.length && secondPointer < input2.length) {
            if (input1[firstPointer] == input2[secondPointer]) {
                commonCounter++;
            }
            ++firstPointer;
            ++secondPointer;
        }

        return commonCounter;
        //07:54
    }

    private int compareArrayAndCommonElementUsingHashset(byte[] input1, byte[] input2) {
        //07:54
        int commonCounter = 0;
        int firstPointer = 0, secondPointer = 0;
        HashSet<Byte> hashSet = new HashSet<>();

        while (firstPointer < input1.length && secondPointer < input2.length) {

            if (!hashSet.add(input1[firstPointer++])) commonCounter++;
            if (!hashSet.add(input2[secondPointer++])) commonCounter++;

        }
        return commonCounter;
    }
}
