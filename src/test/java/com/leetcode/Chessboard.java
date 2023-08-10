package com.leetcode;
/*
@input - String
@output - boolean

Testdata 1 - a1 => false
Testdata 2 - h8 => false
Testdata 3 - b4 => true

https://leetcode.com/problems/determine-color-of-a-chessboard-square/description/
Psuedo code 
1. treat a,c,e,g+even white and b,d,f,h+odd white else false
*/


class Chessboard {
    public boolean squareIsWhite(String coordinates) {
        char coordindateChar = coordinates.charAt(0);
        int coordindateInt = coordinates.charAt(1);
        int intResult = coordindateInt%2;
        if((intResult==0) && ((coordindateChar=='a')||(coordindateChar=='c')||(coordindateChar=='e')||(coordindateChar=='g'))){
            return true;
        }
        else if((intResult!=0) &&((coordindateChar=='b')||(coordindateChar=='d')||(coordindateChar=='f')||(coordindateChar=='h'))){
            return true;
        }
        return false;
    }
}
