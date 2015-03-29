package com.gill.shopstyle.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InvalidLoginMsgTest extends AbstractTest {

	/*@Before
	public void setUp() throws Exception {
		onHomePage = onHomePage.navigateToTestSite();
	}*/

	/*@After
	public void tearDown() throws Exception {
		driver.close();
	}*/

	@Test
	public void test() {
		assertTrue(onHomePage.invalidUserNameMsg());
	}


}
