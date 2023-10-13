package com.leetcode.foundation;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
@input - int[]
@Output - int

Testdata 1 - [7,1,5,3,6,4] => 5
Testdata 2 - [7,6,4,3,1] => 0

Psuedo code
1.Declare currentProfit=0, maxProfit=0 and buyPrice to Integer.MAX_VALUE
2. Iterate through the array, if prices[i]<buyPrice, reassign prices[i] to buyPrice
3. if currentProfit which is prices[i]-buyPrice>maxProfit, reassign currentProfit to maxProfit
4. return maxProfit
 */
public class BuySellTest {

    @Test
    public void testcase1(){
        int[] input = new int[]{7,1,5,3,6,4};
        Assert.assertEquals(maxProfit(input),5);
    }

    @Test
    public void testcase2(){
        int[] input = new int[]{7,6,4,3,1};
        Assert.assertEquals(maxProfit(input),0);
    }

    public int maxProfit(int [] prices){
        int currentProfit = 0;
        int maxProfit =0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<buyPrice){
                buyPrice=prices[i];
            }
            currentProfit = prices[i]-buyPrice;
            if(currentProfit>maxProfit){
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}
