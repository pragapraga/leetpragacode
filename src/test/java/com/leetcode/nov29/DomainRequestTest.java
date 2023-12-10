package com.leetcode.nov29;

import org.testng.annotations.Test;

/*

@input - String[]
@output - String : boolean
1. Atmost we can have 2 requests with 5 seconds interval, if it is more than 2, print false
2. Within 30 seconds interval, we cannot have more than 5 request from same domain, if that happens return false


Testdata1 - ["a","a","b","a","b","b"]
output - a:true a:true b:true a:false b:true b:true
 */
public class DomainRequestTest {
    @Test
    public void testcase1() {
        String[] input = new String[]{"a", "a", "b", "a"};
        //
    }

    public void checkDomainRequests(String input) {

    }
}
