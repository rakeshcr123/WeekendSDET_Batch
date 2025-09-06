package com.orangehrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.orangehrm.utilities.PageInitializer;

public class DashBoardPageObjects extends PageInitializer
{
	@FindBy(className = "oxd-userdropdown-img")
	private WebElement profileMenu;
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutOption;
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement PimBtn;
	
	public DashBoardPageObjects(WebDriver driver)
	{
		super(driver);
	}
	public void profileMenu()
	{
		profileMenu.click();
	}
	public void logoutOption()
	{
		logoutOption.click();
	}
	public void PimBtn()
	{
		PimBtn.click();
	}

}
