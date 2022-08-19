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
public class HomePage extends BaseClass{

	@FindBy(xpath="//span[text()='My wishlist']")
	WebElement myWishList;
	
	@FindBy(xpath="//span[text()='Order history and details']")
	WebElement orderHistory;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateMyWishlist() throws Throwable {
		return Action.isDisplayed(driver, myWishList);
	}
	
	public void validateOrderHistory() throws Throwable {
		Action.isDisplayed(driver, orderHistory);
	}
}
