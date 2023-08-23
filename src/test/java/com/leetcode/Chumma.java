package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Chumma {
    static HashMap<Character,Character> mapz;
    public static void main(String[] arg){
         mapz= new HashMap<Character, Character>();
        Arrays.sort(new int[]{2,90,0});
        //mappy.put(“a”,”b”);

        for(Character i=97;i<=122;i++){
            mapz.put(i,i);
        }

        System.out.println(mapz);

    }
}
