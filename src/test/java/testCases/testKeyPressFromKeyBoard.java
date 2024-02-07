package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import basePackage.basePage;
import pages.keyPressPage;
import pages.lambdaHomePage;

public class testKeyPressFromKeyBoard extends basePage {

	public static Logger logger = LogManager.getLogger(testKeyPressFromKeyBoard.class);
	
	@Test
	public void btncheck() {
		
		lambdaHomePage lhp = new lambdaHomePage(driver);
		keyPressPage kpp = new keyPressPage(driver);
		
		
		lhp.clickbtnKeyPress();
		kpp.EntertextFieldEnterKey();
		kpp.printtextResultEnterKey();
		
	}
	
	
}
