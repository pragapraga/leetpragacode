package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Duplicate {

    //@Test
    public int findDuplicate(int[] inputArray){
        //int[] inputArray = new int[]{1, 3, 4, 2, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        int result=0;
        for (int element : inputArray) {
            if (!map.containsKey(element)) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
                result = entry.getKey();
            }
        }
        return result;


        //System.out.println("Hello");

    }


    @Test
    public void testOne(){
        int[] inputArray = new int[]{1, 3, 4, 2, 2};
        Assert.assertEquals(findDuplicate(inputArray),2);
    }


    @Test
    public void testTwo(){
        int[] inputArray = new int[]{1, 3, 4, 2, 8, 9, 9};
        Assert.assertEquals(findDuplicate(inputArray),9);
    }
  /*  public static int findDuplicate(ArrayList<Integer> arr, int n){
        HashMap<Integer> mappy = new HashMap<Integer>();
        for(int i=0; i<n; i++){
            //get the frequency of the element
            int c = mappy.getOrDefault(arr[i], 0);
            //increment the frequency
            mappy.put(arr[i], c+1);
        }
        for(Integer num: mappy.keySet()){
            if(mappy.get(num)>1)
                return num;
        }
    }*/
}
