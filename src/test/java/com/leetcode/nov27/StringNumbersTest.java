package com.leetcode.nov27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringNumbersTest {
    public static void main(String[] args) {
        int totalSum = 0;
        System.out.println("Praga123Praga12");
        String input = "Praga123Praga12";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher match = pattern.matcher(input);

        while (match.find()) {
            totalSum += Integer.parseInt(match.group());
        }
        System.out.println(totalSum);
    }
}
