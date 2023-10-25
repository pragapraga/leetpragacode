package com.leetcode.oct21;

/*
@input - int[] , int
@output - int[]

Psuedo code of Binary Search
1. Find the middle index of the given array
2. If the target < valueOf [middleIndex] , target  may be on left half
2.1 Reassign middle to right and repeat the process by finding the middleIndex again till you find the target
3.  If the target > valueOf [middleIndex] , target  may be on right half
3.1 Reassign middle to left and repeat the process by finding the middleIndex again till you find the target

testdata1 -   [1,2,3,4,5] , 5 => 4
testdata 2 -  [0,1,2,4,4] , 90=> -1
testdata 3 - [0,2,4,9,10] , 2=> 1
 */

public class BinarySearchTest {

}
