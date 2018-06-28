package com.bizviz.survey;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import com.bizviz.genericlib.FileDataUtiles;
import com.bizviz.genericlib.WebdrivercommonUtils;
import com.bizviz.genericlib.BaseClass;
import com.bizviz.objectrepositorylib.Home;
import com.bizviz.objectrepositorylib.Survey;

public class ST2 extends BaseClass{
	FileDataUtiles file = new FileDataUtiles();
    WebdrivercommonUtils wLib = new WebdrivercommonUtils();
    
    @Test(priority=1)
	public void createSurveyTest() throws Throwable
    {
    	Survey sp= PageFactory.initElements(driver,Survey.class);
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
     	Assert.assertEquals(Actualtitle, ExpectedTitle);
    	Reporter.log(ExpectedTitle +"displayed",true);
    	
    	Thread.sleep(5000);
       	sp.getCreatesurveyLnk().click();
    	sp.getSurveytitleTB().sendKeys("Survey");
    	sp.getSurveydescriptionTB().sendKeys("hi");
    	sp.getSaveBTN().click();
    	
    	Thread.sleep(5000);
        //add 5q and save
    	sp.getQ1().click();      	sp.getQuestionTab().click();
    	sp.getQ2().click();      	sp.getQuestionTab().click();
    	sp.getQ3().click();        	sp.getQuestionTab().click();
    	sp.getQ4().click();     	sp.getQuestionTab().click();
    	sp.getQ5().click();
       	Thread.sleep(8000);
        sp.getQsaveBTN().click();
        
        Thread.sleep(2000);  
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(3000);
        Reporter.log("Successfully created survey",true); 
     }
    
    @Test(priority=2) 
	public void PublishSurvey() throws Throwable
	{
    	Thread.sleep(5000);
      	Survey sp1= PageFactory.initElements(driver,Survey.class);
    	
    	/* search survey*/
    	    sp1.getSearchBox().sendKeys("Survey");
	   	    Thread.sleep(3000);
	   	    
		   /*click on publish*/
	   	    sp1.getPublishIcon().get(0).click();
		   Thread.sleep(3000);
		   sp1.getPublishNameTB().sendKeys("publisher");
		 
		   
		   /*select start date*/
		   Thread.sleep(3000);
		   sp1.getStartDate().click();
		   System.out.println("Success:click on start date ");
		   Thread.sleep(3000);
		   System.out.println("date");
		   Calendar today = Calendar.getInstance();
		   // If you want the day/month in String format  
		   String date = today.get(Calendar.DATE)+"";
		   //System.out.println(date);
		   driver.findElement(By.linkText(date)).click();
		   System.out.println("Success selected start date ");
	    	/*select enddate*/  
		   sp1.getEndDate().click();
		   System.out.println("Success:click on end date ");
		   String edate = today.get(Calendar.DATE)+"";
		   //System.out.println(edate);
		   driver.findElement(By.linkText(edate)).click();
		   System.out.println("Success selected end date ");
		   sp1.getCreatePublishBtn().click();
		   System.out.println("publisher created Successfully");
		   
		   /*wc*/
		   Thread.sleep(3000);
		   sp1.getWeblinkIcon().click();
		   sp1.getCollectornameTB().sendKeys("wc");
		   System.out.println("entered collector name Successfully");
		   sp1.getWlcCreateBtn().click();
		   System.out.println("Weblink collector created Successfully");
		   
		   /*mc*/
		   Thread.sleep(3000);
		   sp1.getEmailcollectorIcon().click();
		   Thread.sleep(3000);
		   sp1.getEmailcollectornameTB().sendKeys("mc");
		   System.out.println("entered collector name Successfully");
		   sp1.getEcCreateBtn().click();
		   System.out.println("mail collector created Successfully");
			 
		   //after creating email collector
		   
		   Thread.sleep(3000);
		   /*click on add recipient */
		   sp1.getAddRecipientsBTN().click();
		   Thread.sleep(3000);
		   
		   /*select  check box of contact group */
		   sp1.getContactBTN().click();

		   Thread.sleep(3000);
		   /*click on done*/
		   sp1.getMcontactDoneBTN().click();
		   sp1.getEmailSubjectTB().sendKeys("pls take survey");
		   Thread.sleep(5000);
		   sp1.getMcsubmitBTN().click();
		   Reporter.log("successfully sent mails and published survey ",true);
		   driver.navigate().refresh();
		  
		   
	}
	
	
}
	
	

