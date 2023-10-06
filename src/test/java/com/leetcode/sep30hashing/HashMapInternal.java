package com.leetcode.sep30hashing;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapInternal {
    public static void main(String[] args) {
        HashMap<String,Integer> mappy = new HashMap<>();
        int hashValue = "SizeOfTheArray".hashCode(); // step1 - calculate the hashcode
        System.out.println(hashValue);
        int boxedValue = hashValue >>> 16; //step2 - boxing into size 16
        System.out.println(boxedValue);
        int size=16;
        int index = (15) & boxedValue; //step3 - finding the index
        System.out.println(index);
        //mappy.getOrDefault();

        mappy.put("praga",1);
        mappy.put("hello0",2);
        for (Map.Entry<String,Integer> currentMap:mappy.entrySet()) {
            System.out.println(currentMap.getKey());
        }

        for (int n:mappy.values()) {
            System.out.println(n);
        }
        for (String current:mappy.keySet()) {
            System.out.println(current);
        }

        Collection<Integer> values = mappy.values();

        mappy.clear(); //assigns value to null

    }
}
