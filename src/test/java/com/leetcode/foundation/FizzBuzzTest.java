package com.leetcode.foundation;

/*
@input - int
@output  - List<String>

Testdata 1 - n=3 => ["1","2","3","Fizz"]
Testdata 2 - n=5 => ["1","2","Fizz","4","Buzz"]
Testdata 3 - n=15 => ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]

Psuedo code
1. If the n%15==0 add 'FizzBuzz'
2. If the n%5==0 add 'Buzz'
3. If the n%3==0 add 'Fizz'

*/

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FizzBuzzTest {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%15==0){
                list.add("FizzBuzz");
            }
            else if(i%5==0){
                list.add("Buzz");
            }
            else if(i%3==0){
                list.add("Fizz");
            }
            else{
                list.add(""+i);
            }
        }
        return list;
    }

    @Test
    public void testCase1(){
        Assert.assertEquals(fizzBuzz(5), Arrays.asList("1","2","Fizz","4","Buzz"));
    }
}