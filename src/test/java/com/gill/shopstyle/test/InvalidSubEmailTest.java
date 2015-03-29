package com.gill.shopstyle.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InvalidSubEmailTest extends AbstractTest {

	
	@Test
	public void test() {
		assertTrue(onHomePage.clickOnSignUpButton());
	}

}
