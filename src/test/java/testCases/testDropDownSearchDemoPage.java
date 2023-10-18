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
		
		String files = ReadingPropertiesFile.getProperty("files");
		lambdaHomePage lhp = new lambdaHomePage(driver);
		dropDownSearchDemoPage dds = new dropDownSearchDemoPage(driver);
		lhp.clickbtnDropDown();
		Assert.assertTrue(dds.isDisplayeddropDownTitle());
		elementsUtils.scrollDown(driver, 500);
		dds.selectFromddSelectFile(files);
		
		
	}
	
	@Test
	public void SelectCountry() {
		
		
		lambdaHomePage lhp = new lambdaHomePage(driver);
		dropDownSearchDemoPage dds = new dropDownSearchDemoPage(driver);
		String country = ReadingPropertiesFile.getProperty("country");
		lhp.clickbtnDropDown();
		dds.clickddSelectCountry();
		dds.selectCountryByName(country);
		Assert.assertEquals(country, dds.getCountry());
	
		}
	
	
	@Test
	public void SelectState() {
		
		lambdaHomePage lhp = new lambdaHomePage(driver);
		dropDownSearchDemoPage dds = new dropDownSearchDemoPage(driver);
		lhp.clickbtnDropDown();
		dds.clickddSelectState();
		dds.selectStateByName("Alaska");
		//dds.clickddSelectState();
		//dds.selectStateByName("Arkansas");
		//System.out.println(dds.getState());		
		
	}
	
	
//	@Test 
//	public void test1() {
//		
//		lambdaHomePage lhp = new lambdaHomePage(driver);
//		dropDownSearchDemoPage dds = new dropDownSearchDemoPage(driver);
//		lhp.clickbtnDropDown();
//		WebElement dropdown = driver.findElement(By.xpath("//input[@placeholder='Select state(s)']"));
//
//        // Initialize a Select object
//        Select select = new Select(dropdown);
//
//        // Hold down the Control key (Ctrl) to select multiple options
//        // Select "New York"
//        select.selectByVisibleText("New York");
//
//        // Hold down the Control key (Ctrl) to select multiple options
//        // Select "Ohio"
//        select.selectByVisibleText("Ohio");
//
//        // Perform any necessary actions with the selected options
//        // For example, you can print the selected options
//                                     

	//}
	

}
