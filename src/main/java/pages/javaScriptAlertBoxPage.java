package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.elementsUtils;
import utilities.CommonData;

public class javaScriptAlertBoxPage{

	public WebDriver driver;
	public elementsUtils elemUtils;
	
	public javaScriptAlertBoxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elemUtils = new elementsUtils(driver);
    }
	
	@FindBy(xpath ="//h1[text()='Javascript Alert Box Demo']")
	private WebElement title;
	
	@FindBy(xpath ="(//button[text()='Click Me'])[1]")
	private WebElement btnJavascriptClickMe;
	
	@FindBy(xpath ="(//button[text()='Click Me'])[2]")
	private WebElement btnConfirmBoxClickMe;
	
	@FindBy( xpath ="(//button[text()='Click Me'])[3]")
	private WebElement btnPromptBoxClickMe;
	
	@FindBy(css ="#confirm-demo")
	private WebElement textConfirmBoxMessage;
	
	@FindBy(css ="#prompt-demo")
	private WebElement textPromptBoxMessage;
	
	
	public String AcceptAndPrintAlertBoxMessage() {
		elemUtils.acceptAlert();
		return elemUtils.getAlertText();
    }
	
	
	public void clickbtnJavascriptClickMe() {
		elemUtils.clickOnElement(btnJavascriptClickMe, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	
	
}
