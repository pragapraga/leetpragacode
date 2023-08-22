package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
Reversing an integer means to reverse all its digits.

For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.
Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2. Return true if reversed2 equals num. Otherwise return false.

@input - int
@output - boolean

TestData 1 - 121  - true
TestData 2 - 123  - false

Psuedo Code -
1. Get a number and reverse using % and / concept
2. if the reveresed number and number is equal , return true else false


 */
public class ReverseNumber {

    public int reverseNumber(int num) {
        boolean flag = false;
        int actualNum = num;
        int reversedNum = 0;
        while (num > 0) {
            int reminder = num % 10;
            reversedNum = reversedNum * 10 + reminder;
            num = num / 10;
        }
        System.out.println(num);
        System.out.println(reversedNum);
        if (actualNum == reversedNum) {
            flag = true;
            return reversedNum;

        }
        return reversedNum;
    }

    public boolean finalCheck(int one, int two) {
        if (one == two) {
            return true;
        } else {
            return false;
        }
    }


    @Test
    public void testOne() {
        int inputNumber = 2021;
        int fReverision = reverseNumber(inputNumber);
        int sReversion = reverseNumber(fReverision);
        Assert.assertTrue(finalCheck(inputNumber, sReversion));
    }

    @Test
    public void testTwo() {
        int inputNumber = 12300;
        int fReverision = reverseNumber(inputNumber);
        int sReversion = reverseNumber(fReverision);
        Assert.assertFalse(finalCheck(inputNumber, sReversion));
    }
}
