package com.leetcode.sep21;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/*
 https://leetcode.com/problems/find-the-array-concatenation-value/description/

 19:09
@input - int[]
@output - int

Testdata 1 - nums = [7,52,2,4] => 596
Testdata 2 - nums = [5,14,13,8,12] => 673


Brute Force Psuedo code
1.
2. If the elements are odd , we will have middle number else we can add without any element left behind
3. 0th and last element => (1st , n-1) , => ()2nd , n-2) => concat the numbers
4. add the resultant value
19:17
 */
public class ArrayConcat {

    @Test
    public void test() {
        int[] nums = new int[]{5, 14, 13, 8, 12};
        Assert.assertEquals(findTheArrayConcVal(nums), 673);
    }

    @Test
    public void testOne() {
        int[] nums = new int[]{7, 52, 2, 4};
        Assert.assertEquals(findTheArrayConcVal(nums), 596);
    }

    public long findTheArrayConcVal(int[] nums) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length / 2; i++) {
            System.out.println(i + "::" + nums[i] + nums[nums.length - i - 1]);
            String temp1 = String.valueOf(nums[i]);
            String temp2 = String.valueOf(nums[nums.length - i - 1]);
            System.out.println(temp1 + " :: " + temp2);
            int finalNum = Integer.parseInt(temp1 + temp2);
            list.add(finalNum);
        }
        if (nums.length % 2 != 0) {
            list.add(nums[nums.length / 2]);
        }
        for (Integer i : list)
            sum += i;
        return sum;
    }
}


