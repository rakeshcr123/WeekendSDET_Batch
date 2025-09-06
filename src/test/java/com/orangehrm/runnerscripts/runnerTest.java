package com.orangehrm.runnerscripts;

import org.testng.annotations.Test;

import com.orangehrm.genricscripts.BasePage;
import com.orangehrm.utilities.ReadExcel;

public class runnerTest extends BasePage
{
	@Test(dataProvider = "UserData", dataProviderClass = ReadExcel.class)
	public void testcase(String fn, String mn, String ln)
	{
		db.PimBtn();//click on PIM button from Dashboard
		pim.addEmpBtn();//click on addEmp button
		pim.enterFnTf(fn);
		pim.enterMnTf(mn);
		pim.enterLnTf(ln);
		pim.saveBtn();//click on save button
		System.out.println("Runner");
	}

}
