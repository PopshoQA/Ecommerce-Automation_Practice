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
public class AddressPage extends BaseClass{
	
	@FindBy(xpath="//span[text()='proceed to checkout']")
	WebElement proceedToCheckout;
	
	public AddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public ShippingPage clickOnCheckou() {
		Action.click(driver, proceedToCheckout);
		return new ShippingPage();
	}
	
	
}
