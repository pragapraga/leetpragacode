package com.leetcode.oct15;

import java.util.HashMap;
import java.util.HashSet;

public class TimeComplexityAnalysis {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Praga"); //O[1]
        set.size(); //O(1)
        set.contains("Praga"); //O[1] or O(logn) if collision happens


        HashMap<String, String> map = new HashMap<>();
        map.put("A","1");
        map.size();
        map.get("A"); //O(1) , what happens when collision happens?
        map.isEmpty(); //transient keyword
    }
}
