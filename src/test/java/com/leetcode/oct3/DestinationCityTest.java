package com.leetcode.oct3;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
@input - List of list
@output - String

Testdata1 - [["Chennai","Karur"],["Karur","Trichy"],["Trichy","Madurai"]]
Testdata 2 - [["Madurai","Chennai"]]

Psuedo code
1. Iterate through the list
2. Add the list to the set
3.
 */
public class DestinationCityTest {

    public String destCity(List<List<String>> paths) {
        HashSet<String> fromAndTo = new HashSet<>();
//        for(List<String> currentList:paths){
//            while(currentList.iterator().hasNext()){
//                fromAndTo.addAll(currentList);
//                currentList.iterator().next();
//
//
////                //fromAndTo.add(currentList.iterator().next());
////                String city = currentList.iterator().next(); // Retrieve the next element
////                fromAndTo.add(city); // Add it to the set
//////                currentList.iterator().next();
//            }
//        }

        for (List<String> list : paths) {
            for (String item : list) {
                if(!fromAndTo.add(item)){
                    fromAndTo.remove(item);
                }
             }
        }
        System.out.print(fromAndTo.iterator().next());
        return fromAndTo.iterator().next();
    }
    @Test
    public void testcase1(){
        List<String> list1 = Arrays.asList("London","New York");
        List<String> list2 = Arrays.asList("New York","Lima");
        List<String> list3 = Arrays.asList("Lima","Minneapolis");

        List<List<String>> input = new ArrayList<>();
        input.add(list1);input.add(list2);input.add(list3);
        Assert.assertEquals(destCity(input),"Minneapolis");
    }

}
