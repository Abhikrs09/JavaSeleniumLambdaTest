package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonData;
import utilities.elementsUtils;

public class lambdaHomePage {
	
	public WebDriver driver;
	public elementsUtils elemUtils;
	
	public lambdaHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elemUtils = new elementsUtils(driver);
    }

	
	@FindBy(xpath = "//a[contains(text(),'Bootstrap List Box')]")
	private WebElement btnBootstrap;
	
	@FindBy(xpath= "//a[contains(text(),'Key Press')]")
	private WebElement btnKeyPress;
	
	@FindBy (xpath ="//a[contains(text(),'Window Popup Modal')]")
	private WebElement btnWindowsHandel;
	
	@FindBy(xpath = "//a[contains(text(),'Checkbox Demo')]")
	private WebElement btnChechbox;
	
	@FindBy(xpath = "//a[contains(text(),'Drag and Drop')]")
	private WebElement btnDragAndDrop;
	
	@FindBy(xpath = "//a[contains(text(),'Radio Buttons Demo')]")
	private WebElement btnRadio;
	
	@FindBy (xpath = "//a[contains(text(),'Window Popup Modal')]")
	private WebElement btnPopUp;
	
	@FindBy (xpath = "//a[contains(text(),'Input Form Submit')]")
	private WebElement btnInputForm;
	
	@FindBy (xpath = "//a[contains(text(),'Drag & Drop Sliders')]")
	private WebElement btnDragAndDropSlider;
	
	@FindBy (xpath = "//a[contains(text(),'JQuery Select dropdown')]")
	private WebElement btnDropDown;
	
	@FindBy(xpath ="//a[contains(text(),'Bootstrap Date Picker')]")
	private WebElement btnDatePicker;
	
	@FindBy (xpath = "//a[contains(text(),'Dynamic Data Loading')]")
	private WebElement btnDynamicDataLoading;
	
	@FindBy(xpath = "//a[contains(text(),'Javascript Alerts')]")
	private WebElement btnJavaScriptAlert;
	
	
	
	public void clickbtnKeyPress() {
		elemUtils.clickOnElement(btnKeyPress, CommonData.EXPLICIT_WAIT_BASIC_TIME);
		}
	
	
	
	public void clickbtnJavaScriptAlert() {
		elemUtils.clickOnElement(btnJavaScriptAlert, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	
	public void clickbtnDynamicDataLoading() {
		elemUtils.clickOnElement(btnDynamicDataLoading, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void cilckbtnDatePicker() {
		elemUtils.clickOnElement(btnDatePicker, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public  void clickbtnWindowsHandel() {
		elemUtils.clickOnElement(btnWindowsHandel, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickbtnDropDown() {
		elemUtils.clickOnElement(btnDropDown,CommonData.EXPLICIT_WAIT_BASIC_TIME );
	}
	
	
	public void clickbtnDragAndDropSlider() {
		elemUtils.clickOnElement(btnDragAndDropSlider,CommonData.EXPLICIT_WAIT_BASIC_TIME );
	}

	public void clickonBtnBootstrap() {
		
		elemUtils.clickOnElement(btnBootstrap, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickOnBtnChechbox() {
		elemUtils.clickOnElement(btnChechbox,CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickonBtnRaddio() {
		
		elemUtils.clickOnElement(btnRadio, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	
	public void clickBtnDragAndDrop() {
		elemUtils.clickOnElement(btnDragAndDrop,CommonData.EXPLICIT_WAIT_BASIC_TIME );
	}
	
	
	public void clickBtnPopup() {
		elemUtils.clickOnElement(btnPopUp, CommonData.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void clickBtninput() {
		elemUtils.clickOnElement(btnInputForm,CommonData.EXPLICIT_WAIT_BASIC_TIME );
	}
}
