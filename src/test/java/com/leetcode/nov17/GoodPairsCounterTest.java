package com.leetcode.nov17;

public class GoodPairsCounterTest {

    public static int countGoodPairs(int[] nums) {
        // Assuming the range of numbers is from 1 to 100 (adjust as needed)
        int[] countArray = new int[101]; // index 0 is not used

        // Initialize a variable to count the number of good pairs
        int goodPairsCount = 0;

        // Initialize two pointers, i and j
        int i = 0;
        int j = 1;

        // Iterate through the array
        while (i < nums.length - 1) {
            // Update countArray based on the element at index i
            countArray[nums[i]]++;

            // Check for good pairs using countArray and update goodPairsCount
            goodPairsCount += countArray[nums[j]];

            // Move the pointers
            i++;
            j++;
        }

        // Return the final count of good pairs
        return goodPairsCount;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        int result1 = countGoodPairs(nums1);
        System.out.println("Example 1: " + result1);  // Output: 4

        int[] nums2 = {1, 1, 1, 1};
        int result2 = countGoodPairs(nums2);
        System.out.println("Example 2: " + result2);  // Output: 6

        int[] nums3 = {1, 2, 3};
        int result3 = countGoodPairs(nums3);
        System.out.println("Example 3: " + result3);  // Output: 0
    }
}
