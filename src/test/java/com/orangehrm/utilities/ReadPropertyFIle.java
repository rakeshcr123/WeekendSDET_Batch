package com.orangehrm.utilities;

import java.io.FileInputStream;
import java.util.Properties;

import com.orangehrm.genricscripts.I_ApplicationConstants;

public class ReadPropertyFIle implements I_ApplicationConstants
{
	public static String readData(String key) throws Exception
	{
		FileInputStream fis= new FileInputStream(propertyPath);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
				
	}

}
