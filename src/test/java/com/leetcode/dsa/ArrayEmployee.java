package com.leetcode.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayEmployee {

    /*
    class
    constructor
    getter and setter
    toString()
     */
    public static void main(String[] args){

        Employee emp1 = new Employee("Employee One",30,2);
        Employee emp2 = new Employee("Employee Two",25,2);
        Employee[] empArray = new Employee[]{emp1,emp2};

        for(Employee currentEmployee:empArray){
            System.out.println(currentEmployee);
        }

        System.out.println(Arrays.toString(empArray));
    }
}
