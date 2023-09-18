package com.leetcode.slidingwindow;

import org.junit.Assert;
import org.testng.annotations.Test;

/*
@input - int[] , int
@output - int[]

Testdata
        int[] input = new int[]{1,5,2,3,7,1}; ,k=3
        int[] result = new int[]{2,3,7};

Question
1. k=0?

Psuedo code
1. int maxSum=Integer.MIN_VALUE; int[] result
2. Iterate through the array with k increment
3. add individual number to have sum
4. if the sum is greater than current sum, assign sum and update result int array
 */

public class HighestSumConsecutiveNumbers {

    @Test
    public void one() {
        int[] input = new int[]{1, 5, 2, 3, 7, 1}; //012 123 234 345
        //int[] result = new int[]{2,3,7};
        Assert.assertEquals(12, slidingWindow(input, 3));
    }

    private int slidingWindow(int[] nums, int k)
    {
        //1. one pointer should work
        int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
        // not needed second pointer as this is balanced traversal ,right = k-1;
        //2. Do the required operation till k index
        while(pointer < k)
            currentSum += nums[pointer++];
        //3. continue the operation for rest of the array
        while( pointer < nums.length)
        {
            max = Math.max(currentSum, max);
            currentSum += nums[pointer] - nums[pointer-k];
            pointer++;
        }
        return Math.max(currentSum, max);
    }

    public int processIt(int[] input, int target) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < input.length - target; i++) {
            int currentSum = input[i];
            for (int j = i + 1; j < i + target; j++) {
                currentSum += input[j];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

       /* for (int i = 0; i < input.length; i++) {
           while(target!=0){
               int currentSum = input[i]+input[i+1]+input[i+2];
               if(currentSum>maxSum){
                   maxSum= currentSum;
               }
               target--;
           }
        }*/


        /*
        currentSum += nums[pointer];
currentSum-= nums[pointer++-k];
to ease out the understanding of the sliding window pointer movement use the above code instead of
currentSum += nums[pointer] - nums[pointer++-k];
         */
        return maxSum;
    }
}
