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
public class ShippingPage extends BaseClass{
	
	@FindBy(id="cgv")
	WebElement terms; 
	
	@FindBy(xpath = "//button//span[contains(text(),'Proceed to Checkout')]")
	WebElement proceedToCheckoutBtn;
	
	public ShippingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkTheTerms() {
		Action.click(driver, terms);
	}
	
	public PaymentPage clickOnProceedToCheckout() throws Throwable {
		Action.click(driver, proceedToCheckoutBtn);
		return new PaymentPage();
	}
}
