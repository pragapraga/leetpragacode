package com.leetcode.nov17;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
@input - int[]
@output - int[]

Psuedo code
1. Left and Right are at 0th position
2. If the Right < Length -1
2.1 If the left value is 0, swap it with right and increment left
3. Increment Right

 */

public class MoveZerosTest {

    @Test
    public void testcase1() {
        int[] input = new int[]{1, 0, 2, 0, 3, 0, 4, 0};
        int[] output = new int[]{1, 2, 3, 4, 0, 0, 0, 0};
        Assert.assertEquals(swapAndMoveZeros(input), output);
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{1, 0};
        int[] output = new int[]{1, 0};
        Assert.assertEquals(swapAndMoveZeros(input), output);
    }

    /*
    1. whenever you find 0 while traversing, swap it

     */
    public int[] swapAndMoveZeros(int[] input) {
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {

                if (input[j] == 0) {
                    counter++;
                    int temp = input[j];
                    input[j] = input[i];
                    input[i] = temp;
                }
            }
        }
        System.out.println(counter);
        return input;
    }

    private int[] moveItBuddy(int[] input) {
        int counter = 0;
        int left = 0, right = 0;
        while (right < input.length - 1) {

            if (input[right] != 0) {
                counter++;
                int temp = input[right];
                input[right] = input[left];
                input[left] = temp;
                left++;
            }
            right++;
        }
        System.out.println(counter);
        return input;
    }


}
