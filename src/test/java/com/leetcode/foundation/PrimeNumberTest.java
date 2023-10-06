package com.leetcode.foundation;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
10:32
Check if the given number is prime or not

@input - int
@output - boolean

Psuedo code
1. if the n<=1 return false
2. if the n>=2 and n%i==0 return false
3. in all other case return true
 */
public class PrimeNumberTest {

    public boolean isPrime(int n){
        if(n<=1) return false;
        for (int i = 2; i <n ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    @Test
    public void testCase1(){
        Assert.assertFalse(isPrime(0));
    }
    @Test
    public void testCase2(){
        Assert.assertFalse(isPrime(38));
    }
    @Test
    public void testCase3(){
        Assert.assertTrue(isPrime(2));
    }
}
