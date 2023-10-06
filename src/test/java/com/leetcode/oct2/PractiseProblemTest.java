package com.leetcode.oct2;

import java.util.*;

public class PractiseProblemTest {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<List<String>> lists = new ArrayList<>();
        list1.add("Two pointer");
        list1.add("Hashing");
        //list1.add("Sliding Window");
        lists.add(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("Arrays");
        list2.add("Map");
        list2.add("Map");
        //list2.add("Stack");
        lists.add(list2);
        //System.out.println(lists);

        //HashSet<String> set = new HashSet<>();
        for (List<String> list : lists) {
            for (String item : list) {
                System.out.println(item);
            }
        }
        //System.out.println(set.addAll(list2));
        //System.out.println(set);

        HashMap<String,String> mappy = new HashMap<>();
        mappy.put("Jan_SDET1","Praga");
        mappy.put("Feb_SDET1","Test");
        HashMap<String,String> choppy = new HashMap<>();
        choppy.put("Jan_SDET1","Praga");
        choppy.put("Feb_SDET1","Test");
        HashMap<String,Map<String,String>> poppy = new HashMap<>();
        poppy.put("Q1",mappy);
        poppy.put("Q2",choppy);

        for (Map.Entry<String,Map<String,String>> map : poppy.entrySet()){

        }
        Iterator ir;

        for (String str:mappy.values()
             ) {

        }
    }
}
