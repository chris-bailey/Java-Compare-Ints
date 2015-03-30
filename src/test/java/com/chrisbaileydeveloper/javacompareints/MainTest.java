package com.chrisbaileydeveloper.javacompareints;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.chrisbaileydeveloper.javacompareints.Main;

public class MainTest {

	@Test
	public void testCompareInts() {
		// Test for equality of 3 and 3.
		assertTrue(Main.compareInts(3, 3));

		// Test for inequality of 3 and 5.
		assertFalse(Main.compareInts(3, 5));

		// Test special case: Integer overflow
		int highest = Integer.MAX_VALUE;
		int lowest = Integer.MIN_VALUE;
		assertFalse(Main.compareInts(highest, lowest));
	}
}
