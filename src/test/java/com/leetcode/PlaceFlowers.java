package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int num) {
        int count = 0, i = 0;
        //boolean preEmpty, nxtEmpty;

        while (i < flowerbed.length) {
            if (flowerbed[i] == 0) {
                boolean preEmpty = i == 0 || (flowerbed[i - 1] == 0);
                boolean nxtEmpty = (i == flowerbed[flowerbed.length - 1]) || (flowerbed[i + 1] == 0);
                if (preEmpty && nxtEmpty) {
                    flowerbed[i] = 1; // Plant a flower
                    count++;
                }
            }
            i++;
        }
        return count >= num;
    }

    @Test
    public void testOne(){
        int[] input = new int[]{1,0,0,0,1};
        Assert.assertTrue(canPlaceFlowers(input,1));
    }
}
