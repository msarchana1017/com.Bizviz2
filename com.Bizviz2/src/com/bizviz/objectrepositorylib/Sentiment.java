package com.bizviz.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sentiment {
	@FindBy(xpath="//div[@id='maincontent']/nav/div/ul/li/a")      private WebElement SentimentBtn; 
	
	@FindBy(xpath="//iframe[@src='textanalyzer-home.html']")  private WebElement Frame1;
	
	@FindBy(xpath="//iframe[@src='../../views/textanalyzerchart/fileTextAnalysis.html?refer=1']")  private WebElement Frame2;
		
	public WebElement getFrame2() {
		return Frame2;
	}

	public WebElement getFrame1() {
		return Frame1;
	}

	@FindBy(xpath="//a[text()='Upload']")      private WebElement UploadTab;
		
	@FindBy(id="input-4")      private WebElement BrowseBTN;
	
	@FindBy(xpath="//div[@id='bizDialog']/div/div/div[1]/button")  private WebElement CloseBTN;

	public WebElement getSentimentBtn() {
		return SentimentBtn;
	}

	public WebElement getUploadTab() {
		return UploadTab;
	}

	public WebElement getBrowseBTN() {
		return BrowseBTN;
	}

	public WebElement getCloseBTN() {
		return CloseBTN;
	}
		

}