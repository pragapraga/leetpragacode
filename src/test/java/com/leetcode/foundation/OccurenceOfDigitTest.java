package com.leetcode.foundation;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
" Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[].
arr[] = {1, 1, 2, 2, 2, 2, 3}   x = 2
output = 4"
 */
public class OccurenceOfDigitTest {
    @Test
    public void testcase1() {
    int[] input = new int[]{1,2,2,2,4,5};
    int target = 2;
    Assert.assertEquals(findOccurenceOfDigit(input,target),3);
    }
    @Test
    public void testcase3() {
        int[] input = new int[]{1,2,2,2,4,5};
        int target = 9;
        Assert.assertEquals(findOccurenceOfDigit(input,target),0);
    }

    @Test
    public void testcase2() {
    int[] input = new int[]{5,6,6,7,0,9};
    int target = 0;
    Assert.assertEquals(findOccurenceOfDigit(input,target),1);
    }

public int findOccurenceOfDigit(int [] input,int target){

        int count=0;
    for (int n:input) {
        if(n==target){
            count++;
        }
    }
        return count;
}
}
