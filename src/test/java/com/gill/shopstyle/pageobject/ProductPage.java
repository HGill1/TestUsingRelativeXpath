package com.gill.shopstyle.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends AbstractPage {

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='search-header-content']/descendant::h1")
	private WebElement catTitle;

	public boolean getCatTitle() {
		waitForElementToVisible(catTitle,DRIVER_WAIT);
		return catTitle.getText().contains("Shoes");
	}

}
