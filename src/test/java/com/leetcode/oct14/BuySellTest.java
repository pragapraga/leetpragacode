package com.leetcode.oct14;

/*

@input - int[]
@output - int

Testdata 1  - [1,2,3,4,5] => 4
Testdata 2  - [1,2,8,4,5] => 7
Testdata 3  - [4,2,1,1,0] => 0

Psuedo code
1. Declare buyPrice to Integer.MAX_VALUE, currentProfit as 0, maxProfit as 0
2. Iterate through the price array
3. if the currentPrice or prices[i]<buyPrice, reassign the currentPrice to buyPrice
4. calculate the currentProfit using prices[i]- buyPrice
4.1 if the currentProfit>maxProfit, reassign the currentProfit to maxProfit
5, return maxProfit
 */

public class BuySellTest {
}
