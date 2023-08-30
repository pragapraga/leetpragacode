package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class AssignCookie {
    public int findContentChildren(int[] greedFactor, int[] cookies) {
        Arrays.sort(greedFactor);
        Arrays.sort(cookies);
        int contentfulChild = 0;
        int i=0;
        for (int j = 0; i < greedFactor.length && j < cookies.length; j++) {
            if (greedFactor[j] <= cookies[i]) {
                contentfulChild++;
            }
            i++;
        }
        return contentfulChild  ;
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
        Assert.assertEquals(findContentChildren(greedy,cookies),2);
    }
    @Test
    public void testThree() {
        int[] greedy = new int[]{1, 2};
        int[] cookies = new int[]{1,2,3};
        Assert.assertEquals(findContentChildren(greedy,cookies),2);
    }
}
