package com.gill.shopstyle.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gill.shopstyle.pageobject.HomePage;


public class AbstractTest {
	protected static WebDriver driver;
	protected HomePage onHomePage;

	@Before
	public void testSet() throws Exception {
		driver = new FirefoxDriver();
		onHomePage = new HomePage(driver);
		onHomePage = onHomePage.navigateToTestSite();
	}

	@After
	public void shutDown() throws Exception {
		driver.quit();
	}
	

}
