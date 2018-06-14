package com.bizviz.objectrepositorylib;
import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Survey {
		
	@FindBy(xpath="//div[text()='Create Survey']")      private WebElement createsurveyLnk; 
	
	@FindBy(id="surveyTitle")     						private WebElement surveytitleTB; 
	
	@FindBy(id="surveyDescription")     				private WebElement surveydescriptionTB; 
	
	@FindBy(xpath="//button[text()='Save']")     		private WebElement saveBTN;
	
	//x-path for 5 q and save
	@FindBy(xpath="//a[text()='Questions']")            private WebElement questionTab;
	
	@FindBy(name="MULTIPLECHOICE_SINGLEANSWER")         private WebElement q1;
	
	@FindBy(name="MULTIPLECHOICE_MULTIPLEANSWER")       private WebElement q2; 
	
	@FindBy(name="PICTURES_SINGLE_ANSWER")            	private WebElement q3;
	
	@FindBy(name="PICTURES_MULTIPLE_ANSWER")            private WebElement q4;
	
	@FindBy(name="YES_NO")       					    private WebElement q5;
	
	@FindBy(xpath="//div[@id=\"createQuestionnaireHeader\"]/div[1]/div")   private WebElement qsaveBTN;
	
	//publish from survey home page
	
	 @FindBy(xpath="//input[@placeholder='Search Survey']") private WebElement searchBox;
	 
	 public List<WebElement> getPublishIcon() {
		return publishIcon;
	}

	@FindBys(@FindBy(xpath="//i[@title='Publish']"))  private  List<WebElement> publishIcon;

	 @FindBy(id="publishName") private WebElement publishNameTB;
	 
	 @FindBy(id="startDate") private WebElement startDate;
	 
	 
	

	 @FindBy(id="endDate") private WebElement endDate;

	 @FindBy(xpath="//button[text()='Create']") private WebElement CreatePublishBtn;
	 
     //wc
	 @FindBy(xpath="//i[@title='Add Weblink Collector']") private WebElement weblinkIcon;
	 
	
	@FindBy(id="collectorname") private WebElement collectornameTB;
	 
	 @FindBy(xpath="//button[text()='Create']") WebElement wlcCreateBtn;
	 
	 //mc
	 @FindBy(xpath="//i[@title='Add Email Collector']") private WebElement emailcollectorIcon;
	 
	 @FindBy(id="collectorname") private WebElement emailcollectornameTB;
	 
	 @FindBy(xpath="//button[text()='Create']") WebElement ecCreateBtn;
	 
	 //mc 2nd part
	 @FindBy(xpath="//button[text()='Add Recipients']") WebElement AddRecipientsBTN;
	 
	 
	 @FindBy(xpath="//div[@id='contactGroupBody_146997248']/div[2]/label/span") private WebElement contactBTN;
	 
	 
	 @FindBy(xpath="//input[@value='Done']") private WebElement McontactDoneBTN;
	 
	 @FindBy(id="emailSubject") private WebElement emailSubjectTB;
	 
	 @FindBy(xpath="//button[@type='submit']") private WebElement mcsubmitBTN;
	

	 
//====================================================================
		
	public WebElement getCreatesurveyLnk() {
		return createsurveyLnk;
	}

	public WebElement getQuestionTab() {
		return questionTab;
	}

	public WebElement getQ1() {
		return q1;
	}

	public WebElement getQ2() {
		return q2;
	}

	public WebElement getQ3() {
		return q3;
	}

	public WebElement getQ4() {
		return q4;
	}

	public WebElement getQ5() {
		return q5;
	}

	public WebElement getQsaveBTN() {
		return qsaveBTN;
	}

	public WebElement getSurveytitleTB() {
		return surveytitleTB;
	}

	public WebElement getSurveydescriptionTB() {
		return surveydescriptionTB;
	}

	public WebElement getSaveBTN() {
		return saveBTN;
	} 
	
	 public WebElement getSearchBox() {
			return searchBox;
		}

		public WebElement getPublishNameTB() {
			return publishNameTB;
		}

		public WebElement getStartDate() {
			return startDate;
		}

		public WebElement getEndDate() {
			return endDate;
		}

		public WebElement getCreatePublishBtn() {
			return CreatePublishBtn;
		}

		public WebElement getWeblinkIcon() {
			return weblinkIcon;
		}

		public WebElement getCollectornameTB() {
			return collectornameTB;
		}

		public WebElement getWlcCreateBtn() {
			return wlcCreateBtn;
		}

		public WebElement getEmailcollectorIcon() {
			return emailcollectorIcon;
		}

		public WebElement getEmailcollectornameTB() {
			return emailcollectornameTB;
		}

		public WebElement getEcCreateBtn() {
			return ecCreateBtn;
		}

		public WebElement getAddRecipientsBTN() {
			return AddRecipientsBTN;
		}

		public WebElement getContactBTN() {
			return contactBTN;
		}

		public WebElement getMcontactDoneBTN() {
			return McontactDoneBTN;
		}

		public WebElement getEmailSubjectTB() {
			return emailSubjectTB;
		}

		public WebElement getMcsubmitBTN() {
			return mcsubmitBTN;
		}

	
	 
}
