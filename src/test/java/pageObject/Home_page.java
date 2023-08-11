package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Home_page extends BasePage {

	public Home_page(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-kav5qw']") 
	WebElement SignIn;

	// Action method

	public void clickSignIn() {	
		SignIn.click();

	}

}
