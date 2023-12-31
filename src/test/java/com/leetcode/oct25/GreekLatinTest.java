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
    StringBuilder result = new StringBuilder();

    public String toGoatLatin(String sentence) {
        String[] wordsArray = sentence.split(" ");
        String res = "";
        for (int i = 0; i < wordsArray.length; i++) {
            StringBuilder sbi = new StringBuilder();
            String currentWord = wordsArray[i];
            String finaString = "";
            if (isVowel(currentWord)) {
                String vowel = sbi.append(vowel(currentWord)).toString();
                String append = appenda(vowel, i + 1)+" ";
                //result = sbi.append(append);
            } else {
                String conso = sbi.append(consonnat(currentWord)).toString();
                String append = appenda(conso, i + 1)+ " ";
                //result = sbi.append(append);
            }
            //result.append(sbi);
        }
        System.out.println(result);
        //System.out.println(res);
        return result.toString().trim();
    }

    public String appenda(String currentString, int iValue) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < iValue; i++) {
            a.append("a");
        }
        System.out.println(currentString + a.toString());
        result.append(currentString + a.toString()+ " ");
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
