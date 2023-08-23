package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/*

@input - int
@output - int

Psuedo Code
1. we can solve this problem using simple formula n*(n-1)/2
 */
public class HandShake {
    public int Solution(int folks) {
       return folks*(folks-1)/2;
    }

    @Test
    public void testOne(){
        Assert.assertEquals(Solution(1),0);
    }
    @Test
    public void testTwo() {
        Assert.assertEquals(Solution(4), 6);
    }
}
