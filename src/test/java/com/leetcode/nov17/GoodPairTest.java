package com.leetcode.nov17;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class GoodPairTest {
    int counter;

    @Test
    public void testcase1() {
        int[] input = {1, 2, 3, 1, 1, 3};
        int output = 4;
        Assert.assertEquals(findGoodPair(input), output);
    }

    private int findGoodPair(int[] input) {
        HashMap<Integer, Integer> mappy = new HashMap<>();
        int i = 0;
        int j = 1;
        while (i < input.length - 1) {
            int currentNumber = input[i];
            int freq = mappy.getOrDefault(currentNumber, 0) + 1;
            mappy.put(currentNumber, freq);
            int num = input[j];
            counter += mappy.getOrDefault(num, 0);
            i++;
            j++;
        }
        return counter;
    }
}
