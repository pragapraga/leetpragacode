package com.leetcode.oct14;

import java.util.HashSet;

public class TimeComplexityAnalysis {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Praga"); //O[1]
        set.size();
        set.contains("Praga"); //O[1] or O(logn) if collision happens
    }
}
