package com.leetcode.oct15;

import java.util.Arrays;

public class StringMethods {
        public static void main(String[] args) {
         //   String input = "a, a, a, a, b,b,b,c, c";

            // Use regular expressions to remove special characters
            //String[] result = input.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase().split("//W+");
         /*   String[] arr = input.toLowerCase().split("[!?,';.\\s]+");

            System.out.println(Arrays.toString(arr));
            for (String str:
                 arr) {
                System.out.println(str.trim());*/
            char[] arr = new char[26];
            String abcd ="abcdefghijklmnopqrstuvwxyz";
            String abc ="thequickbrownfoxjumpsoverthelazydog";
            for(int i=0;i<abc.length();i++){
                arr[abc.charAt(i)-'a']=abc.charAt(i);
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.equals(arr,abcd.toCharArray()));

            //System.out.println('b'-'a');

            //}
        }
    }
