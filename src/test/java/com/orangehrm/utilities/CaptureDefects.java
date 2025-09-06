package com.orangehrm.utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.orangehrm.genricscripts.BasePage;
import com.orangehrm.genricscripts.I_ApplicationConstants;

public class CaptureDefects extends BasePage implements I_ApplicationConstants
{
	public static void getDefect(String filename) throws Exception
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		File temp= ts.getScreenshotAs(OutputType.FILE);
		File perm= new File(screenShotsPath+filename+" "+TimeStamp.CurrentTimeStamp()+".png");
		FileHandler.copy(temp, perm);
	}

}
