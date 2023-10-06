package com.leetcode.foundation;

import org.junit.Assert;
import org.testng.annotations.Test;

/*
@input - int
@output - boolean

Psuedo code
1. If n>=3 and n%3!=0 return false
2. else do n=n/3 again
3. return based on n==1
 */
public class PowerOfThreeTest {

    @Test
    public void testcase1(){
        Assert.assertTrue(isPowerOfThree(27));
    }

    @Test
    public void testcase2(){
        Assert.assertFalse(isPowerOfThree(99));
    }

    @Test
    public void testcase3(){
        Assert.assertFalse(isPowerOfThree(2));
    }
    public boolean isPowerOfThree(int n) {
        while(n>=3){
            if(n%3!=0) {
                return false;
            }
            n=n/3;
        }
        return n==1;
    }
}
