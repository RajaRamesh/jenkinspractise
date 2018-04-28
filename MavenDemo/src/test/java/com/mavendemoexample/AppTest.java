package com.mavendemoexample;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Maven Demo.
 */
public class AppTest {
	
	@Test
	public void testApp() {
		App appObject = new App();
		Assert.assertEquals(appObject.reverseString("Testing!"), "!gnitseT");
	}
}
