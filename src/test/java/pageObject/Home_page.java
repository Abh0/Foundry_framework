package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Home_page extends BasePage {

	public Home_page(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "//button[normalize-space()='Sign In']")
	WebElement SignIn;

	// Action method

	public void clickSignIn() {	
		SignIn.click();

	}

}
