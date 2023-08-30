package com.leetcode.dsa.day2;

/*
Given a valid IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".
Do Not Use the replaceAll()
Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"


@input - 1.1.1.1
@output - 1[.]1[.]1[.]1

Psuedo Code
1. Convert to char Array
2. iterate throughout the char Array
3. When ever you find . , replace it with [.]
4. convert char Array to String
5. Return final String

 */
public class Period {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        /*char[] chArray = address.toCharArray();
        System.out.println(chArray);
        StringBuilder sb = new StringBuilder();
        for (char ch:chArray) {
            if(ch=='.'){
                sb.append("[.]");
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());*/

        //2nd way
        String result = "";
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if ( ch == '.') {
                result += "[.]";
            } else {
                result += address.charAt(i);
            }
            System.out.println(result);
        }
        System.out.println(result);
        //3rd way


    }
}
