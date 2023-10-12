package com.leetcode.foundation;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;


/*
1. Iterate the array, if the current digit is <9, increment it  else assign to 0
2.

 */
public class PlusOneTest {

    public int[] finePlusOneApproach1(int[] input){

        for (int i = input.length-1; i >=0 ; i--) {
            if(input[i]<9){
                input[i]+=1;
                return input;
            }
            input[i]=0;
        }

        int[] output = new int[input.length+1];
        output[0]=1;
        return output;

    }


    @Test
    public void testcase1(){
        int[] input = new int[]{1,2,3};
        int[] output = new int[]{1,2,4};
        Assert.assertEquals(finePlusOneApproach1(input),output);
    }
    @Test
    public void testcase2(){
        int[] input = new int[]{9,9};
        int[] output = new int[]{1,0,0};
        Assert.assertEquals(finePlusOneApproach1(input),output);
    }
/*
    private int[] findPlusOne(int[] input) {
    int number=0;
        for (int n: input) {
            number = number*10+n;
        }
        System.out.println(number);
        number = number+1;
        System.out.println(number);
        return convertNumberToArray(number);
    }

    public int[] convertNumberToArray(int number) {
        String numberS = Integer.toString(number);
        int[] array = new int[numberS.length()];
        int index=0;
        for (char ch:numberS.toCharArray()) {
        array[index++]=Character.getNumericValue(ch);
        }
        System.out.println(Arrays.toString(array));
        return array;

    }
 */

}
