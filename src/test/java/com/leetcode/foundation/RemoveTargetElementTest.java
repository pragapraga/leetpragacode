package com.leetcode.foundation;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 Remove the target element in the array

 @input - int[] , int
 @Output - int[]

 Testdata 1 - [1,2,5,9,0] and 5 => [1,2,9,0]
 Testdata 2 - [1,2,3] and 0 => [1,2,3]

 Psuedo code
 1. Get the value of k and int[]
 2. Create a new array with length-1
 3. add teh elements except the target and return the int[]
 */

public class RemoveTargetElementTest {

    @Test
    public void testcase1(){
    int[] input = new int[]{1,2,5,9,0};
    int[] output = new int[]{1,2,9,0};
    int k = 5;
        Assert.assertEquals(removeTargetElement(input,k),output);
    }

    @Test
    public void testcase2(){
    int[] input = new int[]{1,2,3};
        int[] output = new int[]{1,2,3};
        int k=5;
        Assert.assertEquals(removeTargetElement(input,k),output);
    }
    @Test
    public void testcase3(){
        int[] input = new int[]{5};
        int[] output = new int[]{};
        int k=5;
        Assert.assertEquals(removeTargetElement(input,k),output);
    }
    @Test
    public void testcase4(){
        int[] input = new int[]{2,3,3,4,5};
        int[] output = new int[]{2,4,5};
        int k=3;
        Assert.assertEquals(removeTargetElement(input,k),output);
    }

    public int[] removeTargetElement(int[] input, int k){
        int count=0;
        for (int n:input) {
            if(n!=k){
                count++;
            }
        }
        int[] finalArray = new int[count];
        int index=0;
        for (int n : input) {
            if(n!=k){
                finalArray[index++]=n;
            }
        }
        return finalArray;
    }

}
