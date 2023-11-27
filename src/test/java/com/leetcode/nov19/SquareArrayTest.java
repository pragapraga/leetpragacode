package com.leetcode.nov19;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/*

@input - int[]
@output - int[]

Testdata - [8,-1] => [1,64]


Psuedo code
1. Traverse through the int array
2. Square it by multiplying by itself and save it in new array
3. return new array
 */


/*
Two pointer PC
1. Square each element using Math.abs value across all elements to handle +/- values
2. Have left and right pointer at index 0 and 1
3. Check if the value[left] is greater than value[right] swap it
4. return the array
 */
public class SquareArrayTest {
    @Test
    public void testcase1() {
        int[] input = new int[]{8, -1};
        int[] output = new int[]{1, 64};
        Assert.assertEquals(squareItTwoPtr(input), output);
    }

    private int[] squareIt(int[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i] * input[i];
        }
        Arrays.sort(input);
        return input;
    }


    private int[] squareItUsingTwoPointer(int[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] = Math.abs(input[i]) * Math.abs(input[i]);
        }
        int left = 0;
        int right = 1;
        while (left < input.length - 1) {
            if (input[left] > input[right]) {
                int temp = input[left];
                input[left] = input[right];
                input[right] = temp;
                left++;
                right++;
            } else {
                right++;
            }
        }
        return input;
    }


    private int[] squareItTwoPtr(int[] input) {
        int[] result = new int[input.length];
        int left = 0;
        int right = input.length - 1;
        for (int i = input.length - 1; i >= 0; i--) {
            if (Math.abs(input[right]) > Math.abs(input[left])) {
                result[i] = Math.abs(input[right]) * Math.abs(input[right]);
                right--;
            } else {
                result[i] = Math.abs(input[left]) * Math.abs(input[left]);
//                int temp = input[right];
//                input[right]= input[left];
//                input[left]= temp;
                left++;
            }
        }

//        while(left<=right){
//            if(Math.abs(input[right])>Math.abs(input[left])){
//                input[right]= Math.abs(input[right])*Math.abs(input[right]);
//                right--;
//            }
//            else{
//                input[left]= Math.abs(input[left])*Math.abs(input[left]);
//                int temp = input[right];
//                input[right]= input[left];
//                input[left]= temp;
//                left++;
//            }
//        }
        return result;
    }

}

