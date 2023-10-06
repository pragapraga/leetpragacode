package com.leetcode.foundation;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class PlusOneTest {
    @Test
    public void testcase1(){
        int[] input = new int[]{1,2,3};
        int[] output = new int[]{1,2,4};
        Assert.assertEquals(findPlusOne(input),output);
    }

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

}
