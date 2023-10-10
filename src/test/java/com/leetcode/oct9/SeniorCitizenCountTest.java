package com.leetcode.oct9;
/*
07:37am

@input - String[]
@output -  int


Testdata 1 - ["7868190130M7522","5303914400F9211","9273338290F4010"] => 2
Testdata 2 - ["1313579440F2036","2921522980M5644"] => 0


Psuedo code
1. Get 11th and 12th index values
2. Have a counter, if the 11th and 12th index values put together greater than 60, increment the value and return counter
07:40

*/
public class SeniorCitizenCountTest {

    public int countSeniorsEfficient(String[] details) {
        int count = 0;
        for (String s : details) {
            if (s.length() >= 13) {
                char char1 = s.charAt(11);
                char char2 = s.charAt(12);

                if (char1 == '6' && char2 > '0') {
                    count++;
                }
                else if(char1>'6'&&char2>='0') {
                    count++;
                }
            }
        }
        return count;
    }


    public int countSeniors(String[] details) {
        int counter=0;
        for(String currentPerson: details){
            if(Integer.parseInt(currentPerson.substring(11,13))>60){
                counter++;
            }
        }
        return counter;
    }
}




