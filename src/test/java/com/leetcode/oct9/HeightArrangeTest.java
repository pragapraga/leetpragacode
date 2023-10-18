package com.leetcode.oct9;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

/*
1. Declare a hashMap which maps between height and names
2. add all the values in hashMap
3. sort the heights
4. iterate the height in reverse order, get the names from the map saved in step 2
5. Add the names in an array with size names or heights
 */

public class HeightArrangeTest {
    int index;
    int[] array;

    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> heightMap = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            heightMap.put(heights[i], names[i]);
        }
        int[] funArray = new int[0];
        Arrays.sort(heights);
        String[] result = new String[names.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            result[index++] = heightMap.get(heights[i]);
        }
        System.out.println(Arrays.toString(funArray));
        System.out.println(Arrays.toString(array));

        return result;
        
    }

    @Test
    public void testMe() {
        String[] names = new String[]{"A", "B"};
        int[] heights = new int[]{190, 200};
        String[] result = new String[]{"B", "A"};
        Assert.assertEquals(sortPeople(names, heights), result);
    }
}
