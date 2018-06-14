package com.bizviz.survey;

import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bizviz.genericlib.FileDataUtiles;
import com.bizviz.genericlib.WebdrivercommonUtils;
import com.bizviz.genericlib.BaseClass;
import com.bizviz.objectrepositorylib.Home;
import com.bizviz.objectrepositorylib.Survey;

public class SurveyTest extends BaseClass{
	FileDataUtiles file = new FileDataUtiles();
    WebdrivercommonUtils wLib = new WebdrivercommonUtils();
	Survey sp= PageFactory.initElements(driver,Survey.class);
    @Test
	public void createSurveyTest() throws Throwable
    {
    	Home hp= PageFactory.initElements(driver,Home.class);
    	hp.navigateToSurveyPage();
        //Window handle 
       	Set<String> set=driver.getWindowHandles();
    	System.out.println(set.size());
    	Iterator<String> it=set.iterator();
    	String Pid=it.next();
    	String surveycid=it.next();
    	//pass parent control to child window control
    	driver.switchTo().window(surveycid);
    	String Actualtitle="BizViz Survey";	
    	String ExpectedTitle=driver.getTitle();
    	System.out.println(ExpectedTitle);
    	if(Actualtitle.contains(ExpectedTitle))
    	{
		System.out.println("Pass Survey page is opened");
    	}
    	else
    	{
		System.out.println("Fail Survey page is not opened");
    	}
	    //create survey
    
      	Thread.sleep(5000);
      	
    	sp.getCreatesurveyLnk().click();
    	sp.getSurveytitleTB().sendKeys("Survey");
    	sp.getSurveydescriptionTB().sendKeys("hi");
    	sp.getSaveBTN().click();
    	
        //add 5q and save
    	sp.getQ1().click();
    	sp.getQuestionTab().click();;
    	sp.getQ2().click();
    	sp.getQuestionTab().click();;
    	sp.getQ3().click();;
    	sp.getQuestionTab().click();;
    	sp.getQ4().click();;
    	sp.getQuestionTab().click();;
    	sp.getQ5().click();
    	Thread.sleep(3000);
        sp.getQsaveBTN().click();
        
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().back();
        
    }
    
    @Test
	public void PublishSurvey() throws InterruptedException
	{
		/* search survey*/
    	    sp.getSearchBox().sendKeys("Survey1");
	   	    Thread.sleep(3000);
	   	    
		   /*click on publish*/
	   	    sp.getPublishIcon();
		   List<WebElement> Publishbtn = driver.findElements(By.xpath("//i[@title='Publish']"));
		   Publishbtn.get(0).click();
		  
		   Thread.sleep(3000);
		   /*inside surveyicon*/
		   //driver.findElement(By.xpath("//div[text()='Publish']")).click();
		   
		   /* Start Publish enter all mandatory fields to create publisher*/
		   
		   Thread.sleep(3000);
		   driver.findElement(By.id("publishName")).sendKeys("P1");
		   Thread.sleep(3000);
		   
		   /*select start date*/
		   driver.findElement(By.id("startDate")).click();
		   Thread.sleep(3000);
		   System.out.println("date");
		   Calendar today = Calendar.getInstance();
		   // If you want the day/month in String format  
		   String date = today.get(Calendar.DATE)+"";
		   System.out.println(date);
		   driver.findElement(By.linkText(date)).click();
		   System.out.println("Success selected start date ");
		   System.out.println("Success ");

		   
			/*select enddate*/  
		   driver.findElement(By.id("endDate")).click();
		   System.out.println("Success ");
		   String edate = today.get(Calendar.DATE)+"";
		   System.out.println(edate);
		   driver.findElement(By.linkText(edate)).click();
		   System.out.println("Success selected end date ");
		  
		   /*click on Submit button*/
		   driver.findElement(By.xpath("//button[text()='Create']")).click();
		   System.out.println("publisher created Successfully");
		   
		   /*wc*/
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//i[@title='Add Weblink Collector']")).click();
		   driver.findElement(By.id("collectorname")).sendKeys("wc");;
		   driver.findElement(By.xpath("//button[text()='Create']")).click();
		   
		   /*mc*/
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//i[@title='Add Email Collector']")).click();
		   driver.findElement(By.name("emailcollectorname")).sendKeys("mc");
		   driver.findElement(By.xpath("//button[text()='Create']")).click();
		   Thread.sleep(3000);
		   /*click on add recipient */
		   driver.findElement(By.xpath("//button[text()='Add Recipients']")).click();
		   Thread.sleep(3000);
		   /*select all contacts*/
		   driver.findElement(By.xpath("//div[@id='contactGroupBody_150306816']/div[2]/label/span")).click();
		   Thread.sleep(3000);
		   /*click on done*/
		   driver.findElement(By.xpath("//input[@value='Done']")).click();
		   driver.findElement(By.id("emailSubject")).sendKeys("hi");
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		   System.out.println("nandita successfully sent mails");
		   
	}
	
	
}
	
	

