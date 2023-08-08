package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Application_Sign_inPage extends BasePage {

	public Application_Sign_inPage(WebDriver driver) {
		super(driver);

	}

	// Elements locators SignIn page email id ,password and login button
	// enter email id

	@FindBy(xpath = "//input[@id=':r0:']")
	WebElement txtLoginEmailid;
	// enter password
	@FindBy(xpath = "//input[@id=':r1:']")
	WebElement txtPassword;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-yhhqw6']")
	WebElement btnLogin;

	// click on profile button link

	@FindBy(xpath = "//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-154ogbs']")
	WebElement btnProfile;
	
	// click on logout button
	@FindBy(xpath = "//li[@role='menuitem']")
	WebElement btnLogout;

	// Action method
	public void enterEmailId(String useremail) {
		txtLoginEmailid.sendKeys(useremail);
	}

	public void enterPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickOnLoginbtn() {
		btnLogin.click();
	}

	public void clickOnProfilebtn() {
		btnProfile.click();
	}

	public void clickOnLogoutbtn() {
		btnLogout.click();
	}

}
