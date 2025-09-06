package com.orangehrm.runnerscripts;

import org.testng.annotations.Test;

import com.orangehrm.genricscripts.BasePage;

public class TestRunnerToClear extends BasePage
{
	@Test
	
	public void testcase2() throws Exception
	{
		db.PimBtn();//click on PIM button from Dashboard
		pim.addEmpBtn();//click on addEmp button
		pim.enterFnTf("FirstEmployee");
		System.out.println("Entered FN");
		Thread.sleep(3000);
		pim.clearFnTf();
		System.out.println("Cleared FN");
		pim.enterMnTf("FirstEmployeeMiddlename");
		Thread.sleep(3000);
		pim.clearMnTf();
		pim.enterLnTf("FirstEmployeeLastname");
		Thread.sleep(3000);
		pim.clearLnTf();
		System.out.println("Runner");
	}

}
