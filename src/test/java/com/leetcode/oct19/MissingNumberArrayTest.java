package com.leetcode.oct19;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

/*

 */
public class MissingNumberArrayTest {
    List<Integer> result = new ArrayList<>();

    @Test
    public void testcase1() {
        int[] input = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> output = Arrays.asList(5, 6);
        Assert.assertEquals(findMissingNumberUsingHashMap(input), output);
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{1, 1};
        List<Integer> output = Arrays.asList(2);
        Assert.assertEquals(findMissingNumberUsingHashMap(input), output);
    }

    private List<Integer> findMissingNumberUsingHashMap(int[] input) {


        /*
        1. Decalare a hashmap and assign the value with 0
        2. Iterate through the input array and if the !map.contains(i+1) add(i+1
        3.
         */
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : input) {
            map.put(n, 0);
        }
        for (int i = 0; i < input.length; i++) {
            if (!map.containsKey(i + 1)) {
                result.add(i + 1);
            }
        }
        return result;
    }

    private List<Integer> findMissingNumber(int[] input) {
        Set<Integer> inputSet = new TreeSet<>();

        for (int n : input) {
            inputSet.add(n);
        }

        for (int i = 0; i < input.length; i++) {
            if (!inputSet.contains(i + 1)) {
                result.add(i + 1);
            }
        }
        return result;
    }

    private List<Integer> findMissingNumberWithExtraNoSpace(int[] nums) {
        for (int i : nums) {
            int index = Math.abs(i);
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }
        }
        //List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
