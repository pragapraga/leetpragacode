package com.leetcode.oct2;

import java.util.HashMap;
import java.util.Map;

class CustomKey {
    private String value;
    public CustomKey(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        // Always return the same hash code
        return 42;
    }

    @Override
    public String toString() {
        return value;
    }
}

public class HashMapCollisionExample {
    public static void main(String[] args) {
        // Create a HashMap with a small capacity for demonstration
        HashMap<CustomKey, Integer> map = new HashMap<>(4);

        // Create two custom keys with the same hash code
        CustomKey key1 = new CustomKey("Hello");
        CustomKey key2 = new CustomKey("Olleh");

        // Add the custom keys to the HashMap
        map.put(key1, 1);
        map.put(key2, 2);

        // Retrieve values using the custom keys
        int value1 = map.get(key1);
        int value2 = map.get(key2);

        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());

        // Both custom keys have the same hash code and will end up in collision
        System.out.println("Value for 'Hello': " + value1);
        System.out.println("Value for 'Olleh': " + value2);

        int hashCode1 = key1.hashCode(); // step1 - Hashcode calculation
        int boxedValue1 = hashCode1 >>> 16; //step2 - boxing into size 16
        System.out.println("boxedValue "+boxedValue1);

        int hashCode2 = key2.hashCode();


        int index1 = (16 - 1 ) & boxedValue1; //step3 - finding the index
        System.out.println("index1 "+index1);

        int boxedValue2 = hashCode2 >>> 16; //step2 - boxing into size 16
        System.out.println("boxedValue "+boxedValue2);


        int index2 = (16 - 1 ) & boxedValue2; //step3 - finding the index
        System.out.println("index "+index2);


        for (Map.Entry<CustomKey,Integer> currentValue: map.entrySet()) {
            System.out.println(currentValue.getKey()+"::"+currentValue.getValue());
        }
    }
}
