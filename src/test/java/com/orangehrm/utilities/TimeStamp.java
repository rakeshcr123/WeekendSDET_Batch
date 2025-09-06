package com.orangehrm.utilities;

import java.util.Date;

public class TimeStamp 
{
	public static String CurrentTimeStamp()
	{
		Date date= new Date();
		String formatDate= date.toString();
		String actualDate= formatDate.replace(":", "-");
		return actualDate;
	}

}
