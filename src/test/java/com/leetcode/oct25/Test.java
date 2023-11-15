package com.leetcode.oct25;

public class Test {
    public static void main(String[] args) {
        Test a = new Test();
        String str = "1s3 PSt";
        System.out.println(str.replaceAll("[\\d\\s]","").toLowerCase());
        //System.out.println(a.appendaaa("Praga",5));
        //System.out.println(a.consonnat("Praga"));
        //System.out.println(a.vowel("Apraga"));
        //System.out.println(a.isVowel("Apraga"));
    }

    public String appenda(String currentString, int iValue){
        StringBuilder sb = new StringBuilder(currentString);
        for(int i=0;i<iValue;i++){
            sb.append("a");
        }
        return sb.toString();
    }

    public String consonnat(String currentString){
        StringBuilder sb = new StringBuilder(currentString);
        sb.deleteCharAt(0);
        sb.append(currentString.charAt(0));
        return sb.toString();
    }

    public String vowel(String currentString){
        StringBuilder sb = new StringBuilder(currentString);
        sb.append("ma");
        return sb.toString();
    }

    public boolean isVowel(String s){
        char ch = s.toLowerCase().charAt(0);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public String appendaaa(String currentString, int iValue){
        StringBuilder a= new StringBuilder();
        for(int i=0;i<iValue;i++){
            a.append("a");
        }
        System.out.println(a);
        return currentString+a.toString();
    }
}
