package com.leetcode.sep23;

import org.testng.annotations.Test;

import java.util.Arrays;

/*
@input - String[]
@output - Boolean[]

Testdata - this is praga => [false false false]
Testdata - mam is sos => [true false true]

Psuedo code
1. Iterate through the String array for each word
2. reverse it and return boolean
 */
public class PalindromeStringArrayTest {
    @Test
    public void testOne(){
        String input ="this is praga opo";
        checkPalinUsingTwoPointer(input);
    }


    private Boolean[] checkPalinUsingTwoPointer(String input){
        String[] inputArr = input.split(" ");
        Boolean[] result = new Boolean[inputArr.length];
        int j=0;
        while(j< inputArr.length){
            String currentWord = inputArr[j];
            boolean currentWordResult = checkPalindrome(currentWord);
            result[j]=currentWordResult;
            j++;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    private boolean checkPalindrome(String currentWord) {
        for (int i = 0; i < currentWord.length(); i++) {
            if(currentWord.charAt(i)!= currentWord.charAt(currentWord.length()-i-1)){
                return false;
            }
        }
        return true;
    }

}
