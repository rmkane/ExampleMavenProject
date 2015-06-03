package com.example.app;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void testLengthOfTheUniqueKey() {
		App obj = new App();

		Assert.assertEquals(36, obj.generateUniqueKey().length());
	}
}
