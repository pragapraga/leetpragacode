package com.leetcode.oct15;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Stack;

/*

https://leetcode.com/problems/baseball-game/

@input - String[]
output - int

Testdata 1 -ops = ["5","2","C","D","+"] => 30
Testdata 2 - ops = ["5","-2","4","C","D","9","+","+"] => 27

Psuedo code
1. Declare a stack
2. Iterate through each of the operation using for each loop and perform the operation based on the rule given in the problem
3. Iterate the stack until stack is empty and return the final_score
 */
public class BaseBallGameTest {

    @Test
    public void testcase1() {
        String[] operations = new String[]{"5", "2", "C", "D", "+"};
        Assert.assertEquals(findFinalScore(operations), 30);
    }

    @Test
    public void testcase2() {
        String[] operations = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};
        Assert.assertEquals(findFinalScore(operations), 27);
    }

    private int findFinalScore(String[] operations) {
        Stack<Integer> scoreStack = new Stack<>();
        for (String curOpr : operations) {
            if (curOpr.equals("+")) {
                int top = scoreStack.pop();
                int fScore = top + scoreStack.peek();
                scoreStack.push(top);
                scoreStack.push(fScore);
            } else if (curOpr.equals("D")) {
                int fScore = (int) 2 * scoreStack.peek();
                scoreStack.push(fScore);
            } else if (curOpr.equals("C")) {
                scoreStack.pop();
            } else {
                scoreStack.push(Integer.valueOf(curOpr));
            }
        }
        System.out.println(scoreStack);
        int score = 0;
        while (!scoreStack.isEmpty()) {
            score += scoreStack.pop();
        }

        return score;
    }
}
