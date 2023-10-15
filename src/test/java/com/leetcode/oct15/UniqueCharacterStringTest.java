package com.leetcode.oct15;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

/*
https://leetcode.com/problems/first-unique-character-in-a-string/

@input - String
@output - int

Testdata 1 - leetcode => 0
Testdata 2 - praga    => 0

Psuedo code
1. Iterate through the string
2. Create a linkedHashMap so that we can track the occurrence of the character
3. Iterate through the map created and find the 1st occurence with value = 1
4. return the string.indexOf(char) found in step 3

 */
public class UniqueCharacterStringTest {

    @Test
    public void testcase1(){
        Assert.assertEquals(findFirstUniqueChar("leetcode"),0);
    }

    @Test
    public void testcase2(){
        Assert.assertEquals(findFirstUniqueChar("praga"),0);
    }

    private int findFirstUniqueChar(String input) {
        LinkedHashMap<Character,Integer> lhMap = new LinkedHashMap<>();
        char ch ='0';
        for (int i = 0; i <input.length() ; i++) {
            int freq = lhMap.getOrDefault(input.charAt(i),0)+1;
            lhMap.put(input.charAt(i),freq);
        }

        for (Map.Entry<Character,Integer> mapRef:lhMap.entrySet()) {
            if(mapRef.getValue()==1){
                ch = mapRef.getKey();
                break;
            }
        }
        return input.indexOf(ch);
    }
}
