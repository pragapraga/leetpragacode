package com.leetcode;

import java.util.*;

public class Jars {
    int sum=0;
    public static void main(String[] args){
        /*int n=5;
        int[] jars = new int[n];
        Arrays.fill(jars,0);
        List<List<Integer>> operations = new ArrayList<>();;
        List<Integer> individualOperation1 = new ArrayList<>();
        individualOperation1.add(1);
        individualOperation1.add(2);
        individualOperation1.add(100);

        List<Integer> individualOperation2 = new ArrayList<>();
        individualOperation2.add(2);
        individualOperation2.add(5);
        individualOperation2.add(100);
        operations.add(individualOperation1);
        operations.add(individualOperation2);

        List<Integer> individualOperation3 = new ArrayList<>();
        individualOperation3.add(3);
        individualOperation3.add(4);
        individualOperation3.add(100);
        operations.add(individualOperation3);
        System.out.println(Arrays.toString(jars));
        HashMap<Integer,Integer> mappy = new HashMap<Integer,Integer>();

        for(int i=0; i<operations.size();i++){

        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number of Jars ");
        int totalNoOfJars = sc.nextInt();
        System.out.println("Enter Total Number of Operations to be performed ");
        int totalOperations = sc.nextInt();
        long total = 0;
        for (int i = 0; i < totalOperations; i++) {
            System.out.println("Enter start Index for Operation"+(i+1));
            int a = sc.nextInt();
            System.out.println("Enter end Index for Operation"+(i+1));
            int b = sc.nextInt();
            System.out.println("Enter chocolates to be filled  in jar "+(i+1));
            int k = sc.nextInt();
            total += (b - a + 1L) * k;
        }
        System.out.println(total / totalNoOfJars);
        sc.close();
    }
}
