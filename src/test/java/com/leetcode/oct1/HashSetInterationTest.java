package com.leetcode.oct1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;

public class HashSetInterationTest {

    @Test
    public void testcase1(){
        int[] input = new int[]{2,2,1};
        //Assert.assertEquals(singleNumber(input),1);
        Assert.assertEquals(singleNumberLogic(input),1);
    }

    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
                num = nums[i];
            }
        }
        System.out.print(set);

        return num;
    }

    public int singleNumberLogic(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        System.out.print(set);
        return set.iterator().next();
    }

    public int singleNumberContains(int[] nums){
    /*
    1. Iterate the number one by one
    2. If the set.contains that num, remove it
    3. else add it
     */
        HashSet<Integer> hashy = new HashSet<>();
        for (int n: nums) {
            if(hashy.contains(n)){
                hashy.remove(n);
            }
            else{
                hashy.add(n);
            }

        }

        return hashy.iterator().next();
    }
}
