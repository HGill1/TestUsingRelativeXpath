package com.gill.shopstyle.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends AbstractPage {	

	@FindBy(xpath = "//div[@class='newsletter-sign-up']/descendant::input[@name='email']")
	private WebElement emailId;
	
	@FindBy(xpath = "//input[@value='Subscribe']")
	private WebElement btnSubscribe;
	
	@FindBy(className = "error-message")
	private WebElement errorMsg;
	
	@FindBy(xpath = "//a[@ng-click = 'login.showLoginModal()']")
	private WebElement loginLink;
	
	@FindBy(xpath = "//div[@class='enter-info-container']/descendant::input[@name='handle']")
	private WebElement username;
	
	@FindBy(xpath = "//div[@class='enter-info-container']/descendant::input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//div[@class='enter-info-container']/descendant::button")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//div[@class='enter-info-container']/descendant::div[@class='error']")
	private WebElement invalidLoginMsgError;
	
	@FindBy(xpath = "//select[@ng-model = 'categoryId']")
	private WebElement catDropDown;
	
	@FindBy(id = "search")
	private WebElement searchBox;
	
	@FindBy(className = "icon-search")
	private WebElement btnSearch;
	
	public HomePage(WebDriver driver) {
		super(driver);			
	}
	
	public boolean clickOnSignUpButton(){
		emailId.sendKeys("testing");
		btnSubscribe.click();		
		return errorMsg.getText().contains("invalid email");	
	}
	
	public boolean invalidUserNameMsg(){
		
		loginLink.click();
		username.sendKeys("Hello");
		password.sendKeys("hello");
		btnLogin.click();
		return waitForTextToVisible(invalidLoginMsgError,DRIVER_WAIT,"Invalid username or password.");			
	}
	
	public ProductPage showCatPage(){
		Select dropdown = new Select(catDropDown);
		dropdown.selectByVisibleText("Men");
		searchBox.sendKeys("shoes");
		btnSearch.click();
		return PageFactory.initElements(driver, ProductPage.class);
		
	}

}
