package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerFunctionality extends BasePage {

	
	public CustomerFunctionality(WebDriver driver) 
	{
		super(driver);
		
		}
	
	
	@FindBy(xpath = "//span[normalize-space()='Customers']")
	WebElement customerButton;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-63ug8l']")
	WebElement createCustomerbtn;
	
	@FindBy (xpath = "//input[@name='name']")
	WebElement customerName;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement customerEmail;
	
	@FindBy(xpath = "//input[@name='contactnumber' and @type='text']")
	WebElement customerContactNumber;
	
	@FindBy(xpath = "//input[@name='house' and @type='text']")
	WebElement houseAdd;
	 

	
	@FindBy(xpath = "//textarea[@name='address']")
	WebElement customeraddress;
	
	@FindBy(xpath = "//input[@name='pincode']")
	WebElement pincode;
	
	@FindBy(xpath = "//input[@name='contactnumber' and @type='number']")
	WebElement delnumber;
	
	@FindBy(xpath = "//button[@type='button' and @class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1m8uuvh']")
	WebElement saveButton;
	
	public void clickCustomerButton() {
		customerButton.click();
	}
	
	public void clickCreatecustomerButton() {
		createCustomerbtn.click();
	}
	
	public void enterCustomerName(String cuName) {
		customerName.sendKeys(cuName);
	}
	
	public void enterCustomerEmail(String cuEmail) {
		customerEmail.sendKeys(cuEmail);
	}
	
	public void enterContactNumber (String contactno) {
		customerContactNumber.sendKeys(contactno);
		
	}
	public void enterHouseNumber(String hno) {
		houseAdd.sendKeys(hno);
	}
	
	public void enterAddress(String cAdd) {
		customeraddress.sendKeys(cAdd);
	}
	public void enterPincode(String pin) {
		pincode.sendKeys(pin);	
	}
	public void enterDeliveryNumber(String del) {
		delnumber.sendKeys(del);
	}
	public void clickSaveButton () {
		saveButton.click();
	}
	
	
}
