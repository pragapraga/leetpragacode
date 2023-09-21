package com.leetcode.sep18;

/*
15:40
@input - int[]
@output - int[]

Testdata1 - nums = [1,9,2,4,5] => [2,4,1,5,9]
Testdata2 - nums = [1,4,9,10] => [4,10,1,9]
Testdata3 - nums = [1] => [1]
Testdata3 - nums = [1,0,0] => [0,0,1]
15:48

Psuedo code
1.
2. Iterate the array, take each element,
2.1 If it is even, move swap the elements
2.2 If it is odd, leave as is
15:50


 */

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SortArrayByParity {
@Test
    public void testOne(){
    int[] input = new int[]{1,9,2,4,5};
    int[] output = new int[]{2, 4, 5, 9, 1};
    Assert.assertEquals(sortItNow(input),output);
}

    private int[] sortItNow(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if(input[i]%2!=0){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j]=temp;
                }
            }
        }

        return input;
    }

}
//15:57
