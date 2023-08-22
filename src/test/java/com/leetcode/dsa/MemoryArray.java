package com.leetcode.dsa;

import java.util.Arrays;

public class MemoryArray {
    public static void main(String[] args){
        int[] primaryArray =new int[]{9,5,3,1,0};
        int[] secondaryArray = Arrays.copyOf(primaryArray,primaryArray.length+1);
        secondaryArray[5]=8;
        System.out.println(Arrays.toString(secondaryArray));
        //System.out.println(Arrays.asList())

        //System.out.print(-10.0/0);

    }
}


