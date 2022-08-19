/**
 * 
 */
package com.store.pagesobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.store.actiondriver.Action;
import com.store.base.BaseClass;

/**
 * @author PINOCHETREBOR
 *
 */
public class AccountCreatePage extends BaseClass{
	
	@FindBy(xpath = "//h1[text()='Create an account']")
	WebElement formTitle;
	
	public AccountCreatePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateAccountCreatePage() throws Throwable {
		return Action.isDisplayed(driver, formTitle);
	}
	
}
