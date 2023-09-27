package com.leetcode.sep26;

/*
11:05pm

@input - int[]
@output - int

Testdata 1 - player1 [3,5,7,6] player2 [8,10,10,2] => 2
Testdata 2 - player1 [2,3] player2 [4,1] => 0

11:08pm
Psuedo code
1. add the score by default
2. if the i-1 and score 10, add again
2. if i-1 or i-2 and score 10, add again
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class WinnerTest {

    @Test
    public void testCase1(){
        int[] player1 = new int[]{3,5,7,6};
        int[] player2 = new int[]{8,10,10,2};

        Assert.assertEquals(checkWinner(player1,player2),2);
    }

    private int checkWinner(int[] player1, int[] player2) {

        int score1=0 , score2=0;
        for (int i = 0; i <player1.length ; i++) {

            if(( (i==1)&&player1[i-1]==10)||(i>=2)&&(player1[i-1]==10|| player1[i-2]==10)) score1 +=player1[i];
            if(( (i==1)&&player2[i-1]==10)||(i>=2)&&(player2[i-1]==10|| player2[i-2]==10)) score2 +=player2[i];

            score1 +=player1[i];
            score2 +=player2[i];
        }
        return score1 == score2 ? 0:score1>score2?1:2;
    }

}
