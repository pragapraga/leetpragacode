package com.leetcode;

/*
@input - int and int[][]
@output - int[]

Psuedo code
1. Iterate the matrix
2. if the i value is odd, reverse the numbers using a for loop
3. else print the values as is


 */

import com.leetcode.dsa.Array;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class NinjaMatrix {


    //public void matrixNinja(int[][] mat) {
    public ArrayList<Integer> matrixNinja(int[][] mat) {
        //int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //int[][] mat = new int[][]{{1,2},{5,6}};
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            boolean flag = false;
            for (int j = 0; j < mat.length; j++) {
                if (!(i % 2 == 0) && (!flag)) {
                    for (int k = mat.length - 1; k >= 0; k--) {
                        flag = true;
                        System.out.print(mat[i][k] + " ");
                        arr.add(mat[i][k]);
                    }
                } else if (!flag) {
                    System.out.print(mat[i][j] + " ");
                    arr.add(mat[i][j]);
                }
            }
        }
        return arr;
    }


    @Test
    public void testme() {
        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] res = new int[]{1, 2, 3, 6, 5, 4, 7, 8, 9};
        Assert.assertEquals(matrixNinja(mat), Arrays.asList(res));
    }
}

/*
1(0,0) 2(0,1)
5(1,0) 6 (1,1)

1 2
6 5

 */
