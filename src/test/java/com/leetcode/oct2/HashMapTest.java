package com.leetcode.oct2;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> map1 = new HashMap<>();
        map1.put("1","Praga");

        HashMap<String,String> map2 = new HashMap<>();
        map2.put("2","map2Test1");
        map2.put("3","map2Test2");

        map1.putAll(map2);
        System.out.println(map1);
        System.out.println(map2);

        map2.put("4","Hello");
        System.out.println(map1);

    }
}
