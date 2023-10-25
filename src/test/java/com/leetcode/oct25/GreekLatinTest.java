package com.leetcode.oct25;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GreekLatinTest {

    @Test
    public void testcase1() {
        String input = "I speak Goat Latin";
        String output = "Imaa peaksmaaa oatGmaaaa atinLmaaaaa";
        Assert.assertEquals(toGoatLatin(input), output);

    }

    public String toGoatLatin(String sentence) {
        String[] wordsArray = sentence.split(" ");
        StringBuilder sbi = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < wordsArray.length; i++) {
            String currentWord = wordsArray[i];
            String finaString = "";
            if (isVowel(currentWord)) {
                String vowel = sbi.append(vowel(currentWord)).toString();
                String append = appenda(String.valueOf(vowel), i + 1);
                result = sbi.append(" ");
                finaString += finaString;
            } else {
                String conso = sbi.append(consonnat(currentWord)).toString();
                String append = appenda(String.valueOf(conso), i + 1);
                result = sbi.append(" ");
                finaString += finaString;
            }
            result.append(finaString);
        }
        System.out.println(result);
        return sbi.toString().trim();
    }

    public String appenda(String currentString, int iValue) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < iValue; i++) {
            a.append("a");
        }
        System.out.println(a);
        return currentString + a.toString();
    }

    public String consonnat(String currentString) {
        StringBuilder sb = new StringBuilder(currentString);
        sb.deleteCharAt(0);
        sb.append(currentString.charAt(0));
        sb.append("ma");
        return sb.toString();
    }

    public String vowel(String currentString) {
        StringBuilder sb = new StringBuilder(currentString);
        sb.append("ma");
        return sb.toString();
    }

    public boolean isVowel(String s) {
        char ch = s.toLowerCase().charAt(0);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
