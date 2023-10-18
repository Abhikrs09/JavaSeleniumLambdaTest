package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.CommonData;
import utilities.elementsUtils;

public class dropDownSearchDemoPage {
	
	public WebDriver driver;
	public elementsUtils elemUtils;
	
	public dropDownSearchDemoPage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
        elemUtils = new elementsUtils(driver);
	}
	
	@FindBy (xpath ="//h1[text()='Jquery Dropdown Search Demo']")
	private WebElement dropDownTitle;
	
	@FindBy (xpath = "(//span[@class='selection']//span)[1]")
	private WebElement ddSelectCountry;
	
	@FindBy (xpath  = "//input[@placeholder='Select state(s)']")
	private WebElement ddSelectState;
	
	@FindBy (xpath ="(//span[@class='select2-selection__rendered'])[2]")
	private WebElement ddSelectCountryWithDisVal;
	
	@FindBy (xpath = "//select[contains(@class,'form-control border')]")
	private WebElement ddSelectFile;
	
	@FindBy (xpath = "//li[text()='Hong Kong']" )
	private WebElement country;
	
	
	
	public void selectCountryByName(String countryName) {
	    String xpath = String.format("//li[text()='%s']", countryName);
	    WebElement country = driver.findElement(By.xpath(xpath));
	    elemUtils.clickOnElement(country, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public boolean isDisplayeddropDownTitle() {
		return elemUtils.displayStatusOfElement(dropDownTitle,CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickddSelectCountry() {
		elemUtils.clickOnElement(ddSelectCountry, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickSelectCountry() {
		elemUtils.clickOnElement(country, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public String getCountry() {
		return elemUtils.getTextFromElement(ddSelectCountry,CommonData.EXPLICIT_WAIT_BASIC_TIME );
	}
	
	
	public void selectFromddSelectFile(String Files) {
		
		Select select = new Select(ddSelectFile);
		select.selectByVisibleText(Files);
		WebElement selectedOption = select.getFirstSelectedOption();
        String selectedText = selectedOption.getText();
        System.out.println(selectedText);
	}
	
	public void clickddSelectState() {
		elemUtils.clickOnElement(ddSelectState,CommonData.EXPLICIT_WAIT_BASIC_TIME );
		
	}
	
	public void selectStateByName(String stateName) {
	    String xpath = String.format("//li[text()='%s']", stateName);
	    WebElement state = driver.findElement(By.xpath(xpath));
	    elemUtils.clickOnElement(state, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public String getState() {
		return elemUtils.getTextFromElement(ddSelectState,CommonData.EXPLICIT_WAIT_BASIC_TIME );
	}
	
	
	
}
