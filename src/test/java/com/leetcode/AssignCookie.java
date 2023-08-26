package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class AssignCookie {
    public int findContentChildren(int[] greedFactor, int[] cookies) {
        Arrays.sort(greedFactor);
        Arrays.sort(cookies);
        int currentChildGreediness = 0;
        //int contentChildren=0;
        for (int currentCookie = 0; currentChildGreediness < greedFactor.length && currentCookie < cookies.length; currentCookie++) {
            if (greedFactor[currentChildGreediness] <= cookies[currentCookie]) {
                currentChildGreediness++;
            }
        }
        return currentChildGreediness;
    }

    @Test
    public void testOne() {
        int[] greedy = new int[]{1, 2, 3};
        int[] cookies = new int[]{1, 1};
        Assert.assertEquals(findContentChildren(greedy,cookies),1);
    }
    @Test
    public void testTwo() {
        int[] greedy = new int[]{1, 2, 3};
        int[] cookies = new int[]{1, 1};
        Assert.assertEquals(findContentChildren(greedy,cookies),1);
    }
    @Test
    public void testThree() {
        int[] greedy = new int[]{1, 2};
        int[] cookies = new int[]{1,2,3};
        Assert.assertEquals(findContentChildren(greedy,cookies),1);
    }
}
