package com.orangehrm.genricscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.orangehrm.pageobjects.DashBoardPageObjects;
import com.orangehrm.pageobjects.LoginPageObjects;
import com.orangehrm.pageobjects.PIMPageObjects;
import com.orangehrm.utilities.ReadPropertyFIle;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage //pascal-case
{
	//String browserName= "chrome";
	public static WebDriver driver;
	public LoginPageObjects lp;
	public DashBoardPageObjects db;
	public PIMPageObjects pim;
	
	@BeforeClass
	@Parameters("browserName")
	public void initBrowser(String browserName) //camel-case
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		
		switch(browserName.trim().toLowerCase())
		{
		case "chrome":driver= new ChromeDriver();
		    break;
		case "fire":driver= new FirefoxDriver();
	        break;
		case "edge":driver= new EdgeDriver();
	        break;
	    default:System.out.println("===Invalid Browser===");
		}
	}
	@BeforeMethod
	public void launchApplication() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url=ReadPropertyFIle.readData("testUrl");
		driver.get(url);
		lp= new LoginPageObjects(driver);
		db= new DashBoardPageObjects(driver);
		pim= new PIMPageObjects(driver);
		login();
	}
	@AfterMethod
	public void logout()
	{
		db.profileMenu();
		db.logoutOption();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	public void login() throws Exception
	{
		String usn=ReadPropertyFIle.readData("testUsn");
		String psw=ReadPropertyFIle.readData("testPsw");
		lp.enterUsn(usn);
		lp.enterPsw(psw);
		lp.clickLoginBtn();
	}

}
