package com.leetcode.sep30hashing;

import org.testng.annotations.Test;

/*
@input - int[] , int
@output - int[]

Testdata 1- [0,1,2,3] k=5  => [2,3]

Psuedocode
1. Initialize the hashmap
2. Loop from 0 to end of array -1
3. Check with target current value is in the map
3.1 If yes, return map.get(target-currentValue),currentIndex
3.2 If No, add the value and its index in key , value in map
 */
public class TwoSumUsingHashingTest {
    @Test
    public void testMe(){
        int[] input = new int[]{0,1,2,3};
        int target = 5;
        int[] output = new int[]{2,3};
    }

}
