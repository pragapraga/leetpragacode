package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;

/*
12:46am
@input - int[]
@output - int

Psueduo code
1.
2. Create a new array with same values as heights
3. Sort the original array
4. compare the original array and created new array in step 2
5. Increment the counter

*/

public class HeightChecker {

    public int heightChecker(int[] heights) {
        int[] newHeights = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            newHeights[i]= heights[i];
        }
        Arrays.sort(heights);
        int counter=0;
        for(int j=0;j<heights.length;j++){
            if(heights[j]!=newHeights[j]) counter++;
        }
        return counter;
    }

    @Test
    public void testOne(){
        int[] input = new int[]{1,1,4,2,1,3};
        Assert.assertEquals(heightChecker(input),3);
    }
}
