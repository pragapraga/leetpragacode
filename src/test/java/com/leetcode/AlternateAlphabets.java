package com.leetcode;

public class AlternateAlphabets {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

       /* for (int i = 65; i < 91; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.print((char) i);
                sb.append((char) i);
            }
        }
        System.out.println("*********----------**********");
        for (int i = 65; i < 91; i = i + 2) {
            System.out.print((char) i);
            sb.append((char) i);
        }*/

        for (char ch = 'a'; ch < 'z'; ch = (char) (ch + 2)) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
