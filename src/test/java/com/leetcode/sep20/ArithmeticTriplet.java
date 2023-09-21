package com.leetcode.sep20;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
17:25
https://leetcode.com/problems/number-of-arithmetic-triplets/description/

@input - int[] , int
@output - int

Testdata 1 - nums = [0,1,4,6,7,10], diff = 3 => 2
Testdata 2 - [4,5,6,7,8,9], diff = 2 => 2

Psuedo code
1.
2. Iterate through the array and take 3 digits - i,j,k
2.1 i < j < k
2.2 nums[j] - nums[i] == diff
2.3 nums[k] - nums[j] == diff
3. increment the counter and return it
 */
public class ArithmeticTriplet {
    @Test
    public void testOne() {
        int[] nums = new int[]{0, 1, 4, 6, 7, 10};
        int diff = 3;
        Assert.assertEquals(checkArithmeticTriplet(nums, diff), 2);
    }

    @Test
    public void testTwo() {
        int[] nums = new int[]{4, 5, 6, 7, 8, 9};
        int diff = 2;
        Assert.assertEquals(checkArithmeticTriplet(nums, diff), 2);
    }

    private int checkArithmeticTriplet(int[] nums, int diff) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <nums.length ; j++) {
                for (int k = 0; k <nums.length ; k++) {
                    int ijdiff = nums[j] - nums[i];
                    int jkdiff = nums[k] - nums[j];
                    if((i<j)&&(j<k)&&(ijdiff==diff)&&(jkdiff==diff)){
                        counter++;
                    }
                }
            }
        }

        return counter;
    }
}
//17:35