//https://leetcode.com/problems/three-divisors/submissions/

/*
12:55pm
@input - int
@output - boolean

Testdata - 
1. n=2 => false = 1 and 2
2. n=4 => true = 1,2,4
3. n=5 => false = 1 and 5
4. n=10 => false = 1,2,5,10


Psuedo Code
1. Get the n value and initialise the counter=0
2. Define a for loop which iterates from 1 to n
3. if n%i==0, increment the counter
4. if counter=3 return true else false
*/
package com.leetcode;
import org.junit.Test;

public class Threedivisors{
	
	@Test
	public void testOne() {
	
	}
	
	
	
	public boolean isThree(int num) {
	       int counter=0;
	       boolean result = false;
	       for(int i=1;i<=num;i++){
	           if(num%i==0){
	               counter++;
	           }
	       } 
	       result = (counter==3)?true:false;
	       return result;
	    }
}