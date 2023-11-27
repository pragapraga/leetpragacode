package com.leetcode.nov22;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ArithmeticTripletTest {
    @Test
    public void testcase1() {
        int[] input = new int[]{0, 1, 4, 6, 7, 10};
        int diff = 3;
        Assert.assertEquals(arithmeticTripets(input, diff), 2);
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{4, 5, 6, 7, 8, 9};
        int diff = 2;
        Assert.assertEquals(arithmeticTripets(input, diff), 2);
    }


    public int arithmeticTriplets(int[] nums, int diff) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if ((i < j) && (j < k) && ((nums[j] - nums[i]) == diff) && (nums[k] - nums[j] == diff)) {
                        System.out.println(i + " :: " + j + " :: " + k);
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    /*
    1. Create a for loop with nums.length
    2. Create a HashMap arithTrip<Integer,Integer> to store nums as key and nums-diff as values
    3. Check nums-diff is present as key in arithTrip
    4. If 2 and 3 are true, counter++
     */
    public int arithmeticTripets(int[] nums, int diff) {
        int counter = 0;
        HashMap<Integer, Integer> arithTrip = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            arithTrip.put(nums[i], nums[i] - diff);
        }
        System.out.println(arithTrip);
        for (Map.Entry<Integer, Integer> entry : arithTrip.entrySet()) {
            if((arithTrip.containsKey(entry.getValue() - diff))){
                System.out.println(entry.getKey());
                counter++;
            }
        }
        return counter;
    }


    /*
    Declare a
     */
}
