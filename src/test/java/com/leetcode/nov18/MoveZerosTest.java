package com.leetcode.nov18;
/*

@input- int[]
@output - int[]


Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0]

Bruteforce  Psudeo code
1. Initialize the new output array with array
2. If the value of the array is not 0 , assign to newly created input
3. return output


 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveZerosTest {

    @Test
    public void testcase1() {
        int[] input = new int[]{0, 1, 0, 3, 12};
        int[] output = new int[]{1, 3, 12, 0, 0};
        //Assert.assertEquals(moveZeros(input), output);
        Assert.assertEquals(moveZerosTwoPointer(input), output);
    }

    private int[] moveZeros(int[] input) {
        int[] output = new int[input.length];
        int index = 0;
        for (int n : input) {
            if (n != 0) {
                output[index++] = n;
            }
        }
        return output;
    }


    /*
    Psuedo code
    0. start left  and right = 0
    1. If the right is less than array length traverse it
    2. Move left and right if right have non zero value
    3. Move right in every iteration
    4. Swap should happen only when right is in non zero value and left is 0
    5. If

 */
    private int[] moveZerosTwoPointer(int[] input) {
        int left = 0, right = 0;
        while (right < input.length) {
            if (input[right] != 0) {
                int temp = input[left];
                input[left] = input[right];
                input[right] = temp;
                left++;
                right++;
            } else {
                right++;
            }
        }
        return input;
    }
}


