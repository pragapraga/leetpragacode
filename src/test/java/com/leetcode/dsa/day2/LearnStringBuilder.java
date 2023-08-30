package com.leetcode.dsa.day2;

public class LearnStringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Pragadeeswaran");
        System.out.println(sb);
        sb.append("Gnanansekaran!");
        System.out.println(sb);
        sb.insert(14, " ");
        System.out.println(sb);
        sb.deleteCharAt(sb.indexOf("!"));
        System.out.println(sb);
        sb.setCharAt(sb.indexOf(" "), '-');
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Praga");
        StringBuilder sb2 = new StringBuilder("Praga");
        System.out.println(sb1.equals(sb2));
        //for comparing we need to convert the StringBuilder to String
    }
}
