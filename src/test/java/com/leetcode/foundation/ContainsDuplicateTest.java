package com.leetcode.foundation;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class ContainsDuplicateTest {

    @Test
    public void testcase1() {
        int[] nums = new int[]{3, 3};
        Assert.assertTrue(containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {//
             int frequency = hashMap.getOrDefault(nums[i],0)+1;
             hashMap.put(nums[i], frequency);
            /*if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }*/
        }
        System.out.print(hashMap);
        for (int n : hashMap.values()) {
            if (n >= 2) {
                return true;
            }
        }

        return false;
    }
}
