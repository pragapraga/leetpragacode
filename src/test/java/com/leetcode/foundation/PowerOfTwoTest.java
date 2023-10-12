package com.leetcode.foundation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerOfTwoTest {
    public boolean isPowerOfTwoApproach1(int n) {
    while(n!=1){
        if(n%2!=0){
            return false;
        }
        n = n/2;
    }
    return true;
    }
    public boolean isPowerOfTwoApproach2(int n) {
       int count=0;
        while(n>0){
            if(n%2!=0){
                count++;
            }
            n = n/2;
        }
        return count==1;
    }

    public boolean isPowerOfTwoApproach3(int n) {
        while(n>=2){
            if(n%2!=0) { return false;}
            n=n/2;
        }
        return n==1;
    }

    @Test
    public void testcase1(){
        Assert.assertFalse(isPowerOfTwoApproach1(10));
    }
    @Test
    public void testcase2(){
        Assert.assertTrue(isPowerOfTwoApproach2(4));
    }
    @Test(enabled = false)
    public void testcase3(){
        Assert.assertTrue(isPowerOfTwoApproach3(16));
    }
}
