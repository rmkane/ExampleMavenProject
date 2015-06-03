package com.example.app;

import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	private static final Pattern UUID_PATTERN;
	
	static {
		String regex = "[0-9a-f]{8}(?:-[0-9a-f]{4}){3}-[0-9a-f]{12}";
		UUID_PATTERN = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	}
	
	private String uuid;
	
	public String getUuid() {
		return this.uuid;
	}
	
	@Before
	public void setup() {
		App obj = new App();
		
		uuid = obj.generateUniqueKey();
	}
	
	@Test
	public void testLengthOfTheUniqueKey() {
		Assert.assertEquals(36, this.getUuid().length());
	}
	
	@Test
	public void testFormatOfTheUniqueKey() {
		Assert.assertTrue(UUID_PATTERN.matcher(this.getUuid()).matches());
	}
}
