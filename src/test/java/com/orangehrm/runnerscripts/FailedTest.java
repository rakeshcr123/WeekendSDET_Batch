package com.orangehrm.runnerscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.genricscripts.BasePage;
import com.orangehrm.utilities.ReadExcel;

public class FailedTest extends BasePage
{
	@Test(dataProvider = "UserData", dataProviderClass = ReadExcel.class)
	public void createEmployee()
	{
		db.PimBtn();//click on PIM button from Dashboard
		pim.addEmpBtn();//click on addEmp button
		pim.enterFnTf("Rakesh");
		pim.enterMnTf("Chattanahalli");
		pim.enterLnTf("Tarikere");
		pim.saveBtn();//click on save button
		System.out.println("Runner");
		Assert.fail();
	}

}
