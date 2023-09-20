package com.leetcode.sep20;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
https://www.codechef.com/problems/NAME2
07:07
@input - String
@ouptut - String

07:08
testdata1 - John Johanna - YES
testdata2 - Praga Ramya - NO
testdata3 - Priydarshini Priyan - YES
07:10

07:10
Brunte force Psuedo code
0.
1. Split the string and get both the names
2. Find the larger string and place in outer loop
3. Check all characters is available in smaller string
4. If yes return YES else NO
07:13


 */
public class NameIsMine {

    @Test
    public void testOne() {
        String name = "John Johanna";
        Assert.assertEquals(checkMarriageStatus(name), "YES");
    }

    @Test
    public void tesTwo() {
        String name = "Praga Ramya";
        Assert.assertEquals(checkMarriageStatus(name), "NO");
    }

    @Test
    public void testThree() {
        String name = "Priyadarshini Priyan";
        Assert.assertEquals(checkMarriageStatus(name), "YES");
    }

    private String checkMarriageStatus(String name) {
        boolean finalResult;
        String[] names = name.split(" ");
        String Name1 = names[0];
        String Name2 = names[1];
        if (Name1.length() >= Name2.length()) {
            finalResult = checkName(Name1, Name2);
        } else {
            finalResult = checkName(Name2, Name1);
        }

        if (finalResult) {
            return "YES";
        }
        return "NO";
    }

    private boolean checkName(String longerString, String smallerString) {
        int counter = 0;
        //longerString is always have more length
        for (int i = 0; i < longerString.length(); i++) {
            for (int j = 0; j < smallerString.length(); j++) {
                if (longerString.charAt(i) == smallerString.charAt(j)) {
                    counter++;
                }
            }
        }
        if (counter >= smallerString.length()) {
            return true;
        }
        System.out.println();
        return false;
    }
    //john johanna
}
