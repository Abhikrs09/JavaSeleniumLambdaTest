package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonData;
import utilities.elementsUtils;

public class dynamicDataLoading {
	
	public WebDriver driver;
	public elementsUtils elemUtils;
	
	public dynamicDataLoading(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elemUtils = new elementsUtils(driver);
    }
	
	@FindBy(xpath = "//button[text()='Get Random User']")
	private WebElement btnGetRandomData;
	
	@FindBy(css = "div#loading>img")
	private WebElement image;
	
	@FindBy (xpath = "//h1[text()='Dynamic Data Loading']")
	private WebElement titleDynamicDataLoadingPage;
	
	public boolean isTitleDisplayed() {
		return elemUtils.displayStatusOfElement(titleDynamicDataLoadingPage, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public boolean isImageDisplayed() {
		return elemUtils.displayStatusOfElement(image, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickbtnGetRandomData() {
		elemUtils.clickOnElement(btnGetRandomData, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}

}
