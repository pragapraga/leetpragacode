package com.leetcode.sep12;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BalanceString {
    public int balancedStringSplit(String s) {
        int count = 0; int m = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'R') count++; else count--;
            if(count == 0) m++;

        }
        return m;
    }

    @Test
    public void testOne(){
        Assert.assertEquals(balancedStringSplit("RLRLRL"),3);
    }
    @Test
    public void testTwo(){
        Assert.assertEquals(balancedStringSplit("RLRLRLR"),3);
    }
    @Test
    public void testThree(){
        Assert.assertEquals(balancedStringSplit("LRLRLRLR"),4);
    }
    @Test
    public void testFour(){
        Assert.assertEquals(balancedStringSplit("LLLLRRRR"),1);
    }
}
