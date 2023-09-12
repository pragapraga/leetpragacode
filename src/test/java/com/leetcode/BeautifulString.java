package com.leetcode;
/*
@input - String
@output - int

Testdata 1 - 0000 => 2 (0101)
Testdata 2 - 1001 => 2 (0101)

Psuedo Code
0. Convert it into charArray
1. Fix the the index[0] as 0 or 1
2. if the index[0]=0/1
2.1 Check All even indexes have 0/1 or not
2.2 Increment the counter if it contains 0/1


*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class BeautifulString {

    //public static int main(String[] args) {
    public int testBeautiFulString(String input){
       // String input = "1001";
        int counter=0;
        //int onecounter=0;
        boolean startsWithZero;
        char[] charArray = input.toCharArray();
        startsWithZero = charArray[0]=='0';
        for (int i = 0; i < charArray.length; i=i+2) { //0 2 4 6 8 10
        if(startsWithZero){

        }
//            if(charArray[0]=='0'){ //string starts with 0
//                if((i%2==0)||charArray[i]=='0'){
//                continue;
//                }
//                else{
//                   if(charArray[i]=='1'){
//                       continue;
//                   }
//                   else{
//                       counter++;
//                   }
//                }
//            }
//            else{ //string starts with 1
//                if(charArray[i]=='1'){
//                    continue;
//                }
//                else{
//                    if(charArray[i]=='0'){
//                        continue;
//                    }
//                    else{
//                        counter++;
//                    }
//                }
//            }
        }
            return counter;
    }

    @Test
    public void testOne(){
        String input = "01011";
        Assert.assertEquals(testBeautiFulString(input),1);
    }
    @Test
    public void testTwo(){
        String input = "1001";
        Assert.assertEquals(testBeautiFulString(input),2);
    }
}

