package com.leetcode.foundation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DigitSumTest {
    @Test
    public void testcase1(){
        Assert.assertEquals(checkDigitSum(0),0);
    }
    @Test
    public void testcase2(){
        Assert.assertEquals(checkDigitSum(39),3);
    }
    @Test
    public void testcase3(){
        Assert.assertEquals(addNum(99),9);
    }

    private int checkDigitSum(int i) {
        if(i==0){
            return 0;
        }
        if(i%9==0){
            return 9;
        }
        else{
            return i%9;
        }
    }

    public int addNum(int a) {
        int sum=0;
        while(a>0) {
            sum=sum+a%10;
            a=a/10;
        }
        if(sum>9) {
            return addNum(sum);
        }
        return sum;


    }


}
