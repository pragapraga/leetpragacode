package com.leetcode.dec2;

import org.testng.annotations.Test;

/*
int[] input = 1,7,4,3,1,2,1,5,1
Give me sub array which sums up to target value 7

@input - int[]
@output - int[]

Testdata 1 -
input = 1,7,4,3,1,2,1,5,1 :: target = 7
output = [7] , [4,3] , [1,5,1] , [3,1,2,1] ,

Pointers
1. Length of int[] is 9
2. Single element can match to the target
3. More than




Psuedo Code
1. Two pointers - left and right at the same index
2. Add the element's value with the pointers at their own place to calculate sum, if sum < target, move the right pointer to have more coverage
3. If the sum is > target, assign right = left
4. If the sum == target, assign right = left and move left and right together


 */
public class SumTest {

    @Test
    public void testcase1() {
        int[] input = new int[]{1, 7, 4, 3, 1, 2, 1, 5, 1};
        int target = 7;
        calculateSubArray(input, target);
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{7};
        int target = 7;
        calculateSubArray(input, target);
    }

    private void calculateSubArray(int[] input, int target) {
        int left = 0, right = 0;
        int sum = 0;
        while (left < input.length) {
            if (input[right] == target) {
                System.out.println("left = " + left + "  ::  " + " right = " + right);
                right = left;
                left++;
                right++;
            }
            //1, 7, 4, 3, 1, 2, 1, 5, 1
            sum = input[left] + input[right];
        }
    }
}


/*
Babu's Logic
•Start with first element
•If the sum is less than the desired sum, slide to the next element [Grow]
•Again, sum that and check if it is lesser, equal or greater
•If it is lesser, add the next element to slide [Grow]
•If it is greater, than shrink the last element on the left [Shrink]
•If it is equal, you got it and again do both Grow and Shrink [Slide]
 */

/*
private void findSubarrayWithSum(int[] nums, int target) {
	    int left = 0, right = 0, currentSum = 0;
	    boolean bMatch = false;

	    while (right < nums.length) {
	        currentSum += nums[right];

	        while (currentSum > target && left <= right) {
	            currentSum -= nums[left];
	            left++;
	        }

	        if (currentSum == target) {
	            System.out.println("Subarray found: Start = " + left + ", End = " + right);
	            bMatch = true;
	        }

	        right++;
	    }

	    if (!bMatch) {
	        System.out.println("No subarray found for target: " + target);
	    }
	}
 */