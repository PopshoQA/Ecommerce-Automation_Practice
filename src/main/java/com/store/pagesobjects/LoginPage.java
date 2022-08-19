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
public class LoginPage extends BaseClass{

	@FindBy(id = "email")
	WebElement username;
	
	@FindBy(name = "passwd")
	WebElement password;

	@FindBy(id = "submitLogin")
	WebElement signInBtn;
	
	@FindBy(id = "email_create")
	WebElement emailForNewAccount;
	
	@FindBy(id = "submitCreate")
	WebElement createNewAccountBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage Login(String uname, String pswd) throws Throwable {
		Action.type(username, uname);
		Action.type(password, pswd);
		Action.click(driver, signInBtn);
		return new HomePage();
	}
	
	public AddressPage loginDelivery(String uname, String pswd) throws Throwable {
		Action.type(username, uname);
		Action.type(password, pswd);
		Action.click(driver, signInBtn);
		return new AddressPage();
	}

	public AccountCreatePage createNewAccount(String newEmail) throws Throwable {
		Action.type(emailForNewAccount, newEmail);
		return new AccountCreatePage();
	}
}

