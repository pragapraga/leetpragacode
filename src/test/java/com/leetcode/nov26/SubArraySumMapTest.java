package com.leetcode.nov26;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SubArraySumMapTest {


    @Test
    public void test1() {
        int[] nums = {1,2,3};
        int k = 3;
        subArraySum(nums,k);
    }

    @Test
    public void test2() {
        int[] nums = {2,0,1,1};
        int k = 2;
        subArraySum(nums,k);
    }

    @Test
    public void test3() {
        int[] nums = {3,-2,5,-1,-1};
        int k = 3;
        subArraySum(nums,k);
    }

	/*
	   a. Initialize sum and result to 0.
	   b. Create a HashMap to store cumulative sums and their frequencies.
	   c. Add an entry in the map for sum 0 with a frequency of 1 (base case).
	   d. Loop through each element in the array:
	      i. Add the current element to the cumulative sum.
	      ii. Check if (cumulative sum - k) exists in the map.
	         - If it does, add the frequency of (cumulative sum - k) to result.
	      iii. Update the map with the new cumulative sum, incrementing its frequency.
	   e. Print the map and the result.
	 */

    private void subArraySum(int[] nums, int k) {
        int sum = 0, result = 0, key = sum - k;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; key = sum - k;
            if (map.containsKey(key)) {
                result += map.get(key);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(result);
    }

}

