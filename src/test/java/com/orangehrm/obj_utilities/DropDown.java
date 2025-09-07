package com.orangehrm.obj_utilities;

import java.awt.List;

import org.openqa.selenium.WebElement;

public class DropDown 
{
	static WebElement Option;
	static List ListOfOptions;
	//selectOptions
	public static void selectDropdown(WebElement element, Object val)
	{
		if(val instanceof String)
		{
			try
			{
				objects_Utilities.HandlingDropdown(element).selectByValue((String) val);
			}
			catch(Exception e)
			{
				objects_Utilities.HandlingDropdown(element).selectByVisibleText((String) val);
			}
		}
		
	//deselectOptions
	public static void deSelect(WebElement element)
	{
		objects_Utilities.HandlingDropdown(element).deselectAll();
	}
	public static void deSelect(WebElement element, Object val)
	{
		if(val instanceof String)
		{
			try
			{
				objects_Utilities.HandlingDropdown(element).deselectByValue((String) val);
			}
			catch(Exception e)
			{
				objects_Utilities.HandlingDropdown(element).deselectByVisibleText((String) val);
			}
		}
		else if(val instanceof Integer)
		{
			objects_Utilities.HandlingDropdown(element).deselectByIndex((int) val);
		}
	}
	//fetchOptions
	//getOptions()
	//getFirstSelectedOption()
	//getAllSelectedOptions()
	  public static void readOptions(WebElement element, String val)
	  {
		 switch(val)
		 {
		 case "FirstSelected": Option = objects_Utilities.HandlingDropdown(element).getFirstSelectedOption();
		    break;
		    
		 case "AllSelected": ListOfOptions = (List) objects_Utilities.HandlingDropdown(element).getAllSelectedOptions();
		    break;
		    
		 case "AllOptions": ListOfOptions = (List) objects_Utilities.HandlingDropdown(element).getOptions();
		    break;
		    
		 default:System.out.println("Invalid Input");
		    break;
		 
		 }
	  }
	}

}
