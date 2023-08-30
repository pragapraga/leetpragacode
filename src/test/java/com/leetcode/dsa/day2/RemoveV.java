package com.leetcode.dsa.day2;

public class RemoveV {
    public static void main(String[] args) {
        String input = "Hi testleaf Students";
        System.out.println(removeVowels(input));
    }

    private static String removeVowels(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!checkVowel(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private static boolean checkVowel(char ch) {
        return ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U';
    }
}
