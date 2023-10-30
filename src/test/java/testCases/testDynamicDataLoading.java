package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.basePage;
import pages.dynamicDataLoading;
import pages.lambdaHomePage;

public class testDynamicDataLoading extends basePage{

	
	public static Logger logger = LogManager.getLogger(testDynamicDataLoading.class);
	
	
	@Test
	public void DataIsLoaded() {
		
		lambdaHomePage lhp = new lambdaHomePage(driver);
		dynamicDataLoading ddl = new dynamicDataLoading(driver);
		
		lhp.clickbtnDynamicDataLoading();
		Assert.assertTrue(ddl.isTitleDisplayed());
		
		ddl.clickbtnGetRandomData();
		Assert.assertTrue(ddl.isImageDisplayed());
	}
	
}
