/**
 * 
 */
package com.store.pagesobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.store.base.BaseClass;

/**
 * @author PINOCHETREBOR
 *
 */
public class OrderConfirmationPage extends BaseClass{
	
	@FindBy(xpath="//p/strong[contains(text(),'Your order on My Store is complete')]")
	WebElement confirmMessag;
	
	public OrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateConfirmMessag() {
		 String confirmMsg=confirmMessag.getText();
		 return confirmMsg;
	}
}
