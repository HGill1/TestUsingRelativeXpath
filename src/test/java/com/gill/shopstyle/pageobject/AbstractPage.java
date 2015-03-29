package com.gill.shopstyle.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {

	protected WebDriver driver;
	public int DRIVER_WAIT = 10; 
	
	public AbstractPage(WebDriver driver) {
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver,
				DRIVER_WAIT);
		PageFactory.initElements(finder, this);
		this.driver = driver;

	}
	
	public WebElement waitForElementToVisible(WebElement element,
			int maxTime) {		
		
		WebDriverWait wait =  new WebDriverWait(driver, maxTime);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public boolean waitForTextToVisible(WebElement element,
			int maxTime, String text) {		
		
		WebDriverWait wait =  new WebDriverWait(driver, maxTime);
		return wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}
	
	public HomePage navigateToTestSite() {

		driver.navigate().to("http://www.shopstyle.com/page/NewsletterSignUp");
		return PageFactory.initElements(driver, HomePage.class);
	}

	public void closeDriver() {
		driver.close();
	}
}
