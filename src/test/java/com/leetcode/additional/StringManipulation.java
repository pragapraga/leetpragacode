package com.leetcode.additional;

import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args){
        String abc = new String("Hello");
        String current = "Praga";
        current.length();

        String number = "praga";
        //System.out.println(number.charAt(0)-'a');
        String num= "030";
        int n = num.length();
        int[] digitCount = new int[n];
        for (int i = 0; i < n; i++) {
            int digit = num.charAt(i) - '0'; // Convert the character to an integer
            digitCount[i]=digit; // Increment the count of the digit at its corresponding index
        }

        System.out.println(Arrays.toString(digitCount));


    }
}
