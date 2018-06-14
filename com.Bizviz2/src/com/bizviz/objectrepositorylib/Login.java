package com.bizviz.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bizviz.genericlib.WebdrivercommonUtils;

public class Login {
	
	WebdrivercommonUtils wLib = new WebdrivercommonUtils();
	//Web elements locator   
		@FindBy(id="userid")
	     private WebElement userEdt; 
		
		@FindBy(name="password")
	    private WebElement passwordEdt; 

		@FindBy(xpath="//button[text()='Login']")
	    private WebElement loginBtn; 
		
		
		@FindBy(xpath="//label[text()='Bizviz']")
		private WebElement spaceBtn;
		
		public WebElement getLoginBtn() {
			return loginBtn;
		}
		
		
		public WebElement getSpaceBtn() {
			return spaceBtn;
		}

		
		//business Libraries         
		public void login() {
			userEdt.sendKeys("archana.ms@bdbizviz.com");
			passwordEdt.sendKeys("8dhHac");
			loginBtn.click();
			//spaceBtn.click();
		}
		
		public void login(String username, String password) {
			userEdt.sendKeys(username);
			passwordEdt.sendKeys(password);
			loginBtn.click();
			//spaceBtn.click();
		}
		

}
