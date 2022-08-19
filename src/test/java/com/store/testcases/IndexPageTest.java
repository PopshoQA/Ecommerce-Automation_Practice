/**
 * 
 */
package com.store.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.store.base.BaseClass;
import com.store.pagesobjects.IndexPage;

/**
 * @author PINOCHETREBOR
 */
public class IndexPageTest extends BaseClass{
	
	IndexPage indexPage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void verifyLogo() throws Throwable {
		indexPage = new IndexPage();
		boolean result=indexPage.validateLogo();
		Assert.assertTrue(result);
	}
	@Test
	public void verifyTitle() throws Throwable {
		String actTitle=indexPage.getStoreTitle();
		Assert.assertEquals(actTitle, "My Store");
	}
}
