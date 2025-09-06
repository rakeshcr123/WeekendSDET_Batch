package com.orangehrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.orangehrm.utilities.PageInitializer;

public class LoginPageObjects extends PageInitializer
{
	//Declaration
	@FindBy(name = "username")
	private WebElement usnTf;
	@FindBy(name = "password")
	private WebElement pswTf;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;
	
	public LoginPageObjects(WebDriver driver)
	{
		super(driver);
	}
	public void enterUsn(String usn)
	{
		usnTf.sendKeys(usn);
	}
	public void enterPsw(String psw)
	{
		pswTf.sendKeys(psw);
	}
	public void clickLoginBtn()
	{
		loginBtn.click();
	}

}
