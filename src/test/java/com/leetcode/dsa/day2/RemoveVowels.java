package com.leetcode.dsa.day2;
/*
Write a program to remove vowels from a String
Example:
Input: "Hi testleaf students"
Output: "H tstlf studnts"

@input - String
@output - String

Pseudo Code
1. Declare vowels char set
2. Declare a string builder with string input
3.1 traverse the input, if you find the vowel skip adding to sb
3.2 use replaceALl method to replace the vowel with empty char
4. convert the sb to string

@input -
 */

public class RemoveVowels {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String name = "Hi testleaf students";
        String vowelsListInString = "aeiouAEIOU";
        char[] vowelsListInChar = vowelsListInString.toCharArray();
    /*
        for (int i = 0; i <name.length() ; i++) {
            char ch = name.charAt(i);
            //if(ch){

        }*/
      //  name = name.replaceAll("[aeiouAEIOU]", "");
       // System.out.println(name);

        for (int i = 0; i <name.length() ; i++) {
            char ch = name.charAt(i);
            if(!(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
