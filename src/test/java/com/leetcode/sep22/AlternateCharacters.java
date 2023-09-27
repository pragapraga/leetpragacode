package com.leetcode.sep22;
/*

@input - abcdefghijklmnopqrstuvwxyz
@output - acegikmprsuwy

 */
public class AlternateCharacters {
    public static void main(String[] args) {
        String atoz = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(atoz);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < atoz.length() ; i++) {
            if(i%2!=0){
                continue;
            }
            sb.append(atoz.charAt(i));
        }
        System.out.println(sb.toString());
    }


}
