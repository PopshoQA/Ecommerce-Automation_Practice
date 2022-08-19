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
public class AddToCartPage extends BaseClass {
	@FindBy(id="quality_wanted")
	WebElement quality;
	
	@FindBy(name="group_1")
	WebElement size;

	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addToCartBtn;

	@FindBy(xpath="//*[@id=\"layer_cart\"]//h2/i")
	WebElement addToCartMessage;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedToCheckoutBtn;
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectQuality(String quality1) throws Throwable {
		Action.type(quality, quality1);
	}
	
	public void selectSize(String size1) throws Throwable {
		Action.selectByVisibleText(size, size1);
	}
	
	public void clickOnAddToCart() throws Throwable {
		Action.click(driver, addToCartBtn);
	}
	
	public boolean validateAddToCart() throws Throwable {
		return Action.isDisplayed(driver, addToCartMessage);
	}
	
	public OrderPage clickOnCheckout() throws Throwable {
		Action.JSClick(driver, proceedToCheckoutBtn);
		return new OrderPage();
	}
}
