package com.leetcode.sep29;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/consecutive-characters/description/

@input - String
@output - int

Testdata 1 - "aaaabcccccde" => 5
Testdata 2 - "abcd" => 1
Tesdata 3 - "leetcode" => 2

Psuedo code
1.  Declaration - HashMap<Character, Integer>, int
2. Read the characters one by one of the string
3. Add it to HashMap<Character, Integer>
4. Iterate the HashMap and Print the highest integer as output

 */
public class ConsecutiveCharactersTest {
    @Test
    public void testcase1() {
        String input = "aaaabcccccde";
        Assert.assertEquals(checkConsecutiveCharacters(input), 5);
    }

    private int checkConsecutiveCharacters(String input) {
        int result = -1;
        char[] chars = input.toCharArray();
        HashMap<Character, Integer> hashy = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!hashy.containsKey(chars[i])) {
                hashy.put(chars[i], 1);
            } else {
                hashy.put(chars[i], hashy.get(chars[i]) + 1);
            }
        }
        System.out.println(hashy);
        for (int currentValue : hashy.values()) {
            if (currentValue > result) {
                result = currentValue;
            }
        }

        return result;
    }

}
