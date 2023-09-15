package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortSentence {

    public static String sortSentence(String s) {
        int n=s.split(" ").length;
        String  arr[]=new String[n];
        String st[]=s.split(" ");
        for(String val:st){
            arr[val.charAt(val.length()-1)-'0'-1]=
                    val.substring(0,val.length()-1);
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n-1;i++) {
            str.append(arr[i]);
            str.append(" ");
        }
        str.append(arr[n-1]);
        return str.toString();
    }

    @Test
    public void testOne(){
        String s = "is2 sentence4 This1 a3";
        Assert.assertEquals(sortSentence(s),"This is a sentence");
    }
}
