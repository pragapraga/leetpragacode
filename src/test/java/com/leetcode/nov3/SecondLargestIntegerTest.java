package com.leetcode.nov3;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/*
@input=>@output - [1,2,3,4] => 3
@input=>@output - [1,1,0,9,8] => 8

Psuedo code 1
1.
 */
public class SecondLargestIntegerTest {

    @Test
    public void testcase1() {
        int[] input = new int[]{1, 2, 3, 4};
        Assert.assertEquals(findSecondLargestNumber(input), 3);
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{1, 1, 0, 8, 9};
        Assert.assertEquals(findSecondLargestNumber(input), 8);
    }

    @Test
    public void testcase3() {
        int[] input = new int[]{9, 19, 0, 8, 9};
        Assert.assertEquals(findSecondLargestNumber(input), 9);
    }

    @Test
    public void testcase4() {
        int[] input = new int[]{0, 100, 9, 19, 97, 0, 8, 9};
        Assert.assertEquals(findSecondLargestNumber(input), 97);
    }
    @Test
    public void testcase5() {
        int[] input = new int[]{4,2,3,4,4,5,6,9,2,1};
        Assert.assertEquals(findSecondLargestNumber(input), 6);
    }
    private int findSecondLargestNumber(int[] input) {
        int max = input[0];
        int sMax = -1;
        for (int i = 1; i < input.length; i++) {
            if (input[i] > max) {
                sMax = max;
                max = input[i];
            }
            if (input[i] > sMax && input[i] < max) {
                sMax = input[i];
            }
        }
        return sMax;
    }
}
