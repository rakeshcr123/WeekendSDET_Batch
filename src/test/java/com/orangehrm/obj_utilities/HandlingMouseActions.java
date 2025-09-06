package com.orangehrm.obj_utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingMouseActions 
{
	public static void rightClick(WebElement element, WebDriver driver)
	{
		objects_Utilities.MouseActions(driver).contextClick(element).perform();
	}
	public static void doubleClick(WebElement element, WebDriver driver)
	{
		objects_Utilities.MouseActions(driver).doubleClick(element).perform();
	}
	public static void mouseHover(WebElement element, WebDriver driver)
	{
		objects_Utilities.MouseActions(driver).moveToElement(element).perform();
	}
	public static void dragAndDrop(WebElement src, WebElement dst, WebDriver driver)
	{
		objects_Utilities.MouseActions(driver).dragAndDrop(src, dst).perform();
	}
	public static void clickAndHold(WebElement element, WebDriver driver)
	{
		objects_Utilities.MouseActions(driver).clickAndHold(element).perform();
	}
	public static void release(WebElement element, WebDriver driver)
	{
		objects_Utilities.MouseActions(driver).release(element).perform();
	}

}
