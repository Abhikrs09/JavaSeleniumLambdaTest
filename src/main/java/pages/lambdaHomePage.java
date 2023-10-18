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
