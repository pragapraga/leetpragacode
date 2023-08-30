package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Jars {
    int sum=0;
    public static void main(String[] args){
        int n=5;
        int[] jars = new int[n];
        Arrays.fill(jars,0);
        List<List<Integer>> operations = new ArrayList<>();;
        List<Integer> individualOperation1 = new ArrayList<>();
        individualOperation1.add(1);
        individualOperation1.add(2);
        individualOperation1.add(100);

        List<Integer> individualOperation2 = new ArrayList<>();
        individualOperation2.add(2);
        individualOperation2.add(5);
        individualOperation2.add(100);
        operations.add(individualOperation1);
        operations.add(individualOperation2);

        List<Integer> individualOperation3 = new ArrayList<>();
        individualOperation3.add(3);
        individualOperation3.add(4);
        individualOperation3.add(100);
        operations.add(individualOperation3);
        System.out.println(Arrays.toString(jars));
        HashMap<Integer,Integer> mappy = new HashMap<Integer,Integer>();

        for(int i=0; i<operations.size();i++){
            if(mappy.containsKey())
        }




    }
}
