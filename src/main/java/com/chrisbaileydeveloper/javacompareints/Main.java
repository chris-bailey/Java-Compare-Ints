package com.chrisbaileydeveloper.javacompareints;

import java.util.HashMap;
import java.util.Map;

/**
 * Find out if two integers are equal without using comparison operators.
 * 
 * @author Chris Bailey
 */

public class Main {
	public static void main(String[] args) {
		int x = 5;
		int y = 5;

		System.out.println("Are the two integers equal?  " + compareInts(x, y));
	}

	/**
	 * Returns true if the two integers given are equal. Returns false otherwise.
	 * 
	 * @param x the first integer value
	 * @param y the second integer value
	 * @return true if the two integers are equal, false otherwise
	 */
	public static boolean compareInts(int x, int y) {
		int z = (x - y) | (y - x); // If unequal then z will be negative.

		z = z >> 31; // All 0's in binary if equal. All 1's if unequal.

		z = ~z; // All 1's in binary if equal. All 0's if unequal.

		// Use a map to return a boolean value without comparison operators
		Map<Integer, Boolean> map = new HashMap<>();
		map.put(-1, true);
		map.put(0, false);

		return map.get(z);
	}
}
