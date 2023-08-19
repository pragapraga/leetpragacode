package com.leetcode;
/*
Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.

The digit sum of a positive integer is the sum of all its digits.



Example 1:

Input: num = 4
Output: 2
Explanation:
The only integers less than or equal to 4 whose digit sums are even are 2 and 4.
Example 2:

Input: num = 30
Output: 14
Explanation:
The 14 integers less than or equal to 30 whose digit sums are even are
2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.

5:48
@input - int @output - list<int>

Testdata
@input - 4 @output - [2,4]
@input - 30 @output - [2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, 28]

Psuedo code
1. Get the number 'n'
2. Make a for loop which iterates from 1 to n
3. Check whether it is even or not, if yes, add to the list else skip it
4. return the list created
 */


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberEven {
    public List<Integer> isEven(int num) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= num; i++) {
            if (digitSum(i) % 2 == 0) {
                list.add(i);
            }
        }
        System.out.print(list);
        return list;
    }

    public int digitSum(int digit) {
        int reminder, sum = 0;
        if (digit <=9) {
            return digit;
        }
        while (digit != 0) {
            reminder = digit % 10;
            sum += reminder;
            digit = digit / 10;
        }
        return sum;
    }

    @Test
    public void testOne() {
        Assert.assertEquals(isEven(4), Arrays.asList(2, 4));
    }

    @Test
    public void testTwo() {
        Assert.assertEquals(isEven(30), Arrays.asList(2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, 28));
    }
}
