package com.leetcode;

/*
Understanding


@input - int[], int, int, int
@output - int

Constrains -
1 <= k <= calories.length <= 10^5
0 <= calories[i] <= 20000
0 <= lower <= upper

10:52
Test data
1.  Positive
    k=1
    lower = 3
    upper =3
    calories = [5,4,3,2,1]
    o/p => 0

2.  k=2
    lower = 3
    upper = 3
    calories = [5,4,3,2,1]

    o/p => 2

3.  k=1
    lower =  1
    upper =  2
    calories = [3,3,3]
    o/p => 3

10:55
Psuedo code
1.  Create a int variable to store the final output
2.  Based on k value iterate the subset of int array
2.1 from i=0 to (i+k-1)
2.2 sum it
3. If the sum > k => Increment counter
4. If the sum < k => Decrement counter
5. return counter

11:03
 */
public class DietProblem {
    public static void main(String[] args) {
    int k = 2,sum=0;
    int[] calories = new int[]{5,4,3,2,1};
    int lower = 3;
    int upper = 3;
        for (int i = 0; i < calories.length-k;i++ ) {
            System.out.println(i);
            for (int j = i+k; j <i+k; j++) {
                System.out.println(j);
            }

        }
        System.out.println(sum);
}

}
