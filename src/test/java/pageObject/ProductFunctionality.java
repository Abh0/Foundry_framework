package pageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductFunctionality extends BasePage {

	public ProductFunctionality(WebDriver driver) {

		super(driver);

	}

	@FindBy(xpath = "//span[normalize-space()='Products']")
	WebElement productButtonleftside;

	@FindBy(xpath = "//button[normalize-space()='Add Product']")
	WebElement addProductButton; // click on ADD PRODUCT button on page

	@FindBy(xpath = "//input[@name='productname' and @placeholder='Type Product Name here']")
	WebElement productName;

	@FindBy(xpath = "//textarea[@name='productdescription' and @placeholder='Type Product Description here']")
	WebElement productDescription;

	@FindBy(xpath = "//label[@style='padding: 8px; cursor: pointer;']")
	WebElement addImage; // add image button

	// Action Method
	public void clickOnProductButton() {
		productButtonleftside.click();
	}

	public void clickAddProductButton() {
		Actions act = new Actions(driver);
		act.moveToElement(addProductButton).click().perform();
	}

	public void enterProductName(String pdname) {
		productName.sendKeys(pdname);
	}

	public void enterProductDescription(String pdDescription) {
		productDescription.sendKeys(pdDescription);
	}

	public void clickAddImageButton() {
//		addImage.click();
//		addImage.sendKeys("C:\\Users\\101Reporters\\Documents\\Dummy image\\pd96.jpg");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	}

