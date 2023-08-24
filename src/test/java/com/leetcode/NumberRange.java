package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberRange {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i+1 < nums.length && nums[i] + 1 == nums[i + 1])
                i++;

            if (start == nums[i]) {
                result.add("" + start);
            } else {
                result.add(start + "->" + nums[i]);
            }
        }
        return result;
    }

    @Test
    public void testme() {
        int[] input = new int[]{0, 1, 2, 4, 5, 7};
        Assert.assertEquals(summaryRanges(input), Arrays.asList("0->2", "4->5", "7"));
    }

    @Test
    public void testTwo() {
        int[] input = new int[]{0, 2, 3, 4, 6, 8, 9};
        Assert.assertEquals(summaryRanges(input), Arrays.asList("0", "2->4", "6", "8->9"));
    }
}
