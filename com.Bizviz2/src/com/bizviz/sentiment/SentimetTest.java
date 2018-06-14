package com.bizviz.sentiment;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.bizviz.genericlib.BaseClass;
import com.bizviz.genericlib.FileDataUtiles;
import com.bizviz.genericlib.WebdrivercommonUtils;
import com.bizviz.objectrepositorylib.Home;
import com.bizviz.objectrepositorylib.Sentiment;

public class SentimetTest extends BaseClass {
	FileDataUtiles file = new FileDataUtiles();
    WebdrivercommonUtils wLib = new WebdrivercommonUtils();

	
	@Test
	public void CreateSentimentUsingExcel() throws IOException, InterruptedException
	{
		
		Home hp= PageFactory.initElements(driver,Home.class);
		try {
		hp.navigateTosentimentsPage();
		}
		catch (InterruptedException e) 
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

	Sentiment sep= PageFactory.initElements(driver,Sentiment.class);
	wLib.waitForPageToLoad();
	Thread.sleep(3000);
	
	WebElement f1=sep.getFrame1();
	driver.switchTo().frame(f1);
	sep.getSentimentBtn().click();

	
	
	WebElement f2=sep.getFrame2();
	driver.switchTo().frame(f2);
	Thread.sleep(8000);
	sep.getUploadTab().click();
	//driver.switchTo().defaultContent();
	
	//wLib.waitForElemnetAndClick(sep.getBrowseBTN());
	Thread.sleep(8000);
	sep.getBrowseBTN().click();
	Runtime.getRuntime().exec("C:\\Users\\siri\\Desktop\\sentimentexcel.exe");
	
	Thread.sleep(5000);
	driver.switchTo().defaultContent();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(f1);
	Actions actions=new Actions(driver);
	actions.moveToElement(sep.getCloseBTN()).perform();
	sep.getCloseBTN().click();

	}
}
