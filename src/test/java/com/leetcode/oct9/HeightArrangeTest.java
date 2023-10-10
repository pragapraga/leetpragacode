package com.leetcode.oct9;



import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.TreeMap;

public class HeightArrangeTest {

    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<String, Integer> peopleHeights = new TreeMap<>();
        String[] result = new String[names.length];
        int index = 0;
        for (int i = 0; i < names.length; i++) {
            peopleHeights.put(names[i], heights[i]);
        }

        for (String name : peopleHeights.keySet()) {
            result[index++] = name;
        }
        return result;
    }

    @Test
    public void testMe(){
    String[] names = new String[]{"A","B"};
    int[] heights = new int[]{190,200};
    String[] result = new String[]{"B","A"};
    Assert.assertEquals(sortPeople(names,heights),result);
    }
}
