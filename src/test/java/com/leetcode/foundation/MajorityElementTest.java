package com.leetcode.foundation;

/*

11:25am
https://leetcode.com/problems/majority-element/
@input - int[]
@output - int

Testdata 1 - [3,2,3] => 3
Testdata 2 - [1,2,3,4,5,3,3,3]

Psuedo code
1. Declare HashMap and get the frequency
2. Calculate n/2, return the element from the HashMap where frequency >n/2

*/

import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.HashMap;
import java.util.Map;

class MajorityElementTest {
    public int majorityElement(int[] numbers) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int num : numbers) {
            int frequency = hashMap.getOrDefault(num, 0) + 1;
            hashMap.put(num, frequency);
        }

        for(Map.Entry<Integer,Integer> map: hashMap.entrySet()){
            if(map.getValue()>numbers.length/2){
                return map.getKey();
            }
        }
        return -1;
    }

    @Test
    public void testCase1(){
        int[] input = new int[]{3,2,3};
        Assert.assertEquals(majorityElement(input),3);
    }
    @Test
    public void testCase2(){
        int[] input = new int[]{1,2,3,4,5,3,3,3};
        Assert.assertEquals(majorityElement(input),3);
    }
}
//11:32
