package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Halloween {
    public static long halloweenParty(long k) {
        return (k/2)*(k-(k/2));
    }

    @Test
    public void testOne(){
        Assert.assertEquals(halloweenParty(5),6);
    }
    @Test
    public void testTwo(){
        Assert.assertEquals(halloweenParty(6),9);
    }
    @Test
    public void testThree(){
        Assert.assertEquals(halloweenParty(7),12);
    }
    @Test
    public void testFour(){
        Assert.assertEquals(halloweenParty(8),16);
    }
}
