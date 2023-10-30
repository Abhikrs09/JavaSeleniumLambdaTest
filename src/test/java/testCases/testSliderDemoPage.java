package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.basePage;
import pages.lambdaHomePage;
import pages.sliderDemoPage;

public class testSliderDemoPage extends basePage {

	public static Logger logger = LogManager.getLogger(testSliderDemoPage.class);

	@Test
	public void testSlider() {
	    lambdaHomePage lhp = new lambdaHomePage(driver);
	    sliderDemoPage sdp = new sliderDemoPage(driver);
	    
	    logger.info("----- Verifying the functionality of testSlider -----");
		
	    lhp.clickbtnDragAndDropSlider();
	    Assert.assertTrue(sdp.isSlider1Displayed());
	    sdp.Slider2Movement();
	    
	}
	
}
