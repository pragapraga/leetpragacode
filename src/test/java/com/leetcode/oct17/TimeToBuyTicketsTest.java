package com.leetcode.oct17;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayDeque;

/*

https://leetcode.com/problems/time-needed-to-buy-tickets

@input - int[], int
@output - int



 */
public class TimeToBuyTicketsTest {

    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int time = 0;

        ArrayDeque<Integer> arrQ = new ArrayDeque<>();
        while (tickets[k] > 0) { // we are checking, person who we are interested have more tickets
            for (int i = 0; i < n; i++) {


            }
        }



/*        if (tickets[k] == 1) return k + 1;
        while (tickets[k] > 0) {
            for (int i = 0; i < n; i++) {
                if (tickets[i] == 0) continue;
                tickets[i] = tickets[i] - 1;
                time++;
                if (tickets[k] == 0) break;
            }
            k--;
        }*/
        return time;
    }

    @Test
    public void testcase1() {
        int[] q = new int[]{2, 3, 2};
        int k = 2;
        Assert.assertEquals(timeRequiredToBuy(q, k), 6);
    }

    @Test
    public void testcase2() {
        int[] q = new int[]{5, 1, 1, 1};
        int k = 0;
        Assert.assertEquals(timeRequiredToBuy(q, k), 8);
    }

}
