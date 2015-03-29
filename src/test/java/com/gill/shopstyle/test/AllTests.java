package com.gill.shopstyle.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ InvalidLoginMsgTest.class, InvalidSubEmailTest.class,
		ProductPageTest.class })
public class AllTests {

}
