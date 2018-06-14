package com.bizviz.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bizviz.genericlib.WebdrivercommonUtils;

public class Common extends WebdrivercommonUtils{

	
	@FindBy(xpath="//md-icon[text()='account_circle']")
	private WebElement logoutImg;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement logoutLnk;
	
	
	public void logout() throws Throwable {
		
		Thread.sleep(5000);
        logoutImg.click();	
        Thread.sleep(5000);
        logoutLnk.click();
	}
}
