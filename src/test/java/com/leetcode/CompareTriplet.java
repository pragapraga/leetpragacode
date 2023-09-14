package com.leetcode;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
     @input - List of Integer
     @output - List of Integer

     Psuedo code
     1. Get the alice and bob's integer array
     2. Iterate the array
     2.1 If Alice score is greater , increment Alice score else the other way with index
     3. Return the final Integer array
 */
public class CompareTriplet {

    public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> finalList = new ArrayList<>(a.size());
        if(a.isEmpty()){
            return finalList;
        }

        int aliceCounter=0;
        int bobCounter=0;
        for(int i =0 ; i<a.size();i++){
            if(a.get(i)>b.get(i)){
              //  finalList.add(0, aliceCounter+1);
                aliceCounter++;
            }
            else if(a.get(i)<b.get(i) ){
               // finalList.add(1, bobCounter+1);
                bobCounter++;
            }
        }
        finalList.add(aliceCounter);
        finalList.add(bobCounter);
        System.out.println(finalList);
        return finalList;

    }

    @Test
    public void Test(){
        List<Integer> alice = Arrays.asList(5 ,7 ,7);
        List<Integer> bob = Arrays.asList(3 ,6 ,10);
        compareTriplets(alice,bob);
    }

    @Test
    public void TestTwo(){
        List<Integer> alice = Arrays.asList();
        List<Integer> bob = Arrays.asList();
        compareTriplets(alice,bob);
    }

}
