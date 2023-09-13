package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/baseball-game/
/*

 */
public class BaseBall {

    public int calculatePoints(String[] operations) {

        int total=0;
        for (int i = 0; i < operations.length ; i++) {
            validateOperation(operations[i],i);
        }

        return total;
    }

    private void validateOperation(String currentOperation,int index) {
        /*if(Integer.class.isInstance(currentOperation)){
            finalList.add(currentOperation);
        }
        if(currentOperation.equals("C")){
        finalList.remove(index-1);
        }
        if(currentOperation.equals("D")){
            int previousScoreAndDouble = Integer.parseInt(finalList.get(index-1))*2;
            finalList.add(String.valueOf(previousScoreAndDouble));
        }
        if(currentOperation.equals("+")){
            int previousTwoScoreSum = Integer.parseInt(finalList.get(index-1))+Integer.parseInt(finalList.get(index-2));
            finalList.add(String.valueOf(previousTwoScoreSum));
        }*/

        List<String> finalList = new ArrayList();
        switch (currentOperation){
            case "C":
                finalList.remove(finalList.size()-1);
                break;
            case "D":
                int previousScoreAndDouble;
                if(finalList.size()==1){
                     previousScoreAndDouble = Integer.parseInt(finalList.get(0))*2;
                }
                else{
                     previousScoreAndDouble = Integer.parseInt(finalList.get(finalList.size()-1))*2;
                }
                finalList.add(String.valueOf(previousScoreAndDouble));
                break;
            case "+":
                int previousTwoScoreSum = Integer.parseInt(finalList.get(finalList.size()-1))+Integer.parseInt(finalList.get(finalList.size()-2));
                finalList.add(String.valueOf(previousTwoScoreSum));
                break;
            default:
                finalList.add(currentOperation);
        }
    }


    @Test
    public void testOne(){
        String[] ops = new String[]{"5","2","C","D","+"};
        Assert.assertEquals(calculatePoints(ops),30);
    }

    @Test
    public void testTwo(){
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        Assert.assertEquals(calculatePoints(ops),27);
    }
}
