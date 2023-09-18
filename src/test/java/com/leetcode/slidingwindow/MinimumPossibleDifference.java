package com.leetcode.slidingwindow;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MinimumPossibleDifference {

    @Test
    public void testOne(){
        int[] array = new int[] {9,4,1,7};
        Assert.assertEquals(2,checkMinimumDifference(array,2));
    }

    private int checkMinimumDifference(int[] array, int i) {

        Arrays.sort(array);
        int minDifference = Integer.MAX_VALUE;
        for (int j = 0; j < array.length; j++) {
            for (int k = j+i; k < array.length-i ; k=k+i) {
                int currentDifference = array[j]-array[k];
            if(currentDifference<minDifference){
                minDifference = currentDifference;
            }
            }
        }

        return minDifference;
    }
}
