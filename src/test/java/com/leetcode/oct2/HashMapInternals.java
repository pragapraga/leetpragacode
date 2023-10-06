package com.leetcode.oct2;

import java.util.Arrays;
import java.util.List;

public class HashMapInternals {

    public static void main(String[] args) {
        List<String> listOfFolks = Arrays.asList("Praga","Raji","Nazreen","Muralee","Govind","Poorani","Anand","Mari","Natraj","Gokul");
        for (String listOfFolk : listOfFolks) {
            internalsOfHashing(listOfFolk);
        }

    }

    private static void internalsOfHashing(String currentString) {
        int hashValue = currentString.hashCode(); // step1 - calculate the hashcode of the key
        System.out.println("hash Value "+hashValue +" for "+currentString);

        int sizeOfHashMap = 16;

        int boxedValue = hashValue >>> sizeOfHashMap; //step2 - boxing into size 16
        System.out.println("boxedValue "+boxedValue);


        int index = (sizeOfHashMap - 1 ) & boxedValue; //step3 - finding the index
        System.out.println("index "+index);
        System.out.println("----------------------------");
    }
}
