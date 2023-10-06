package com.leetcode.oct2;

import java.util.HashMap;

public class HashMapCapacityExample {
    public static void main(String[] args) {
        // Create a HashMap with an initial capacity of 16
        HashMap<String, Integer> map = new HashMap<>(16);

        // Add elements to the HashMap
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Print the current capacity of the HashMap
        int initialCapacity = getCapacity(map);
        System.out.println("Initial Capacity: " + initialCapacity);

        // Add more elements to trigger a capacity increase
        for (int i = 4; i <= 20; i++) {
            map.put("Key" + i, i);
        }

        // Print the updated capacity after adding more elements
        int updatedCapacity = getCapacity(map);
        System.out.println("Updated Capacity: " + updatedCapacity);
    }

    // Helper method to get the current capacity of a HashMap
    private static int getCapacity(HashMap<?, ?> map) {
        try {
            java.lang.reflect.Field field = HashMap.class.getDeclaredField("table");
            field.setAccessible(true);
            Object[] table = (Object[]) field.get(map);
            return table == null ? 0 : table.length;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
