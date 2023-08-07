package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {

	public WelcomePage(WebDriver driver) {
		super(driver);

	}

	// Elements identifier on get free demo page

	@CacheLookup

	@FindBy(xpath = "//input[@placeholder='Enter your full name' and @name='name']")
	WebElement txtFullName; // full name textbox

	@FindBy(xpath = "//input[@placeholder='Enter your email id' and @name='email']")
	WebElement txtEmailId; // email id textbox

	@FindBy(xpath = "//input[@placeholder='Enter your phone number' and @name='contact']")
	WebElement txtPhoneNumber; // phone number textbox

	@FindBy(xpath = "//input[@placeholder='Enter your store name' and @name='storename']")
	WebElement txtStoreName; // store name textbox

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiLoadingButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1feinxp' and @type='submit']")
	WebElement btnGetDemo; // get demo submit button

	// Action method

	public void enterFullName(String fname) {
		txtFullName.sendKeys(fname);
	}

	public void enterEmailId(String emailid) {
		txtEmailId.sendKeys(emailid);
	}

	public void enterPhoneNumber(String phonenumber) {
		txtPhoneNumber.sendKeys(phonenumber);
	}

	public void enterStoreName(String stname) {
		txtStoreName.sendKeys(stname);
	}

	public void clickGetDemobtn() {
		btnGetDemo.click();
		// btnGetDemo.submit();
	}

}
