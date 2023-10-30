package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.basePage;
import pages.dropDownSearchDemoPage;
import pages.lambdaHomePage;
import utilities.ReadingPropertiesFile;
import utilities.elementsUtils;

public class testDropDownSearchDemoPage  extends basePage{
	
	public static Logger logger = LogManager.getLogger(testCheckboxPage.class);
	
	
	@Test
	public void SelectFile() {
		
		logger.info("----- Verifying the SelectFile test -----");
		
		String files = ReadingPropertiesFile.getProperty("files");
		
		lambdaHomePage lhp = new lambdaHomePage(driver);
		dropDownSearchDemoPage dds = new dropDownSearchDemoPage(driver);
		
		lhp.clickbtnDropDown();
		
		logger.info("----- Verifying DropDown titile has been displayed or not  -----");
		Assert.assertTrue(dds.isDisplayeddropDownTitle());
		elementsUtils.scrollDown(driver, 500);
		logger.info("----- Select the file  -----");
		dds.selectFromddSelectFile(files);
		
		
	}
	
	@Test
	public void SelectCountry() {
		
		logger.info("----- Verifying the SelectCountry test -----");

        lambdaHomePage lhp = new lambdaHomePage(driver);
        dropDownSearchDemoPage dds = new dropDownSearchDemoPage(driver);
        
        logger.info("----- Reading country from properties file -----");
        String country = ReadingPropertiesFile.getProperty("country");
        lhp.clickbtnDropDown();
        dds.clickddSelectCountry();
        dds.selectCountryByName(country);
        logger.info("----- Verifying the input and output country is matching or not -----");
        Assert.assertEquals(country, dds.getCountry());
    
	
		}
	
	
	@Test
	public void SelectState() {
		
		logger.info("----- Verifying the SelectState test -----");
		
		lambdaHomePage lhp = new lambdaHomePage(driver);
		dropDownSearchDemoPage dds = new dropDownSearchDemoPage(driver);
		
		lhp.clickbtnDropDown();
		dds.clickddSelectState();
		dds.selectStateByName("Alaska");
		//dds.clickddSelectState();
		//dds.selectStateByName("Arkansas");
		//System.out.println(dds.getState());		
		
	}
	
	

	

}
