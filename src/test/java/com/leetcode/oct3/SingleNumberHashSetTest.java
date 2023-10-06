package com.leetcode.oct3;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;

public class SingleNumberHashSetTest {
    private int singleNumber(int[] nums){
        for(int i = 0; i < nums.length; i++) {
            boolean isSingle = true;
            for(int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] == nums[j]) {
                    isSingle = false;
                    break;
                }
            }
            if(isSingle) return nums[i];
        }
        return -1; // Should never reach here as per problem statemen
    }

    private int isSingleHash(int[] nums){
    /*
    1. Declare a new HashSet as set
    2. If set.add() returns false, remove it from set
    3. return the element in the set
     */
    HashSet<Integer> set = new HashSet<>();
        for (int n :nums) {
            if(!set.add(n)){ //[2,2,1]
                set.remove(n);
            }
        }
        return set.iterator().next();
    }

    @Test
    public void testCase1(){
        int[] arr = new int[]{2,2,1};
        Assert.assertEquals(singleNumber(arr),1);
        Assert.assertEquals(isSingleHash(arr),1);
    }
}
