package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;

public class FindMissingNumber {
    public int[] findMissingDuplicate(int[] nums) {
        int duplicate = -1;
        int missing = -1;
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i :nums){
            if(set.contains(i)){
                duplicate=i;
            }
            set.add(i);
        }

        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                missing=i;
                break;
            }
        }
        return new int[]{duplicate, missing};
    }
    @Test
    public void testOne(){
    int[] input = new int[] {1,2,2,4};
    int[] output = new int[] {2,3};
        Assert.assertEquals(findMissingDuplicate(input),output);
    }

    @Test
    public void testTwo(){
        int[] input = new int[] {1,1};
        int[] output  = new int[] {1,2};
        Assert.assertEquals(findMissingDuplicate(input),output);
    }


}
