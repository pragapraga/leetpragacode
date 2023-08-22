package com.leetcode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class SimpleDate {
    public static void main(String[] args){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.format(format));
        System.out.println(ldt.plusDays(1).format(format));
    }
}
