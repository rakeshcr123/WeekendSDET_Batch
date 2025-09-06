package com.orangehrm.obj_utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollActions 
{
	public static void scrollIntoElement(WebDriver driver, WebElement ele)
	{
		objects_Utilities.JavaScriptExecutor(driver).executeScript("arguments[0].scrollIntoView()", ele);
	}
	public static void scrollIntoElement(WebDriver driver, WebElement ele, int x, int y)
	{
		objects_Utilities.JavaScriptExecutor(driver).executeScript("window.scrollBy("+x+","+y+")");
	}
	public static void scrollBottomOfPage(WebDriver driver)
	{
		objects_Utilities.JavaScriptExecutor(driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	public static void scrollIntoElement(WebDriver driver)
	{
		objects_Utilities.JavaScriptExecutor(driver).executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
