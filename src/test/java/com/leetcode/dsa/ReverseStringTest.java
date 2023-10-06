package com.leetcode.dsa;

/*
00:40
@input - String
@output - String

Testdata 1 - Praga is Good => agarP si dooG
Testdata 2 - I am typing => I ma gnipyt

Psuedo code
1. Get the sentence
2. Split it using space
3. Reverse the word using reverse logic and append it with stringBuilder
*/

class ReverseStringTest {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] sArray = s.split(" ");
        for(String str : sArray){
            sb.append(reverseCurrentWord(str));
        }
        return sb.toString().trim();

    }

    public String reverseCurrentWord(String word){
        StringBuilder sb = new StringBuilder();
        for(int i= word.length()-1;i>=0;i--){
            sb.append(word.charAt(i));
        }
        sb.append(" ");
        return sb.toString();
    }

}