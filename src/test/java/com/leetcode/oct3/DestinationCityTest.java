package com.leetcode.oct3;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

/*
@input - List of list
@output - String

Testdata1 - [["Chennai","Karur"],["Karur","Trichy"],["Trichy","Madurai"]]
Testdata 2 - [["Madurai","Chennai"]]

Psuedo code
1. Iterate the list and store the source cities in set
2. Iterate the list again and get the destination cities, pick the city which is not available in source cities created in step 1
3. if it not contains, return the city
 */
public class DestinationCityTest {

    public String destCity(List<List<String>> paths) {
        Set<String> sourceCity = new HashSet<>();
        for (List<String> source : paths) {
            sourceCity.add(source.get(0));
        }

        for (List<String> source : paths) {
            if (!sourceCity.contains(source.get(1))) {
                System.out.println(source.get(1));
                return source.get(1);
            }
        }

        return "";
    }

    @Test
    public void testcase1() {
        List<String> list1 = Arrays.asList("London", "New York");
        List<String> list2 = Arrays.asList("New York", "Lima");
        List<String> list3 = Arrays.asList("Lima", "Minneapolis");

        List<List<String>> input = new ArrayList<>();
        input.add(list1);
        input.add(list2);
        input.add(list3);
        Assert.assertEquals(destCity(input), "Minneapolis");
    }

    @Test
    public void testcase2() {
        List<String> list1 = Arrays.asList("Chennai", "Karur");
        List<String> list2 = Arrays.asList("Karur", "Trichy");
        List<String> list3 = Arrays.asList("Trichy", "Madurai");

        List<List<String>> input = new ArrayList<>();
        input.add(list1);
        input.add(list2);
        input.add(list3);
        Assert.assertEquals(destCity(input), "Madurai");
    }


}
