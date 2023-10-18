package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.basePage;
import pages.checkBoxPage;
import pages.lambdaHomePage;



public class testCheckboxPage extends basePage {

public static Logger logger = LogManager.getLogger(testCheckboxPage.class);
	
	@Test
	public void SingleCheckBoxDemo() {
		
		lambdaHomePage lhp = new lambdaHomePage(driver);
		checkBoxPage  cbp = new checkBoxPage(driver);
		
		
		logger.info("----- Verifying the funcationality of SingleCheckBoxDemo -----");
		
		
		lhp.clickOnBtnChechbox();
		Assert.assertTrue(cbp.isCheckboxTitleDisplayed());
		
		cbp.clicksingleCheckbtn();
		
		Assert.assertTrue(cbp.isOutputClicksingleCheckbtnDisplayed());
		


	}
	
	@Test
	public void DisableCheckBoxDemo() {
		
		logger.info("----- Verifying the funcationality of DisableCheckBoxDemo -----");
		
		
		lambdaHomePage lhp = new lambdaHomePage(driver);
		checkBoxPage  cbp = new checkBoxPage(driver);
		
		lhp.clickOnBtnChechbox();
		cbp.clickdisCheckopt1();
		cbp.clickdisCheckopt2();
		
		Assert.assertTrue(cbp.isdisCheckopt1Enabled());
		
		
		Assert.assertTrue(cbp.isdisCheckopt3Enabled());
		
		Assert.assertTrue(cbp.isdisCheckopt4Enabled());
		
		Assert.assertTrue(cbp.isdisCheckopt2Selected());
		

	}
	
	@Test
	public void MutlipleCheckBox() {
		
		logger.info("----- Verifying the funcationality of MutlipleCheckBox -----");
		
		
		lambdaHomePage lhp = new lambdaHomePage(driver);
		checkBoxPage  cbp = new checkBoxPage(driver);
		
		lhp.clickOnBtnChechbox();
		
		Assert.assertEquals(false,cbp.isbtnCheckAllOpt2Selected());
		
		cbp.clickbtnCheckAll();
		Assert.assertTrue(cbp.isbtnCheckAllOpt2Selected());
	
		cbp.clickBtnCheckAllOpt2();

		Assert.assertEquals(false,cbp.isbtnCheckAllOpt2Selected());
	}
	
	

	
}
