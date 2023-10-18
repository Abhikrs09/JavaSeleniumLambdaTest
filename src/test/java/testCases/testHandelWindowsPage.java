package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.basePage;
import pages.handelWindowsPage;
import pages.lambdaHomePage;
import pages.twitterPage;
import utilities.ReadingPropertiesFile;
import utilities.elementsUtils;


public class testHandelWindowsPage extends basePage {

	public static Logger logger = LogManager.getLogger(testHandelWindowsPage.class);


	
	
	@Test
	public void handelTwitterPage() throws InterruptedException {
		
		lambdaHomePage lhp = new lambdaHomePage(driver);
		handelWindowsPage hwp = new handelWindowsPage(driver);
		String username = ReadingPropertiesFile.getProperty("xusername");
		String pass = ReadingPropertiesFile.getProperty("xpass");
		
		
		lhp.clickbtnWindowsHandel();
		hwp.clickbtnFollowTwitter();
		
		 // Switch to the new Twitter popup window
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
        
        
        twitterPage tp = new twitterPage(driver);
        driver.manage().window().maximize();
        
     // Perform the Twitter login action
        tp.clickloginbtn();
        tp.settextUsername(username);
        tp.clickbtnNextUsername();
        elementsUtils.scrollDown(driver, 100);
        
        Assert.assertTrue(tp.setTextPasswordIsDisplayed());
        Assert.assertTrue(tp.settxtPasswordisEnabled());
        
        Thread.sleep(5000);
        
        tp.settxtPassword(pass);
       // tp.clicktxtsetPassword();
        tp.clickbtnLogin();

        // Verify the title of the Twitter popup
        String twitterPopupTitle = driver.getTitle();
        System.out.println("Twitter Popup Title: " + twitterPopupTitle);

        // Close the Twitter popup
        driver.close();

        // Switch back to the main window
        driver.switchTo().window(driver.getWindowHandles().iterator().next());

        // Verify the title of the main window
        String mainPageTitle1 = driver.getTitle();
        System.out.println("Main Page Title: " + mainPageTitle1);

		System.out.println("------------------------------");
		
	}
	
	
}
