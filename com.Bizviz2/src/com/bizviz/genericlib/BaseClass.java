package com.bizviz.genericlib;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import com.bizviz.objectrepositorylib.Common;
import com.bizviz.objectrepositorylib.Login;

public class BaseClass {
	
	//global driver Object declaration 
	public static WebDriver driver;
	
	//To Access Data from FileDataUtiles
	FileDataUtiles file = new FileDataUtiles();
	
	//to access logout 
	WebdrivercommonUtils wLib = new WebdrivercommonUtils();
	
	@BeforeClass
	public void configBC() throws Throwable {
		System.out.println("=========launch browser======");
		Properties pObj = file.getPropertiesFileObj();
		String browserName  = pObj.getProperty("browser");
		if(browserName.equals("firefox")) {
		   driver = new FirefoxDriver();
		}else if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "./resource/IEDriverserver.exe");
			driver = new InternetExplorerDriver();
		}
		//to access data from property file
		 String username =pObj.getProperty("username");
	     String password = pObj.getProperty("password");
	     String url =pObj.getProperty("url");
	     driver.manage().window().maximize();
	     
	     System.out.println("login");
         wLib.waitForPageToLoad();
       
        driver.get(url);
        Login lp = PageFactory.initElements(driver, Login.class);
       
        lp.login(username, password);

	}	

	
	@AfterClass
	public void configAC() throws Throwable {
		
		System.out.println("logout");
		Common cPage = PageFactory.initElements(driver, Common.class);
		cPage.logout();
		System.out.println("logout sucessfully");
		System.out.println("=====close browser========");
		driver.close();
	}
}


