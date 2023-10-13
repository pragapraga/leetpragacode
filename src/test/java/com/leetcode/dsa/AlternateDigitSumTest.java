package com.leetcode.dsa;
/*
https://leetcode.com/problems/alternating-digit-sum/

@input - int
@output - int

Testdata 1 - 521 => 5-2+1 => 4
Testdata 2 - 111 => 1+1-1 => 1

Psuedo Code
1. Iterate the String and get each number using String technique
2. Declare total , increment when you find even place and decrement when you find odd places

 */


import org.testng.Assert;
import org.testng.annotations.Test;

public class AlternateDigitSumTest {

    public int findDigitSum(int num){
        int total=0;
        String number = ""+num;
        for (int i = 0; i <number.length() ; i++) {
            if(i%2==0){
            total = total+(number.charAt(i)-'0');
            }
            else{
                total = total-(number.charAt(i)-'0');
            }
        }

        return total;
    }

    @Test
    public void testcase1(){
        Assert.assertEquals(findDigitSum(521),4);
    }
    @Test
    public void testcase2(){
        Assert.assertEquals(findDigitSum(111),1);
    }

}
