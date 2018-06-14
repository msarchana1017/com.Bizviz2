package com.bizviz.objectrepositorylib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.bizviz.genericlib.WebdrivercommonUtils;

public class Home {
	
	@FindBy(xpath="//md-icon[text()='apps']")
    private WebElement appIcon; 
	
	@FindBy(xpath="//div[text()='Survey']")
    private WebElement surveyIcon; 
	
	@FindBy(xpath="//div[text()='Sentiments']")
    private WebElement sentimentsIcon; 
	

		public WebElement getAppIcon() {
			return appIcon;
		}

		public WebElement getSurveyIcon() {
			return surveyIcon;
		}
        

		public WebElement getSentimentsIcon() {
		return sentimentsIcon;
		}

		
	//navigate to survey page
     public void navigateToSurveyPage() throws InterruptedException
     {
       	 WebdrivercommonUtils wlib = new WebdrivercommonUtils();
 		 wlib.waitForElemnet(appIcon);
 		 Thread.sleep(5000);
 		 appIcon.click();
 		 surveyIcon.click();
     }
     
     public void navigateTosentimentsPage() throws InterruptedException
     {
       	 WebdrivercommonUtils wlib = new WebdrivercommonUtils();
 		 wlib.waitForElemnet(appIcon);
 		 Thread.sleep(5000);
 		 appIcon.click();
 		sentimentsIcon.click();
     }
     
    	
}
