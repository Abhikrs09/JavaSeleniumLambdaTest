package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonData;
import utilities.elementsUtils;

public class datePickerPage {
	
	public WebDriver driver;
	public elementsUtils elemUtils;
	
	public datePickerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elemUtils = new elementsUtils(driver);
    }
	
	
	@FindBy (xpath ="//h1[text()='Bootstrap Date Pickers Demo']")
	private WebElement titleDatePickerpage;
	
	@FindBy (xpath = "//input[@placeholder='Start date']  ")
	private WebElement dateStart;
	
	@FindBy (xpath ="//input[@placeholder='End date']  ")
	private WebElement dateEnd;
	
	@FindBy (xpath = "//th[text()='October 2023']")
	private WebElement currDate;
	
	
	
	public void clickdateStart() {
		elemUtils.clickOnElement(dateStart,  CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickdateEnd() {
		elemUtils.clickOnElement(dateEnd,  CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public boolean isDisplayedTitle() {
		return elemUtils.displayStatusOfElement(titleDatePickerpage, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	
	
}
