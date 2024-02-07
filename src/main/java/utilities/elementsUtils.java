package utilities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class elementsUtils {
	
	WebDriver driver;
	
	
	public elementsUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement WaitForElement(WebElement element, long durationInSecond) {
		WebElement webElement = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSecond));
			webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
			
		}catch(Throwable e) 
		{
			e.printStackTrace();
		}
		return webElement;
	}
	
	
	public String getTextFromElement (WebElement element, long durationInSeconds ) {
		WebElement webElement = WaitForElement(element,durationInSeconds);
		return webElement.getText();
	}
	
public void typeTextIntoElement(WebElement element,String textToBeTyped,long durationInSeconds) {
		
		WebElement webElement = WaitForElement(element,durationInSeconds);
		webElement.click();
		webElement.clear();
		webElement.sendKeys(textToBeTyped);
		
	}

public void typeTextFromKeyBoard(WebElement element,Keys textToBeTyped,long durationInSeconds) {
	WebElement webElement = WaitForElement(element,durationInSeconds);
	webElement.click();
	webElement.sendKeys(textToBeTyped);
}


public void clickOnElement(WebElement element,long durationInSeconds) {
	
	WebElement webElement = WaitForElement(element,durationInSeconds);
	webElement.click();
	
}

public WebElement waitForVisibilityOfElement(WebElement element,long durationInSeconds) {
	
	WebElement webElement = null;
	
	try {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		webElement = wait.until(ExpectedConditions.visibilityOf(element));
	}catch(Throwable e) {
		e.printStackTrace();
	}
	
	return webElement;
	
}


public boolean displayStatusOfElement(WebElement element,long durationInSeconds) {
	
	try {
		WebElement webElement = waitForVisibilityOfElement(element,durationInSeconds);
		return webElement.isDisplayed();
	}catch(Throwable e) {
		return false;
	}
	
	
	
}

public boolean isElementEnabled(WebElement element,long durationInSeconds) {
	boolean elementEnabled;
	WebElement webElement = WaitForElement(element,durationInSeconds);
	elementEnabled = webElement.isEnabled();
	return elementEnabled;
	
}

public boolean isElementClicked(WebElement element,long durationInSeconds) {
	boolean elementEnabled;
	WebElement webElement = WaitForElement(element,durationInSeconds);
	elementEnabled = webElement.isSelected();
	return elementEnabled;
	
}


public static void scrollDown(WebDriver driver, int pixels) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, " + pixels + ")");
}

public void acceptAlert() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.alertIsPresent());
    Alert alert = driver.switchTo().alert();
    alert.accept();
}

public String getAlertText() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.alertIsPresent());
    Alert alert = driver.switchTo().alert();
    return alert.getText();
}


}

