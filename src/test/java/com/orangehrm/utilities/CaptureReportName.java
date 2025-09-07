package com.orangehrm.utilities;

import com.orangehrm.genricscripts.BasePage;
import com.orangehrm.genricscripts.I_ApplicationConstants;

public class CaptureReportName extends BasePage implements I_ApplicationConstants
{
	public static String getReportName() throws Exception
	{
		String reportName = TimeStamp.CurrentTimeStamp()+".html";
		return reportName;
	}

}
