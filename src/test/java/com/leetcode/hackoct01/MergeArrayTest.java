package com.leetcode.hackoct01;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
@input - int[] int[]
@output - int[]

Psuedo code
0. Have int i=0,j=0,k=0
1. Iterate the input1[] and input2[] based on size
2. if input1[i]<input2[i] insert input1[i] to output[i]
3.  else insert input2[i] to output[i]

 */

public class MergeArrayTest {
    @Test
    public void testcase1(){
        int[] input1= new int[]{1,2,3};
        List<Integer> inputl1 = Arrays.asList(1,2,3);
        int[] input2= new int[]{4,5,6};
        List<Integer> inputl2 = Arrays.asList(4,5,6);
        int[] output = new int[]{1,2,3,4,5,6};
        List<Integer> outputl = Arrays.asList(1,2,3,4,5,6);
        //Assert.assertEquals(mergeBothArray(input1,input2),output);
        Assert.assertEquals(mergeBothList(inputl1,inputl2),outputl);
    }

    private List<Integer> mergeBothList(List<Integer> inputl1, List<Integer> inputl2) {
        List<Integer> merged = new ArrayList<>();
        int i=0,j=0,k=0;
        while (i<inputl1.size()||j<inputl2.size()) {
            if(inputl1.get(i)<inputl2.get(i)){
                merged.add(inputl1.get(i));
                i++;
            }
            else{
                merged.add(inputl2.get(j));
                j++;
            }
            System.out.println(merged);
            while (i < inputl1.size()) {
                merged.add(inputl1.get(i));
                i++;
            }
            while (j < inputl2.size()) {
                merged.add(inputl2.get(j));
                j++;
            }
        }
        return merged;
    }

    @Test
    public void testcase2(){
        int[] input1= new int[]{1,2,3,8};
        int[] input2= new int[]{0,4,5,6,9};
        int[] output = new int[]{1,2,3,4,5,6};

        List<Integer> inputl1 = Arrays.asList(1,2,3,8);
        List<Integer> inputl2 = Arrays.asList(0,4,5,6,9);
        List<Integer> outputl = Arrays.asList(0,1,2,3,4,5,6,8,9);

        Assert.assertEquals(mergeBothList(inputl1,inputl2),outputl);
    }

    private int[] mergeBothArray(int[] input1, int[] input2) {

        return null;
    }
}
