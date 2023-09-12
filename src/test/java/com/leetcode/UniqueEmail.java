package com.leetcode;

//https://leetcode.com/problems/unique-email-addresses/

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
07:03am
@input - String[]
@output - int

Testdata - ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"] => 2
            [testemail@leetcode.com,testemail@leetcode.com,testemail@lee.tcode.com]

Psuedo Code
1. Split the string based on '@'
2. Keep the String[1] as is
3. Process the String[0]
3.1 Convert this to char array
3.2 If the char array contains '.' skip and add to StringBuilder
3.3 Craft the String Builder
3.4 If the char array contains '+', ignore rest of the characters
4. Add to the set and return the number of elements to remove duplicate email ids

07:13
 */
public class UniqueEmail {

    //List<String> allemails = new ArrayList<>();
    Set<String> set = new HashSet<String>();
    private int testEmail(String[] emails) {
        for (String currentEmail : emails) {
            String userName = currentEmail.split("@")[0];
            String domain = currentEmail.split("@")[1];
            processEmail(userName, domain);
        }
        //System.out.println(allemails);
        return set.size();
    }

    private void processEmail(String currentUserName, String currentDomain) {
        char[] currentUserCArray = currentUserName.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < currentUserCArray.length; i++) {
            if (currentUserCArray[i] == '+') {
                break;
            }
            if (currentUserCArray[i] != '.') {
                sb.append(currentUserCArray[i]);
            }

        }
        String finalCurrentEmail = sb.append(currentDomain).toString();
        //allemails.add(finalCurrentEmail +"@"+currentDomain);
        set.add(finalCurrentEmail +"@"+currentDomain);
    }

    @Test
    public void testOne() {
        String[] emails = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        Assert.assertEquals(testEmail(emails), 2);
    }

    @Test
    public void testTwo(){
        String[] emails = new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        Assert.assertEquals(testEmail(emails), 3);
    }


}

//07:50