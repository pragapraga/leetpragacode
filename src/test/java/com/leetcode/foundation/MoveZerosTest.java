package com.leetcode.foundation;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MoveZerosTest {
    @Test
    public void testcase1(){
        int[] input = new int[]{1,2,0,0,3,4,5,0};
        int[] output = new int[]{1,2,3,4,5,0,0,0};
        Assert.assertEquals(moveZerosToEnd(input),output);
    }
    @Test
    public void testcase2(){
        int[] input = new int[]{0,1,0,3,12};
        int[] output = new int[]{1,3,12,0,0};
        Assert.assertEquals(moveZerosToEnd(input),output);
    }
    //0,1,0,3,12

    private int[] moveZerosToEnd(int[] input) {
        int zeroCount=0;
        int index=0;
        int[] output = new int[input.length];
        for (int n:input) {
            if(n==0){
                zeroCount++;
            }
            else{
                output[index++]=n;
            }
        }
        while(zeroCount>0){
            output[index++]=0;
            zeroCount--;
        }
        System.out.println(Arrays.toString(output));
        return output;
    }
}
