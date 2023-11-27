package com.leetcode.nov17;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TwoSumTest {

    @Test
    public void testcase1() {
        int[] input = new int[]{1, 2, 3, 5, 7};
        int target = 9;
        int[] output = new int[]{1, 4};
        Assert.assertEquals(findToSumUsingPerfectTwoPointers(input, target), output);
    }

    private int[] findToSumIndices(int[] input, int target) {
        int[] output = new int[2];
        System.out.println(Arrays.toString(output));
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == target) {
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        return output;
    }


    public int[] findToSumUsingTwoPointers(int[] input, int target) {
        int[] output = new int[2];
        int left = 0;
        int right = input.length - 1;
        if (input[left] + input[right] > target) {
            left++;
        } else if (input[left] + input[right] < target) {
            right++;
        } else if (input[left] + input[right] == target) {
            output[0] = left;
            output[1] = right;
            return output;
        }
        return output;
    }

    public int[] findToSumUsingPerfectTwoPointers(int[] input, int target) {
        int[] output = new int[2];
        int left = 0;
        int right = input.length - 1;

        while (left < right) {
            int sum = input[left] + input[right];
            if (sum == target) {
                output[0] = left;
                output[1] = right;
                return output;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }

        }
        return output;
    }
}
