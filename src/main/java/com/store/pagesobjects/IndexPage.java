package com.store.pagesobjects;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.store.base.BaseClass;
import com.store.actiondriver.Action;

import org.openqa.selenium.WebElement;

public class IndexPage extends BaseClass{
	@FindBy(xpath = "//a[@class='login']")
	WebElement signInBtn;
	
	@FindBy(xpath = "//img[@class='logo img-responsive']")
	WebElement storeLogo;
	
	@FindBy(id = "search_query_top")
	WebElement searchProductBox;
	
	@FindBy(name = "submit_search")
	WebElement searchButton;
	
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickOnSignIn() throws Throwable {
		Action.click(driver, signInBtn); 
		return new LoginPage();
	}

	public boolean validateLogo() throws Throwable {
		return Action.isDisplayed(driver, storeLogo);
	}
	
	public String getStoreTitle() throws Throwable {
		String storeTitle1 = driver.getTitle();
		return storeTitle1;
	}
	
	public SearchResultPage searchProduct(String productName) {
		Action.type(searchProductBox, productName);
		Action.click(driver, searchButton);
		return new SearchResultPage();
	}
	
	
}