package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.basePage;
import pages.datePickerPage;
import pages.dragAndDropPage;
import pages.lambdaHomePage;
import utilities.elementsUtils;


public class testDragAndDrop extends basePage {

	
	public static Logger logger = LogManager.getLogger(testCheckboxPage.class);
	
	@Test
	public void dragAndDropDemo1() {
		
		logger.info("----- Testing the functionality of testDragAndDrop1 -----");
		
		lambdaHomePage lhp = new lambdaHomePage(driver);
		dragAndDropPage dad = new dragAndDropPage(driver);
		
		lhp.clickBtnDragAndDrop();
		
		logger.info("----- Asserting that all the drop down are displayed or not -----");
		Assert.assertTrue(dad.drag1IsDisplayed());
		Assert.assertTrue(dad.drag2IsDisplayed());
		
		dad.performDragAndDrop1();
		dad.performDragAndDrop2();
		
		logger.info("----- Verifying that the drag and drop operation happens correctly or not -----");
		Assert.assertTrue(dad.dragged1IsDisplayed());
		Assert.assertTrue(dad.dragged2IsDisplayed());
		
	}
	
	@Test
	public void dragAndDropDemo2(){
		
		logger.info("----- Testing the functionality of testDragAndDrop2 -----");
		
		lambdaHomePage lhp = new lambdaHomePage(driver);
		dragAndDropPage dad = new dragAndDropPage(driver);
		
		lhp.clickBtnDragAndDrop();
		elementsUtils.scrollDown(driver, 200);
		dad.performDragAndDrop3();
		
		logger.info("----- Verifying that the drag and drop operation happens correctly or not -----");
		Assert.assertTrue(dad.isDisplayeddraggedorNot());
		
	}
	
	
	
	
}
