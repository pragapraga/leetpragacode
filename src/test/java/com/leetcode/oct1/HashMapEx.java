package com.leetcode.oct1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String,Integer> mappy = new HashMap<>();
        mappy.put("Praga",1);
        mappy.put("Test",2);
        //mappy.put("Govind Test",3);
        System.out.println(mappy);
        for (int i=0;i< mappy.size();i++) {
            mappy.remove("Praga");
        }
        System.out.println(mappy);

        for (Map.Entry<String,Integer> currentValue : mappy.entrySet()) {
            System.out.println(currentValue);
            mappy.remove("Test");
            //mappy.put("Test",3);
        }
        System.out.println(mappy);


        HashSet<String> set = new HashSet<String>();
        set.add("Praga");
    }
}
