package com.leetcode.nov26;

import org.testng.Assert;
import org.testng.annotations.Test;

/*

@input - int[] , int
@output - int

Psuedo code
1. Have 1st pointer in left and 2nd pointer in left+1, initialize count = 0
1.1 If the sum of left and right = target , increment count
1.2 If the sum of left and right != target, move right, left and check again
1.3 Return the count


1. have 1st and 2nd pointer at 0 and initialize sum and count
2. If sum<target, move right by 1 (right++)
3. If the sum=k , move left++ , counter++
4. If the sum>k, move left++

 */
public class SubArraySumTest {

    @Test
    public void testcase1() {
        int[] input = new int[]{1, 1, 1};
        int target = 2;
        Assert.assertEquals(findCountSubArray(input, target), 2);
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{2, 0, 1, 1};
        int target = 2;
        Assert.assertEquals(findCountSubArray(input, target), 4);
    }

    private int findCountSubArray(int[] input, int target) {
        int count = 0;
        int left = 0;
        int right = 0;
        int sum = input[left];
        while (left < input.length && right < input.length) {
            if (sum < target) {
                right++;
                sum += input[right];
            } else if (sum == target) {
                count++;
                left++;
                right++;
            } else {
                left++;
            }
        }
        return count;
    }


}
