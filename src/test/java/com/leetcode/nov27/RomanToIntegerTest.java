package com.leetcode.nov27;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

/*
@input - String
@output - int

Testdata 1 - X -> 10
Testdata 2 - IV -> 4
Testdata 3 - VI -> 6
Testdata 4 - MCMXCIV -> 1994

Psuedo code
0. Declare int result=0
1. Store roman base elements in a map - I-1, V-5, X-10, L-50, C-100, D-500, M-1000
2. Iterate through string char by char
3. Based on the map, get the values for the key
4. If the value of i<i+1, Subtract it from result
5. else add i and i+1 value as result
6. return result
 */
public class RomanToIntegerTest {

    @Test
    public void testcase1() {
        String input = "IX";
        Assert.assertEquals(romanToInt(input), 9);
    }

    public int romanToInt(String input) {
        HashMap<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('L', 50);
        romanToInt.put('V', 5);
        romanToInt.put('C', 100);
        romanToInt.put('X', 10);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            if ((i < input.length() - 1) && (romanToInt.get(input.charAt(i))<romanToInt.get(input.charAt(i+1)))){
                result -= romanToInt.get(input.charAt(i));
            } else {
                result += romanToInt.get(input.charAt(i));
            }
        }
        return result;
    }
}
