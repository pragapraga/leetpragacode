package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.*;
import org.testng.annotations.Test;

/*
 * A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.

Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].

 

Example 1:
Input: left = 1, right = 22
Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]

Example 2:
Input: left = 47, right = 85
Output: [48,55,66,77]

@input - int, int
@output - List of integers

 Testdata 1 -  
 @input - left = 1, right = 22
 @output -  [1,2,3,4,5,6,7,8,9,11,12,15,22]
 Testdata 2 -  
 @input - left = 47, right = 85
 @output - [48,55,66,77] 
 
Psuedo Code:
1. Declare a function to find whether given number is self dividing number or not
1.1 if it is less than 9 return as it is 
1.2 if it is more than 11, separate out each digit and check the divisibility 
2. Get the range left and right
2.1 frame a for loop with left as initial value and till right value
2.2  Call the function declared in step 1, if the condition satisfies, add to the list else skip it 

 */

public class Selfdividingnumber {

	public List<Integer> isSelfDividing(int num) {
		List<Integer> list = new ArrayList<Integer>();
		while (num != 0) {
			int reminder = num % 10;
			if (reminder == 0) {
				break;
			}
			list.add(reminder);
			num = num / 10;
		}
		return list;
	}

	public boolean checkSelfDividing(int num) {
		boolean isDivisble = false;
		List<Integer> individualNumbers = new ArrayList<Integer>();
		individualNumbers = isSelfDividing(num);

		for (int i = 0; i < individualNumbers.size(); i++) {
			if (num % individualNumbers.get(i) == 0) {
				isDivisble = true;
			} else {
				isDivisble = false;
				break;
			}
		}
		return isDivisble;
	}

	public List<Integer> checkDivisibilityInRange(int num1, int num2) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = num1; i <= num2; i++) {
			if (checkSelfDividing(i)) {
				list.add(i);
			}
		}
		return list;
	}

	@Test
	public void testOne() {
		Assert.assertEquals(true, checkSelfDividing(48));
	}

	@Test
	public void testTwo() {
		Assert.assertEquals(false, checkSelfDividing(898));
	}

	@Test
	public void testThree() {
		Assert.assertEquals(checkDivisibilityInRange(1, 22),Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22));
		System.out.println();
	}
	@Test
	public void testFour() {
		Assert.assertEquals(checkDivisibilityInRange(1, 22),Arrays.asList(48, 55, 66, 77));
	}
}
