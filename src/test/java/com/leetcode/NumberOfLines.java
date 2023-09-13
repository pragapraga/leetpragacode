package com.leetcode;

/*
https://leetcode.com/problems/number-of-lines-to-write-string/description/

@input - int[], string
@output - int[]

12:25
Testdata - Input: widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "bbbcccdddaaa"
Output: [2,4]
Explanation: You can write s as follows:
bbbcccdddaa  // 98 pixels wide
a            // 4 pixels wide
There are a total of 2 lines, and the last line is 4 pixels wide.

Input: widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "abcdefghijklmnopqrstuvwxyz"
Output: [3,60]
Explanation: You can write s as follows:
abcdefghij  // 100 pixels wide
klmnopqrst  // 100 pixels wide
uvwxyz      // 60 pixels wide
There are a total of 3 lines, and the last line is 60 pixels wide.

Psuedo code
1. Access the widths with index
2. Access the String with charAt
3. Add the width for each iteration and check whether the sum is 100, initialize the lineCounter=1
3.1 if the sum is ==100, increase the lineCounter
Reset for each new line on 100 characters
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberOfLines {
    int lineCounter = 0;
    int sum = 0;
    public int[] findNumerOflines(int[] input, String s) {

        for (int i = 0; i < input.length; i++) {
            sum += input[i];

            if (sum ==100) {
                saveLineWithChars(lineCounter++,sum);
                sum=0;
            }
        }
        return null;
    }

    private int[] saveLineWithChars(int i, int sum) {

        return new int[]{i, sum};
    }

    @Test
    public void testOne() {
        int[] input = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        int[] output = new int[]{3, 60};
        Assert.assertEquals(findNumerOflines(input, s), output);
    }
}
