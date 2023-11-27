package com.leetcode.nov26;

import org.junit.Assert;
import org.testng.annotations.Test;

/*
Input str = "I am happy  engineer";
Expected output - "I ma yppah  reenigne"
Reverse the words and not the entire string
Note: Retain extra white spaces

Psuedo Code
1. Two pointers, keep left and right at 0 If the word is single character, leave as is
2. If the word is more than 2 characters, reverse it
3. If the current index is space, move forward

Thoughts - getIndex

Traverse through each character in the sentence
For each character, check:
  Is this character a space or are we at the end of the sentence?
  If yes, then:
    We have found a word / we're at the last word.
    Reverse this word by swapping logic (push this as separate method)
    After reversing, skip over any extra spaces until we find a letter again.
    Reset the position as beginning of the next word.
When finished, convert the character array to string to return.


 */
public class ReverseStringTest {

    @Test
    public void testcase1() {
        String input = "I am happy engineer";
        String output = "I ma yppah reenigne";
        Assert.assertEquals(processString(input), output);
    }

    private String processString(String input) {
        String[] inputArr = input.split("\\s+");
        return null;
    }

    private String reverseCurrentWord(String input){
        StringBuilder sb = new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
            sb.append(input.charAt(i));
        }
        return sb.append(" ").toString();
    }


}
