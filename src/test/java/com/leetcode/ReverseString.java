package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseString {

    public String reverseUsingStringBuilder(String str){
        StringBuilder result = new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
        result.append(str.charAt(i));
        }
        return result.toString();
    }

    public String reverseStringTwoPointer(String str){
        char[] ch = new char[str.length()];
        int j = str.length();
        int i=0;
        while(j>0){
        ch[i++]=str.charAt(j--);
        }
        return new String(ch);
    }

    public String reverseStringTwoPointerIm(String str){
        char[] arr = str.toCharArray();

        int startIndex = 0 ;
        int endIndex = str.length()-1;

        while (startIndex<endIndex){
            char temp = arr[startIndex];
            arr[startIndex++] = arr[endIndex];
            arr[endIndex--] =temp;
        }
        return new String(arr);
    }


    @Test
    public void testOne(){
        Assert.assertEquals(reverseStringTwoPointerIm("Prag"),"garP");
    }

    @Test
    public void testTwo(){
        Assert.assertEquals(reverseStringTwoPointerIm("Malayalam"),"malayalaM");
    }
    @Test
    public void testThree(){
        Assert.assertEquals(reverseStringTwoPointerIm("a"),"a");
    }
}
