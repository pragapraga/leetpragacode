package com.leetcode.foundation;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.HashSet;

/*
@input - int[]
@output - boolean

Testdata 1 - [11,22,11,33,33,33] => true
Testdata 2 - [11,12] => false


psuedo code
1. Initialize Hashmap
2. Iterate and store it in hashmap
3. Check any two frequencies are same, if same, return false, else true
*/

public class UniqueOccurenceTest {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int j : arr) {
            int frequency = hashMap.getOrDefault(j, 0) + 1;
            hashMap.put(j, frequency);
        }
        System.out.println(hashMap);
        HashSet<Integer> set = new HashSet<>();
        for(int n : hashMap.values()){
            //System.out.println(n);
            if(!set.add(n)){
                System.out.println(n);
                return false;
            }
            System.out.println(set);
        }
        return true;
    }

    @Test
    public void testCase1(){
    int[] input = new int[]{-3,0,1,-3,1,1,1,-3,10,0};
        Assert.assertTrue(uniqueOccurrences(input));
    }
    @Test
    public void testCase2(){
        int[] input = new int[]{-3,0};
        Assert.assertFalse(uniqueOccurrences(input));
    }
}
