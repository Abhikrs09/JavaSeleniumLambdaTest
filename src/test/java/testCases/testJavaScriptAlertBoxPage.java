package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import basePackage.basePage;
import pages.javaScriptAlertBoxPage;
import pages.lambdaHomePage;

public class testJavaScriptAlertBoxPage extends basePage{

	public static Logger logger = LogManager.getLogger(testHandelWindowsPage.class);
	
	@Test
	public void javaScriptAlert() {
		
		lambdaHomePage lhp = new lambdaHomePage(driver);
		javaScriptAlertBoxPage jsa = new javaScriptAlertBoxPage(driver);
		
		lhp.clickbtnJavaScriptAlert();
		jsa.clickbtnJavascriptClickMe();
		String AlertMessage= jsa.AcceptAndPrintAlertBoxMessage();
		System.out.println(AlertMessage);
		
		
		
		
	}
	
	
	
	
	
}
