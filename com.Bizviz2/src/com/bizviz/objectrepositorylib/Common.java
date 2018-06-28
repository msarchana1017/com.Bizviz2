package com.bizviz.objectrepositorylib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bizviz.genericlib.BaseClass;
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
	
public static void windowHandle() throws Throwable {
		
	 //Window handle 
   	Set<String> set= BaseClass.driver.getWindowHandles();
	System.out.println(set.size());
	Iterator<String> it=set.iterator();
	String Pid=it.next();
	String surveycid=it.next();
   	//pass parent control to child window control
	BaseClass.driver.switchTo().window(surveycid);
	}
	
	
}
