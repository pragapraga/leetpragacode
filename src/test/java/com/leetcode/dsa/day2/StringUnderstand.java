package com.leetcode.dsa.day2;

public class StringUnderstand {
    public static void main(String[] args) throws IndexOutOfBoundsException{
        String name = "Praga";
        String nameAgain = new String("Pragadeeswaran");
        StringBuilder abc = new StringBuilder();
        StringBuffer def = new StringBuffer();

        char ch = 'A';
       // System.out.println(ch);
        //System.out.println(ch++);

        String myName = "Pragadeeswaran";
        for (int i = 0; i < myName.length(); i++) {
            char currentChar = myName.charAt(i);
            if(currentChar == 'a'){
               // System.out.println("Yes");
                break;
            }
        }
        System.out.println(name.equals(nameAgain));
        System.out.println(name.charAt(0)); //P
        System.out.println(name.substring(0));//Praga
        System.out.println(name.substring(0,2));// 2 is excluded
        System.out.println(name.toLowerCase());// praga
        System.out.println(name.toUpperCase()); //PRAGA
//Question - will it internally maintain, memory wise there will not be any change, correct? yes you are right!
        System.out.println(name);
        name = name.toUpperCase();
        System.out.println(name);
        name = nameAgain.toUpperCase();
        //+ is overloaded operator as 2+2 is 4 but 2 + "2" is 22
        System.out.println("Before Splitting :: "+name);
        String[] splittedName = name.split("A");
        System.out.println("Before Splitting :: "+name);
        for(String currentOne:splittedName){
            System.out.println(currentOne);
        }
        System.out.println(name.indexOf('A'));
        System.out.println(name.lastIndexOf('A'));
    }
}
