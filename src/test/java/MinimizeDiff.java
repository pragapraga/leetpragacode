/*

2
4 2
1 5 8 10

o/p => 3 3 6 8

5 2
1 2 3 4 5

o/p => 3 0 1 2 3
@input - int[], int
@output - int[]

Testdata 1 - [1 5 8 10]  , 2 => [3 3 6 8]
Testdata 2 - [1 2 3 4 5] , 2 => [3 0 1 2 3 ]

Psuedo code
1. Get an int[] as input and difference element
2. Subtract the difference element from each number of the int[] if the difference is > 0
3. Increment the difference element if the difference is <0
4. Add to the new array, print the array


 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class MinimizeDiff {

    //public static void main(String[] args) {
    public int findMinDiff(int[] arr, int difference) {
        //int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] finalArr = new int[arr.length];
        //int difference = 2;
        int count = 0;

        for (int currentInteger : arr) {
            if ((currentInteger - difference) > 0) {
                finalArr[count++] = currentInteger - difference;
            } else {
                finalArr[count++] = currentInteger + difference;
            }
        }
        //System.out.println(findMax(finalArr) - findMin(finalArr));
        return findMax(finalArr) - findMin(finalArr);

    }

    public int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int currentInt : arr) {
            if (currentInt > max) {
                max = currentInt;
            }
        }
        return max;
    }

    public int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int currentInt : arr) {
            if (currentInt < min) {
                min = currentInt;
            }
        }
        return min;
    }


    @Test
    public void testOne(){
        int[] arr = new int[]{1,2,3,4,5};
        int difference = 2;
        Assert.assertEquals(findMinDiff(arr,difference),3);
    }

    @Test
    public void testTwo(){
        int[] arr = new int[]{1,5,8,10};
        int difference = 2;
        Assert.assertEquals(findMinDiff(arr,difference),5);
    }
}
