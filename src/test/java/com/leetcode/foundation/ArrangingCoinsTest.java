package com.leetcode.foundation;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
@input - int
@output - int

test data 1 - 5 => 1, => 2
testa data 10 - 1,2,3,4 => 4

Psuedoe code
1. Have a i value with 1 as default
2. while(n>0)
    2.1 i++ and n = n-i
3. return i-1
*/
public class ArrangingCoinsTest {
    public int arrangeCoins(int n) {
        int i = 1; //minimum 1 step
        while(n>0){
            i++;
            n = n - i;
        }
        return i - 1;
    }

    @Test
    public void testcase1(){
        Assert.assertEquals(arrangeCoins(10),4);
    }

    @Test
    public void testcase2(){
        Assert.assertEquals(arrangeCoins(5),2);
    }
}
